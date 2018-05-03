package com.gch.choose.service.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gch.choose.mapper.IcTeacherMapper;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
import com.gch.common.utils.Page;
@Service
public class TeacherServiceImp implements TeacherService {
	@Autowired private IcTeacherMapper icTeacherDao;
	@Override
	public Page<IcTeacher> selectPageByQueryVo(QueryVo vo) {
		Page<IcTeacher> page = new Page<IcTeacher>();
		page.setSize(5);
		vo.setSize(5);
		if(null!= vo){
			if(null!=vo.getPage()){
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage()-1)*vo.getSize());
			}if(null !=vo.getTeaName() && !"".equals(vo.getTeaName().trim())){
				vo.setTeaName(vo.getTeaName().trim());
			}if(null != vo.getTeaNumber() && !"".equals(vo.getTeaNumber().trim())){
				vo.setTeaNumber(vo.getTeaNumber().trim());
			}
			page.setTotal(icTeacherDao.icTeacherCountByQueryVo(vo));
			page.setRows(icTeacherDao.selectTeacherByQueryVo(vo));
		}
		return page;
	}
	@Override
	public void insertTeacher(IcTeacher icTeacher) {
		icTeacherDao.insert(icTeacher);
	}
	@Override
	public @ResponseBody
	IcTeacher selectIcTeacherById(Long id) {
		
		return icTeacherDao.selectByPrimaryKey(id);
	}
	@Override
	public @ResponseBody
	void updateIcTeacherById(IcTeacher icTeacher) {
		icTeacherDao.updateTeacherByTeaId(icTeacher);
	}
	@Override
	public @ResponseBody
	void deleteTeacherById(Long id) {
		icTeacherDao.deleteByPrimaryKey(id);
	}
	@Override
	public List<IcTeacher> selectTeacherName() {
		
		return icTeacherDao.selectTeacherName();
	}
	@Override
	public boolean checkUsername(String teaNumber) {
		int reg=0;
		reg=icTeacherDao.selectCountByTeaNumber(teaNumber);
		return reg>0?false:true;
	}

}
