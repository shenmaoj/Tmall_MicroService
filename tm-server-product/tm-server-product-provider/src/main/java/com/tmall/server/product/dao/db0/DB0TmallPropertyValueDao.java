package com.tmall.server.product.dao.db0;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.tmall.server.product.common.model.TmallPropertyValue;
import com.tmall.server.product.common.model.TmallPropertyValueExample;
import com.tmall.server.product.dao.TmallPropertyValueDao;

@Component(value="db0TmallPropertyValueDao")
@Mapper
@Order(0)
public interface DB0TmallPropertyValueDao extends TmallPropertyValueDao
{
//	long countByExample(TmallPropertyValueExample example);
//
//	int deleteByExample(TmallPropertyValueExample example);
//
//	int deleteByPrimaryKey(Long propertyValueId);
//
//	int insert(TmallPropertyValue record);
//
//	int insertSelective(TmallPropertyValue record);
//
//	List<TmallPropertyValue> selectByExample(TmallPropertyValueExample example);
//
//	TmallPropertyValue selectByPrimaryKey(Long propertyValueId);
//
//	int updateByExampleSelective(@Param("record") TmallPropertyValue record,
//			@Param("example") TmallPropertyValueExample example);
//
//	int updateByExample(@Param("record") TmallPropertyValue record,
//			@Param("example") TmallPropertyValueExample example);
//
//	int updateByPrimaryKeySelective(TmallPropertyValue record);
//
//	int updateByPrimaryKey(TmallPropertyValue record);
}