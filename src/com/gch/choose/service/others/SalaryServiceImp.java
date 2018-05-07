package com.gch.choose.service.others;

import java.beans.IntrospectionException;
import java.lang.reflect.InvocationTargetException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gch.choose.mapper.IcStudentCourseMapper;
import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.QueryVo;
import com.gch.common.utils.ExcelBean;
import com.gch.common.utils.ExcelUtil;
@Service
public class SalaryServiceImp  implements SalaryService {
	@Autowired
	private IcStudentCourseMapper icStudentCourseDao;
	@Override
	public XSSFWorkbook exportExcelInfo() {
		List<IcStudentCourse> list = icStudentCourseDao.selectChooseResult();
	   /* for(int i=0;i<list.size();i++){  
	        //查询财务名字  
	        int adminId = list.get(i).getAdminId();  
	        String adminName = salarymanageDao.selectAdminNameById(adminId);  
	        list.get(i).setAdminName(adminName);  
	        list.get(i).setId(i+1);  
	    }*/  
	    List<ExcelBean> excel=new ArrayList<ExcelBean>();  
	    Map<Integer,List<ExcelBean>> map=new LinkedHashMap<Integer,List<ExcelBean>>();  
	    XSSFWorkbook xssfWorkbook=null;  
	    //设置标题栏  
	    excel.add(new ExcelBean("学号","stu_number",0));  
	    excel.add(new ExcelBean("姓名","stu_name",0));  
	    excel.add(new ExcelBean("课程名称","courseName",0));  
	    excel.add(new ExcelBean("教师","tea_name",0));  
	    excel.add(new ExcelBean("分数","iscScore",0));   
	    map.put(0, excel);  
	    String sheetName = list.get(0).getCourseName() + "成绩单";  
	    //调用ExcelUtil的方法  
	    try {
			xssfWorkbook = ExcelUtil.createExcelFile(IcStudentCourse.class, list, map, sheetName);
		} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (IntrospectionException e) {
			
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}  
	    return xssfWorkbook;  
	}

}
