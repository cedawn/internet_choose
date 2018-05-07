package com.gch.choose.controller;

import java.beans.IntrospectionException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.QueryVo;
import com.gch.choose.service.others.SalaryService;

@Controller
public class ExcelController {
	@Autowired
	private SalaryService salaryService;
	@RequestMapping(value="/admin/export", method = RequestMethod.POST)  
	public @ResponseBody 
	void export(HttpServletRequest request, HttpServletResponse response) throws ClassNotFoundException, IntrospectionException, IllegalAccessException, ParseException, InvocationTargetException {  
			XSSFWorkbook workbook=null;
			workbook = salaryService.exportExcelInfo();
	        response.reset(); //清除buffer缓存  
	        Map<String,Object> map=new HashMap<String,Object>();  
	        // 指定下载的文件名  
	        response.setHeader("Content-Disposition", "attachment;filename="+"课程选择结果"+".xlsx");  
	        response.setContentType("application/vnd.ms-excel;charset=UTF-8");  
	        response.setHeader("Pragma", "no-cache");  
	        response.setHeader("Cache-Control", "no-cache");  
	        response.setDateHeader("Expires", 0);  
	       /* XSSFWorkbook workbook=null;  
	        //导出Excel对象  
	        workbook = salaryService.exportExcelInfo(); */ 
	        OutputStream output;  
	        try {  
	            output = response.getOutputStream();  
	            BufferedOutputStream bufferedOutPut = new BufferedOutputStream(output);  
	            bufferedOutPut.flush();  
	            workbook.write(bufferedOutPut);  
	            bufferedOutPut.close();  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  
	      
	}
}

