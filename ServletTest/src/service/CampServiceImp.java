package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.CampDao;
import model.Camp;
@Service
public class CampServiceImp implements CampService{
	
	@Autowired
	private CampDao cDao;

	@Override
	public Camp getCamp(int campId) {
		// TODO Auto-generated method stub
		return cDao.selectOne(campId);
	}

}
