package com.gch.choose.service.admin;


import java.util.List;

import com.gch.choose.pojo.IcCourse;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcStudentCourse;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.common.utils.Page;

public interface StudentService {
	public Page<IcStudent> selectPageByQueryVo(QueryVo vo);
	public void insertStudent(IcStudent icStudnet);
	public IcStudent selectIcStudentById(Long id);
	public void updateIcStudentById(IcStudent icStudent);
	public void deleteIcStudentById(Long id);

	public void insertChooseCourse(IcCourse course, IcStudent student);
	public List<IcStudentCourse> selectAllCourseByStuId(Long s_id);
	public void deleteISCById(Long c_id);
	public List<IcStudent> selectAllStudentByCTid(IcTeacher tea, IcCourse cou);
	public List<IcStudentCourse> selectNeedGrade(IcTeacher tea, IcCourse cou);
	public void updateByIscId(QueryVo vo);
	public boolean checkUsername(String stu_number);
	public Page<IcStudentCourse> selectChooseResultByQueryVo(QueryVo vo);
	
	

}
