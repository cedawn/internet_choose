package com.gch.choose.mapper;

import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.IcStudentCourseExample;
import com.gch.choose.pojo.IcStudentCourseKey;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcStudentCourseMapper {
    int countByExample(IcStudentCourseExample example);

    int deleteByExample(IcStudentCourseExample example);

    int deleteByPrimaryKey(IcStudentCourseKey key);

    int insert(IcStudentCourse record);

    int insertSelective(IcStudentCourse record);

    List<IcStudentCourse> selectByExample(IcStudentCourseExample example);

    IcStudentCourse selectByPrimaryKey(IcStudentCourseKey key);

    int updateByExampleSelective(@Param("record") IcStudentCourse record, @Param("example") IcStudentCourseExample example);

    int updateByExample(@Param("record") IcStudentCourse record, @Param("example") IcStudentCourseExample example);

    int updateByPrimaryKeySelective(IcStudentCourse record);

    int updateByPrimaryKey(IcStudentCourse record);


	void insertByCidSid(IcCourse course, IcStudent student);

	List<IcStudentCourse> selectAllCourseByStuId(Long s_id);

	void deleteISCById(Long c_id);

	List<IcStudent> selectAllStudentByCTid(IcTeacher tea, IcCourse cou);

	List<IcStudentCourse> selectNeedGrade(IcTeacher tea, IcCourse cou);

	void updateByIscId(QueryVo vo);

	int selectChooseResultCountByQueryVo(QueryVo vo);

	List<IcStudentCourse> selectChooseResultByQueryVo(QueryVo vo);

	List<IcStudentCourse> selectChooseResult();

	

	

	
}