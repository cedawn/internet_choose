package com.gch.choose.service.admin;


import java.util.List;

import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.common.utils.Page;

public interface TeacherService {
	public Page<IcTeacher> selectPageByQueryVo(QueryVo vo);

	public void insertTeacher(IcTeacher icTeacher);

	public IcTeacher selectIcTeacherById(Long id);

	public void updateIcTeacherById(IcTeacher icTeacher);

	public void deleteTeacherById(Long id);

	public List<IcTeacher> selectTeacherName();

	public boolean checkUsername(String teaNumber);

	
}
