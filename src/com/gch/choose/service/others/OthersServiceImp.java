package com.gch.choose.service.others;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.gch.choose.mapper.IcManagerMapper;
import com.gch.choose.mapper.IcStudentMapper;
import com.gch.choose.mapper.IcTeacherMapper;

import com.gch.choose.pojo.IcManager;
import com.gch.choose.pojo.IcStudent;
import com.gch.choose.pojo.IcTeacher;
import com.gch.choose.pojo.QueryVo;
@Service
public class OthersServiceImp implements OthersService {
	@Autowired 
	private IcManagerMapper icManagerDao;
	@Autowired
	private IcTeacherMapper icTeacherDao;
	@Autowired
	private IcStudentMapper icStudentDao;
	@Override
	public IcManager adminLogin(QueryVo vo) {
		IcManager icman = icManagerDao.selectIcMangerByIDPassword(vo.getUserID());
		
		return icman;
	}
	@Override
	public IcTeacher teacherLogin(QueryVo vo) {
		IcTeacher icteacher=icTeacherDao.selectIcTeacherByIDPassword(vo.getUserID());
		return icteacher;
	}
	@Override
	public IcStudent studentLogin(QueryVo vo) {
		
		return icStudentDao.selectIcStudentByIDPassword(vo.getUserID());
	}
	@Override
	public List<IcManager> selectAllManager() {
		
		return icManagerDao.selectAllManager();
	}
	@Override
	public void insertManager(IcManager icManager) {
		icManagerDao.insertManager(icManager);
	}
	@Override
	public IcManager selectManagerById(Long id) {
		
		return icManagerDao.selectManagerById(id);
	}
	@Override
	public void updateManager(IcManager icManager) {
		icManagerDao.updateManager(icManager);
	}
	@Override
	public void deleteManager(Long id) {
		icManagerDao.deleteByPrimaryKey(id);
	}

}
