package com.gch.choose.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.choose.service.admin.CourseService;
import com.gch.choose.service.admin.StudentService;
import com.gch.choose.service.admin.TeacherService;

@Controller
public class TeacherController {
	@Autowired
	private CourseService courseService;
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@RequestMapping(value="/teacher/lookCourse")
	public String lookCourse(HttpSession session){
		IcTeacher tea = (IcTeacher) session.getAttribute("icTeacher");
		List<IcCourse> allCourse=courseService.selectTeaCourse(tea.getTea_id());	
		session.setAttribute("course", allCourse);
		return "teacher/index";
	}
	@RequestMapping(value="/teacher/lookStudent.action")
	public @ResponseBody
	List<IcStudent> lookStudent(Long id,HttpSession session){
		IcTeacher tea = (IcTeacher) session.getAttribute("icTeacher");
		 IcCourse cou = courseService.selectIcCourseById(id);
		 List<IcStudent> students = studentService.selectAllStudentByCTid(tea,cou);	
		 return students;
	}
	@RequestMapping(value="/teacher/writeGrade.action")
	public String lookStudentGrade(Long id,HttpSession session){
		IcTeacher tea = (IcTeacher) session.getAttribute("icTeacher");
		IcCourse cou = courseService.selectIcCourseById(id);
		List<IcStudentCourse> isc=studentService.selectNeedGrade(tea,cou);
		session.setAttribute("isc", isc);
		
		return "teacher/grade";
	}
	@RequestMapping(value="/teacher/saveGrade.action")
	public  String saveGrade(QueryVo vo ){
		studentService.updateByIscId(vo);
		return "redirect:/teacher/writeGrade.action?id="+vo.getCourseId();
	}
	@RequestMapping(value="/teacher/applyCourse.action")
	public String applyCourse(IcCourse ic,HttpSession session){
		IcTeacher tea = (IcTeacher) session.getAttribute("icTeacher");
		courseService.insertApplyCourse(tea,ic);
		return "redirect:/teacher/lookApplyCourse.action";
	}
	@RequestMapping(value="/teacher/lookApplyCourse.action")
	public String lookApplyCourse(HttpSession session,Model model){ 
		IcTeacher tea = (IcTeacher) session.getAttribute("icTeacher");
		List<IcCourse> cou=courseService.selectAllCourseByState(tea);
		model.addAttribute("cou", cou);
		return "teacher/apply";
	}
	@RequestMapping(value="/teacher/teacherPersonal.action")
	public String lookTeacherMessage(HttpSession session){
		IcTeacher tea = (IcTeacher) session.getAttribute("icTeacher");
		IcTeacher obj = teacherService.selectIcTeacherById(tea.getTea_id());
		session.setAttribute("obj", obj);
		return "teacher/personal";
	}
	@RequestMapping(value="/teacher/updateTeacher.action")
	public String updateTeacher(IcTeacher icteacher,HttpSession session){
		IcTeacher tea = (IcTeacher) session.getAttribute("icTeacher");
		icteacher.setTea_id(tea.getTea_id());
		teacherService.updateIcTeacherById(icteacher);
		return "redirect:/teacher/teacherPersonal.action";
	}
	@RequestMapping(value="/teacher/checkTeaNumber.action")
	public @ResponseBody
	String checkTeaNumber(String tea_number){
		boolean isExit=true;
		isExit=teacherService.checkUsername(tea_number);
		String json="{\"valid\":"+isExit+"}";
		return json;		
	}
	@RequestMapping(value="/teacher/exit.action")
	public String exit(HttpSession session){
		session.removeAttribute("icTeacher");
		return "forward:/index.jsp";
	}
}
