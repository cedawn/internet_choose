package com.gch.choose.mapper;

import com.gch.choose.pojo.IcManager;
import com.gch.choose.pojo.IcManagerExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IcManagerMapper {
    int countByExample(IcManagerExample example);

    int deleteByExample(IcManagerExample example);

    int deleteByPrimaryKey(Long manId);

    int insert(IcManager record);

    int insertSelective(IcManager record);

    List<IcManager> selectByExample(IcManagerExample example);

    IcManager selectByPrimaryKey(Long manId);

    int updateByExampleSelective(@Param("record") IcManager record, @Param("example") IcManagerExample example);

    int updateByExample(@Param("record") IcManager record, @Param("example") IcManagerExample example);

    int updateByPrimaryKeySelective(IcManager record);

    int updateByPrimaryKey(IcManager record);

	IcManager selectIcMangerByIDPassword(String userID);

	List<IcManager> selectAllManager();

	void insertManager(IcManager icManager);

	IcManager selectManagerById(Long id);

	void updateManager(IcManager icManager);
}