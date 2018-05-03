package com.gch.choose.mapper;

import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcCourseExample;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcCourseMapper {
    int countByExample(IcCourseExample example);

    int deleteByExample(IcCourseExample example);

    int deleteByPrimaryKey(Long courseId);

    int insert(IcCourse record);

    int insertSelective(IcCourse record);

    List<IcCourse> selectByExample(IcCourseExample example);

    IcCourse selectByPrimaryKey(Long courseId);

    int updateByExampleSelective(@Param("record") IcCourse record, @Param("example") IcCourseExample example);

    int updateByExample(@Param("record") IcCourse record, @Param("example") IcCourseExample example);

    int updateByPrimaryKeySelective(IcCourse record);

    int updateByPrimaryKey(IcCourse record);

	int icCourseCountByQueryVo(QueryVo vo);

	List<IcCourse> selectCourseByQueryVo(QueryVo vo);

	List<IcTeacher> selectTeacherName();

	void updateCourse(IcCourse icCourse);

	IcCourse selectAllCourse();

	int icCourseCountByState(QueryVo vo);

	List<IcCourse> selectCourseByState(QueryVo vo);

	List<IcCourse> selectTeaCourse(Long tea_id);

	void insertApplyCourse(IcTeacher tea, IcCourse ic);

	List<IcCourse> selectAllCourseByState(IcTeacher tea);

	List<IcCourse> selectAllStateNullCourse();

	int selectCountBycourseClassroom(String courseClassroom);
}