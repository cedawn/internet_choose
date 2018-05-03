package com.gch.choose.mapper;

import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.IcTeacherExample;
import com.gch.choose.pojo.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcTeacherMapper {
    int countByExample(IcTeacherExample example);

    int deleteByExample(IcTeacherExample example);

    int deleteByPrimaryKey(Long teaId);

    int insert(IcTeacher record);

    int insertSelective(IcTeacher record);

    List<IcTeacher> selectByExample(IcTeacherExample example);

    IcTeacher selectByPrimaryKey(Long teaId);

    int updateByExampleSelective(@Param("record") IcTeacher record, @Param("example") IcTeacherExample example);

    int updateByExample(@Param("record") IcTeacher record, @Param("example") IcTeacherExample example);

    int updateByPrimaryKeySelective(IcTeacher record);

    int updateByPrimaryKey(IcTeacher record);

	int icTeacherCountByQueryVo(QueryVo vo);

	List<IcTeacher> selectTeacherByQueryVo(QueryVo vo);

	void updateTeacherByTeaId(IcTeacher icTeacher);

	List<IcTeacher> selectTeacherName();

	IcTeacher selectIcTeacherByIDPassword(String userID);

	int selectCountByTeaNumber(String teaNumber);
}