package com.graduate.society.dao;

import com.graduate.society.entity.BaseEntity;

import java.util.List;

public interface BaseDao<T extends BaseEntity> {

    int deleteByPrimaryKey(String id);

    int insert(T record);

    int insertSelective(T record);

    T selectByPrimaryKey(String id);

    List<T> selectAll();

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

}
