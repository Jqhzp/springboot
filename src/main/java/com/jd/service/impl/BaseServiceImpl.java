package com.jd.service.impl;

import java.util.List;

import com.jd.service.BaseService;

public abstract class BaseServiceImpl<T, E, K> implements BaseService<T, E, K> {

	@Override
	public int countbyExample(E Example) {
		return this.getDao().countbyExample(Example);
	}

	@Override
	public int insert(T pojo) {
		return this.getDao().insert(pojo);
	}

	@Override
	public int insertSelective(T pojo) {
		return this.getDao().insertSelective(pojo);
	}

	@Override
	public int deleteByExample(E example) {
		return this.getDao().countbyExample(example);
	}

	@Override
	public int deleteByPrimaryKey(K objId) {
		return this.getDao().deleteByPrimaryKey(objId);
	}

	@Override
	public List<T> selectByExample(E example) {
		return this.getDao().selectByExample(example);
	}

	@Override
	public T selectByPrimaryKey(K objId) {
		return this.getDao().selectByPrimaryKey(objId);
	}

	@Override
	public int updateByExampleSelective(T record, E example) {
		return this.getDao().updateByExampleSelective(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(T record) {
		return this.getDao().updateByPrimaryKeySelective(record);
	}
	
}
