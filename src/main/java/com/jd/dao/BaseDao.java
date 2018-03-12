package com.jd.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

/**
 * 
 * @author Gary
 *
 * @param <T> 实体类
 * @param <E> 实体类Example
 * @param <k> 主键类型
 */
public interface BaseDao<T,E,K> {

	int countbyExample(E example);
	
	int insert(T pojo);
	
	int insertSelective(T pojo);
	
    int deleteByExample(E example);

    int deleteByPrimaryKey(K objId);

    List<T> selectByExample(E example);

    T selectByPrimaryKey(K objId);

    int updateByExampleSelective(@Param("record") T record, @Param("example") E example);

    int updateByPrimaryKeySelective(T record);

}
