package com.gch.choose.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
import com.gch.common.utils.Page;


@Controller
public class AdminController {
	@Autowired
	private StudentService studentService;
	@Autowired
	private TeacherService teacherService;
	@Autowired
	private CourseService courseService;
	@RequestMapping(value="/admin/student")
	public String student(QueryVo vo,Model model){
		Page<IcStudent> page=studentService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		model.addAttribute("stuName", vo.getStuName());
		model.addAttribute("stuNumber", vo.getStuNumber());
		return "admin/student";
	}
	@RequestMapping(value="/admin/student/insert")
	public String insertStudent(IcStudent icStudent){
		studentService.insertStudent(icStudent);
		return "redirect:/admin/student.action";
	}
	
	@RequestMapping(value="/admin/student/edit")
	public @ResponseBody
	IcStudent editStudent(Long id){
		return studentService.selectIcStudentById(id);
	}
	@RequestMapping(value="admin/student/update")
	public @ResponseBody
	void updateStudent(IcStudent icStudent){
		studentService.updateIcStudentById(icStudent);
	}
	@RequestMapping(value="admin/student/delete")
	public @ResponseBody
	void deleteStudent(Long id){
		studentService.deleteIcStudentById(id);
	}
	
	
	@RequestMapping(value="/admin/teacher")
	public String teacher(QueryVo vo,Model model){
		Page<IcTeacher> page=teacherService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		model.addAttribute("teaName", vo.getTeaName());
		model.addAttribute("teaNumber", vo.getTeaNumber());
		return "admin/teacher";
	}
	@RequestMapping(value="/admin/teacher/insert")
	public String insertTeacher(IcTeacher icTeacher){
		teacherService.insertTeacher(icTeacher);
		return "redirect:/admin/teacher.action";
	}
	@RequestMapping(value="/admin/teacher/edit")
	public @ResponseBody
	IcTeacher editTeacher(Long id){
		return teacherService.selectIcTeacherById(id);
	}
	@RequestMapping(value="admin/teacher/update")
	public @ResponseBody
	void updateTeacher(IcTeacher icTeacher){
		teacherService.updateIcTeacherById(icTeacher);
	}
	@RequestMapping(value="admin/teacher/delete")
	public @ResponseBody
	void deleteTeacher(Long id){
		teacherService.deleteTeacherById(id);
	}
	
	 @RequestMapping(value="admin/course")
	 public String Course(QueryVo vo,Model model){
		 List<IcTeacher> teacherName = teacherService.selectTeacherName();
		  model.addAttribute("teacherType", teacherName);
		 Page<IcCourse> page = courseService.selectPageByQueryVo(vo);
		 model.addAttribute("page", page);
		 model.addAttribute("courseName", vo.getCourseName());
		 return "admin/course";
	 }
	 @RequestMapping(value="/admin/course/chooseResult")
	 public String chooseResult(QueryVo vo,Model model){
		 Page<IcStudentCourse> page=studentService.selectChooseResultByQueryVo(vo);		
		 model.addAttribute("page", page);				
		 model.addAttribute("stuNumber", vo.getStuNumber());
		 model.addAttribute("teaName", vo.getTeaName());
		 model.addAttribute("courseName", vo.getCourseName());
		 return "admin/chooseResult";
	 }
	@RequestMapping(value="/admin/course/insert")
	public String insertCourse(IcCourse icCourse){	  
		 courseService.insertCourse(icCourse);
			return "redirect:/admin/course.action";
	}
	@RequestMapping(value="/admin/course/edit")
	public @ResponseBody
	IcCourse editCourse(Long id){
		return courseService.selectIcCourseById(id);
	}
	@RequestMapping(value="/admin/course/update")
	public @ResponseBody
	void updateCourse(IcCourse icCourse){
		courseService.updateIcCourse(icCourse);
	}
	@RequestMapping(value="/admin/course/delete")
	public @ResponseBody
	void deleteCourse(Long id){
		courseService.deleteCourse(id);
	}
	@RequestMapping(value="/admin/course/nowAgreeCourse")
	public String nowAgreeCourse(Model model){
		List<IcCourse> cou=courseService.selectAllStateNullCourse();
		model.addAttribute("cou", cou);
		return "admin/applyCourse";
	}	
	@RequestMapping(value="admin/course/agreeCourse")
	public String agreeCourse(Long id){
		IcCourse cou = courseService.selectIcCourseById(id);
		cou.setCourseState("1");
		courseService.updateIcCourse(cou);
		return "redirect:/admin/course/nowAgreeCourse";
	}
	@RequestMapping(value="admin/course/refuseCourse")
	public String refuseCourse(Long id){
			courseService.deleteCourse(id);		
		return "redirect:/admin/course/nowAgreeCourse";		
	}
	//管理员退出
	@RequestMapping(value="exit")
	public String exit(HttpSession session){
		session.removeAttribute("icman");
		return "forward:index.jsp";
	}	
	//检验教室是否重复
	@RequestMapping(value="/course/checkClassRoom")
	public @ResponseBody
	String checkClassRoom(String courseClassroom){
		boolean isExit=true;
		isExit=courseService.checkUsername(courseClassroom);
		String json="{\"valid\":"+isExit+"}";
		return json;
	}
	
}
