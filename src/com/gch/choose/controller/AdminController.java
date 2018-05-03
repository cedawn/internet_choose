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
	@RequestMapping(value="/admin/student.action")
	public String student(QueryVo vo,Model model){
		Page<IcStudent> page=studentService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		model.addAttribute("stuName", vo.getStuName());
		model.addAttribute("stuNumber", vo.getStuNumber());
		return "admin/student";
	}
	@RequestMapping(value="/admin/student/insert.action")
	public String insertStudent(IcStudent icStudent){
		studentService.insertStudent(icStudent);
		return "redirect:/admin/student.action";
	}
	
	@RequestMapping(value="/admin/student/edit.action")
	public @ResponseBody
	IcStudent editStudent(Long id){
		return studentService.selectIcStudentById(id);
	}
	@RequestMapping(value="admin/student/update.action")
	public @ResponseBody
	void updateStudent(IcStudent icStudent){
		studentService.updateIcStudentById(icStudent);
	}
	@RequestMapping(value="admin/student/delete.action")
	public @ResponseBody
	void deleteStudent(Long id){
		studentService.deleteIcStudentById(id);
	}
	
	
	@RequestMapping(value="/admin/teacher.action")
	public String teacher(QueryVo vo,Model model){
		Page<IcTeacher> page=teacherService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		model.addAttribute("teaName", vo.getTeaName());
		model.addAttribute("teaNumber", vo.getTeaNumber());
		return "admin/teacher";
	}
	@RequestMapping(value="/admin/teacher/insert.action")
	public String insertTeacher(IcTeacher icTeacher){
		teacherService.insertTeacher(icTeacher);
		return "redirect:/admin/teacher.action";
	}
	@RequestMapping(value="/admin/teacher/edit.action")
	public @ResponseBody
	IcTeacher editTeacher(Long id){
		return teacherService.selectIcTeacherById(id);
	}
	@RequestMapping(value="admin/teacher/update.action")
	public @ResponseBody
	void updateTeacher(IcTeacher icTeacher){
		teacherService.updateIcTeacherById(icTeacher);
	}
	@RequestMapping(value="admin/teacher/delete.action")
	public @ResponseBody
	void deleteTeacher(Long id){
		teacherService.deleteTeacherById(id);
	}
	
	 @RequestMapping(value="admin/course.action")
	 public String Course(QueryVo vo,Model model){
		 List<IcTeacher> teacherName = teacherService.selectTeacherName();
		  model.addAttribute("teacherType", teacherName);
		 Page<IcCourse> page = courseService.selectPageByQueryVo(vo);
		 model.addAttribute("page", page);
		 model.addAttribute("courseName", vo.getCourseName());
		 return "admin/course";
	 }
	@RequestMapping(value="/admin/course/insert.action")
	public String insertCourse(IcCourse icCourse){	  
		 courseService.insertCourse(icCourse);
			return "redirect:/admin/course.action";
	}
	@RequestMapping(value="/admin/course/edit.action")
	public @ResponseBody
	IcCourse editCourse(Long id){
		return courseService.selectIcCourseById(id);
	}
	@RequestMapping(value="/admin/course/update.action")
	public @ResponseBody
	void updateCourse(IcCourse icCourse){
		courseService.updateIcCourse(icCourse);
	}
	@RequestMapping(value="/admin/course/delete.action")
	public @ResponseBody
	void deleteCourse(Long id){
		courseService.deleteCourse(id);
	}
	@RequestMapping(value="/admin/course/nowAgreeCourse.action")
	public String nowAgreeCourse(Model model){
		List<IcCourse> cou=courseService.selectAllStateNullCourse();
		model.addAttribute("cou", cou);
		return "admin/applyCourse";
	}
	
	@RequestMapping(value="admin/course/agreeCourse.action")
	public String agreeCourse(Long id){
		IcCourse cou = courseService.selectIcCourseById(id);
		cou.setCourseState("1");
		courseService.updateIcCourse(cou);
		return "redirect:/admin/course/nowAgreeCourse.action";
	}
	@RequestMapping(value="admin/course/refuseCourse.action")
	public String refuseCourse(Long id){
			courseService.deleteCourse(id);		
		return "redirect:/admin/course/nowAgreeCourse.action";		
	}
	
	//管理员退出
	@RequestMapping(value="exit.action")
	public String exit(HttpSession session){
		session.removeAttribute("icman");
		return "forward:index.jsp";
	}
	
	//检验课程名是否重复
	@RequestMapping(value="/course/checkClassRoom.action")
	public @ResponseBody
	String checkClassRoom(String courseClassroom){
		boolean isExit=true;
		isExit=courseService.checkUsername(courseClassroom);
		String json="{\"valid\":"+isExit+"}";
		return json;
	}
}
