package com.gch.choose.service.others;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.QueryVo;

public interface SalaryService {

	XSSFWorkbook exportExcelInfo();

}
