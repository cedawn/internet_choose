package com.gch.choose.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gch.choose.pojo.IcManager;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.choose.service.admin.TeacherService;
import com.gch.choose.service.others.OthersService;



@Controller
public class OthersController {
	@Autowired
	private OthersService othersService;
	@RequestMapping(value="/login")
	public String login(QueryVo vo,HttpServletRequest request,HttpServletResponse response,Model model,HttpSession session) throws IOException{
		if(vo.getLoginType().equals("admin")){
			IcManager icman = othersService.adminLogin(vo);
			model.addAttribute("icman", icman);			
			if(icman==null){
				vo.setErrorMessage("用户名或密码错误");
				model.addAttribute("vo", vo);
				return "forward:index.jsp";
			}else if(!icman.getManPassword().equals(vo.getPassword())){
				vo.setErrorMessage("用户名或密码错误");
				model.addAttribute("vo", vo);
				return "forward:index.jsp";
			}
			session.setAttribute("icman", icman);
			return "redirect:admin/student";
		}else if(vo.getLoginType().equals("teacher")){
			IcTeacher icTeacher=othersService.teacherLogin(vo);
			model.addAttribute("icTeacher", icTeacher);
			if(icTeacher==null){
				vo.setErrorMessage("用户名或密码错误");
				model.addAttribute("vo", vo);
				return "forward:index.jsp";
			}else if(!icTeacher.getTea_password().equals(vo.getPassword())){
				vo.setErrorMessage("用户名或密码错误");
				model.addAttribute("vo", vo);
				return "forward:index.jsp";
			}
			session.setAttribute("icTeacher", icTeacher);
			return "redirect:teacher/lookCourse";
		}else if(vo.getLoginType().equals("student")){
			IcStudent icStudent=othersService.studentLogin(vo);
			model.addAttribute("icStudent", icStudent);
			if(icStudent==null){
				vo.setErrorMessage("用户名或密码错误");
				model.addAttribute("vo", vo);
				return "forward:index.jsp";
			}else if(!icStudent.getStu_password().equals(vo.getPassword())){
				vo.setErrorMessage("用户名或密码错误");
				model.addAttribute("vo", vo);
				return "forward:index.jsp";
			}
			session.setAttribute("icStudent", icStudent);
			return "redirect:student/choose";			
		}else{
			vo.setErrorMessage("请选择用户类型登录");
			model.addAttribute("vo", vo);
			return "forward:index.jsp";
		}
	}
	@RequestMapping(value="/admin/manager")
	public String selectAllManager(Model model){
		List<IcManager> iman=othersService.selectAllManager();
		model.addAttribute("man", iman);
		return "admin/manager";
	}
	@RequestMapping(value="/admin/manager/insert")
	public String insertManager(IcManager icManager){
		othersService.insertManager(icManager);
		return"redirect:/admin/manager";
	}
	@RequestMapping(value="/admin/manager/edit")
	public @ResponseBody
	IcManager edit(Long id){
		return othersService.selectManagerById(id);
	}
	@RequestMapping(value="/admin/manager/update")
	public @ResponseBody
	void update(IcManager icManager){
		othersService.updateManager(icManager);
	}
	@RequestMapping(value="/admin/manager/delete")
	public @ResponseBody
	void delete(Long id){
		othersService.deleteManager(id);
	}
}
