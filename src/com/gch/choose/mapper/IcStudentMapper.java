package com.gch.choose.mapper;

import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcStudentExample;
import com.gch.choose.pojo.QueryVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcStudentMapper {
	public Integer icStudentCountByQueryVo(QueryVo vo);
	public List<IcStudent> selectStudentByQueryVo(QueryVo vo);
	public void updateStudentByStuId(IcStudent icStudent);
    int countByExample(IcStudentExample example);

    int deleteByExample(IcStudentExample example);

    int deleteByPrimaryKey(Long stuId);

    int insert(IcStudent record);

    int insertSelective(IcStudent record);

    List<IcStudent> selectByExample(IcStudentExample example);

    IcStudent selectByPrimaryKey(Long stuId);

    int updateByExampleSelective(@Param("record") IcStudent record, @Param("example") IcStudentExample example);

    int updateByExample(@Param("record") IcStudent record, @Param("example") IcStudentExample example);

    int updateByPrimaryKeySelective(IcStudent record);

    int updateByPrimaryKey(IcStudent record);
	public IcStudent selectIcStudentByIDPassword(String userID);
	public int selectCountByStuNumber(String stu_number);
	
}