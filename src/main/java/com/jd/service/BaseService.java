package com.jd.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jd.dao.BaseDao;

public interface BaseService<T, E, K> {
	
	BaseDao<T, E, K> getDao();
	
	int countbyExample(E Example);
	
	int insert(T pojo);
	
	int insertSelective(T pojo);
	
    int deleteByExample(E example);

    int deleteByPrimaryKey(K objId);

    List<T> selectByExample(E example);

    T selectByPrimaryKey(K objId);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);
}
