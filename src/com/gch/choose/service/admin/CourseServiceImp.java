package com.gch.choose.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gch.choose.mapper.IcCourseMapper;
import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.common.utils.Page;

@Service
public class CourseServiceImp implements CourseService {
	@Autowired
	private IcCourseMapper icCourseDao;
	@Override
	public Page<IcCourse> selectPageByQueryVo(QueryVo vo) {
		Page<IcCourse> page = new Page<IcCourse>();
		page.setSize(5);
		vo.setSize(5);
		if(null!= vo){
			if(null!=vo.getPage()){
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage()-1)*vo.getSize());
			}if(null !=vo.getCourseName() && !"".equals(vo.getCourseName().trim())){
				vo.setCourseName(vo.getCourseName().trim());
			}if(null != vo.getCourseTeaName() && !"".equals(vo.getCourseTeaName().trim())){
				vo.setCourseTeaName(vo.getCourseTeaName().trim());
			}
			page.setTotal(icCourseDao.icCourseCountByQueryVo(vo));
			page.setRows(icCourseDao.selectCourseByQueryVo(vo));
		}
		return page;
	}
	@Override
	public List<IcTeacher> selectTeacherName() {
		
		return icCourseDao.selectTeacherName();
	}
	@Override
	public void insertCourse(IcCourse icCourse) {
		icCourseDao.insert(icCourse);
	}
	@Override
	public IcCourse selectIcCourseById(Long id) {
		
		return icCourseDao.selectByPrimaryKey(id);
	}
	@Override
	public void updateIcCourse(IcCourse icCourse) {
		icCourseDao.updateCourse(icCourse);
	}
	@Override
	public void deleteCourse(Long id) {
		icCourseDao.deleteByPrimaryKey(id);
	}
	@Override
	public Page<IcCourse> selectAllCourse(QueryVo vo) {
		Page<IcCourse> page = new Page<IcCourse>();
		page.setSize(5);
		vo.setSize(5);
		if(null!= vo){
			if(null!=vo.getPage()){
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage()-1)*vo.getSize());
			}
		}
		page.setTotal(icCourseDao.icCourseCountByState(vo));
		page.setRows(icCourseDao.selectCourseByState(vo));
		return page;
	}
	@Override
	public List<IcCourse> selectTeaCourse(Long tea_id) {
		List<IcCourse> course = icCourseDao.selectTeaCourse(tea_id);
		return course;
	}
	@Override
	public void insertApplyCourse(IcTeacher tea,IcCourse ic) {
		icCourseDao.insertApplyCourse(tea,ic);
	}
	@Override
	public List<IcCourse> selectAllCourseByState(IcTeacher tea) {
		
		return icCourseDao.selectAllCourseByState(tea);
	}
	@Override
	public List<IcCourse> selectAllStateNullCourse() {
		
		return icCourseDao.selectAllStateNullCourse();
	}
	@Override
	public boolean checkUsername(String courseClassroom) {
		int reg=0;
		reg=icCourseDao.selectCountBycourseClassroom(courseClassroom);
		return reg>0?false:true;
	}
	
	
	

}
