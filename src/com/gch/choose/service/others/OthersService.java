package com.gch.choose.service.others;

import java.util.List;

import com.gch.choose.pojo.IcManager;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;

public interface OthersService {

	IcManager adminLogin(QueryVo vo);

	IcTeacher teacherLogin(QueryVo vo);

	IcStudent studentLogin(QueryVo vo);

	List<IcManager> selectAllManager();

	void insertManager(IcManager icManager);

	IcManager selectManagerById(Long id);

	void updateManager(IcManager icManager);

	void deleteManager(Long id);

}
