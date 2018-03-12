package com.jd.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jd.dao.AreaDao;
import com.jd.dao.BaseDao;
import com.jd.pojo.Area;
import com.jd.pojo.AreaExample;
import com.jd.service.AreaService;

@Service("areaService")
@Transactional
public class AreaServiceImpl extends BaseServiceImpl<Area, AreaExample, Integer> implements AreaService{

	@Autowired 
	AreaDao areaDao;
	
	@Override
	public BaseDao<Area, AreaExample, Integer> getDao() {
		return areaDao;
	}

}
