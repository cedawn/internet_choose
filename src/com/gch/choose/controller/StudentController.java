package com.gch.choose.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.QueryVo;
import com.gch.choose.service.admin.CourseService;
import com.gch.choose.service.admin.StudentService;
import com.gch.common.utils.Page;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private CourseService courseService;
	
	@RequestMapping(value="/student/choose")
	public String chooseView(QueryVo vo,Model model,HttpSession session){
		Page<IcCourse> page=courseService.selectAllCourse(vo);
		model.addAttribute("page", page);
		IcStudent obj = (IcStudent) session.getAttribute("icStudent");
		
		List<IcStudentCourse> icStuCou=studentService.selectAllCourseByStuId(obj.getStu_id());
		session.setAttribute("icStuCou",icStuCou);
		return "student/choose";
	}
	
	@RequestMapping(value="/student/choose/course.action")
	public String chooseCourse(Long c_id,Long s_id,HttpSession session){
		IcStudent student = studentService.selectIcStudentById(s_id);
		IcCourse course = courseService.selectIcCourseById(c_id);
		studentService.insertChooseCourse(course,student);
		
		/*List<IcStudentCourse> icStuCou=studentService.selectAllCourseByStuId(s_id);
		System.out.println(icStuCou);
		for(IcStudentCourse icStudentCourse : icStuCou) {
			for(IcStudent icstudent:icStudentCourse.getStudent()){
				System.out.println(icstudent.getCourses().getCourseName());
				System.out.println(icstudent.getCourses().getCourseCredit());
				System.out.println(icstudent.getCourses().getIcteacher().getTea_name());
			}
		}
		
		session.setAttribute("icStuCou",icStuCou);*/
		
		return "redirect:/student/choose";
	}
	
	@RequestMapping(value="/student/choose/deletecourse.action")
	public @ResponseBody
	void deleteCourse(Long b_id){
		IcCourse icCourse = courseService.selectIcCourseById(b_id);
		/*System.out.println(icCourse);*/
		studentService.deleteISCById(b_id);
		
	}
	
	@RequestMapping(value="/student/lookgrade.action")
	public String lookAllGrade(HttpSession session){
        IcStudent obj = (IcStudent) session.getAttribute("icStudent");
		
		List<IcStudentCourse> icStuCou=studentService.selectAllCourseByStuId(obj.getStu_id());
		session.setAttribute("icStuCou",icStuCou);
		return "student/lookgrade";
	}
	@RequestMapping(value="/student/showMyself.action")
	public String lookStudentSelf(HttpSession session){
        IcStudent ics = (IcStudent) session.getAttribute("icStudent");
		
		IcStudent obj = studentService.selectIcStudentById(ics.getStu_id());
		session.setAttribute("obj",obj);
		return "student/personal";
	}
	@RequestMapping(value="/student/updateStudent.action")
	public String updateStudent(IcStudent icstudent,HttpSession session){
		IcStudent obj= (IcStudent) session.getAttribute("icStudent");
		icstudent.setStu_id(obj.getStu_id());
		studentService.updateIcStudentById(icstudent);
		return "redirect:/student/showMyself.action";
	}
	@RequestMapping(value="/student/checkStuNumber.action")
	public @ResponseBody
	String checkTeaNumber(String stu_number){
		boolean isExit=true;
		isExit=studentService.checkUsername(stu_number);
		String json="{\"valid\":"+isExit+"}";
		return json;
		
	}
	@RequestMapping(value="/student/exit.action")
	public String exit(HttpSession session){
		session.removeAttribute("icStudent");
		return "forward:/index.jsp";
	}
}
