package com.gch.choose.service.admin;

import java.util.List;

import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.common.utils.Page;

public interface CourseService {
	public Page<IcCourse> selectPageByQueryVo(QueryVo vo);

	public List<IcTeacher> selectTeacherName();

	public void insertCourse(IcCourse icCourse);

	public IcCourse selectIcCourseById(Long id);

	public void updateIcCourse(IcCourse icCourse);

	public void deleteCourse(Long id);

	public Page<IcCourse> selectAllCourse(QueryVo vo);

	public List<IcCourse> selectTeaCourse(Long tea_id);

	public void insertApplyCourse(IcTeacher tea,IcCourse ic);

	public List<IcCourse> selectAllCourseByState(IcTeacher tea);

	public List<IcCourse> selectAllStateNullCourse();

	public boolean checkUsername(String courseClassroom);




}
