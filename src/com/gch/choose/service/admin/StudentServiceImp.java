package com.gch.choose.service.admin;

import java.util.Date;
import java.util.List;
import java.util.UUID;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gch.choose.mapper.IcStudentCourseMapper;
import com.gch.choose.mapper.IcStudentMapper;
import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.common.utils.Page;
@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private IcStudentMapper icStudentDao;
	@Autowired
	private IcStudentCourseMapper icStudent_CourseDao;
	@Override
	public Page<IcStudent> selectPageByQueryVo(QueryVo vo) {
		Page<IcStudent> page = new Page<IcStudent>();
		page.setSize(5);
		vo.setSize(5);
		if(null!= vo){
			if(null!=vo.getPage()){
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage()-1)*vo.getSize());
			}if(null !=vo.getStuName() && !"".equals(vo.getStuName().trim())){
				vo.setStuName(vo.getStuName().trim());
			}if(null != vo.getStuNumber() && !"".equals(vo.getStuNumber().trim())){
				vo.setStuNumber(vo.getStuNumber().trim());
			}
			page.setTotal(icStudentDao.icStudentCountByQueryVo(vo));
			page.setRows(icStudentDao.selectStudentByQueryVo(vo));
		}
		return page;
	}
	@Override
	public void insertStudent(IcStudent icStudnet) {
	
		icStudentDao.insert(icStudnet);
	}
	@Override
	public IcStudent selectIcStudentById(Long id) {
		
		return icStudentDao.selectByPrimaryKey(id);
	}
	@Override
	public void updateIcStudentById(IcStudent icStudent) {
		icStudentDao.updateStudentByStuId(icStudent);
	}
	@Override
	public void deleteIcStudentById(Long id) {
		icStudentDao.deleteByPrimaryKey(id);
	}
	@Override
	public void insertChooseCourse(IcCourse course, IcStudent student) {
		icStudent_CourseDao.insertByCidSid(course, student);
	}
	@Override
	public List<IcStudentCourse> selectAllCourseByStuId(Long s_id) {
		  
		return icStudent_CourseDao.selectAllCourseByStuId(s_id);
	}
	@Override
	public void deleteISCById(Long c_id) {
		icStudent_CourseDao.deleteISCById(c_id);
	}
	@Override
	public List<IcStudent> selectAllStudentByCTid(IcTeacher tea, IcCourse cou) {
		
		return icStudent_CourseDao.selectAllStudentByCTid(tea,cou);
	}
	@Override
	public List<IcStudentCourse> selectNeedGrade(IcTeacher tea, IcCourse cou) {
		
		return icStudent_CourseDao.selectNeedGrade(tea,cou);
	}
	@Override
	public void updateByIscId(QueryVo vo) {
		icStudent_CourseDao.updateByIscId(vo);
	}
	@Override
	public boolean checkUsername(String stu_number) {
		int reg=0;
		reg=icStudentDao.selectCountByStuNumber(stu_number);
		return reg>0?false:true;
	}
	@Override
	public Page<IcStudentCourse> selectChooseResultByQueryVo(QueryVo vo) {
		Page<IcStudentCourse> page = new Page<IcStudentCourse>();
		page.setSize(5);
		vo.setSize(5);
		if(null!= vo){
			if(null!=vo.getPage()){
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage()-1)*vo.getSize());
			}
			if(null != vo.getStuNumber() && !"".equals(vo.getStuNumber().trim())){
				vo.setStuNumber(vo.getStuNumber().trim());
			}if(null !=vo.getTeaName() && !"".equals(vo.getTeaName().trim())){
				vo.setTeaName(vo.getTeaName().trim());
			}if(null !=vo.getCourseName() && !"".equals(vo.getCourseName().trim())){
				vo.setCourseName(vo.getCourseName().trim());
				}
			page.setTotal(icStudent_CourseDao.selectChooseResultCountByQueryVo(vo));
			page.setRows(icStudent_CourseDao.selectChooseResultByQueryVo(vo));
		}
		return page;
	}
	
	
	
	
	
	

}
