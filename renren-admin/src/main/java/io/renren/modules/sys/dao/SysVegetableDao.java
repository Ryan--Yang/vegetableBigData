package io.renren.modules.sys.dao;

import java.util.List;

import com.baomidou.mybatisplus.mapper.BaseMapper;

import io.renren.modules.sys.entity.SysVegetableEntity;

/**
 * 蔬菜实体
 * 
 * @author ryanyang
 * 
 * @date 2018年4月23日
 */
public interface SysVegetableDao extends BaseMapper<SysVegetableEntity>{

	
	/**
	 * 根据种类获取蔬菜
	 */
	List<SysVegetableEntity> queryByType(String type);
	
	
	/**
	 * 根据蔬菜名字、查询起始时间查询
	 * @param name
	 * @param beginTime
	 * @param endTime
	 * @return
	 */
	List<SysVegetableEntity> queryByNameTime(String name, String beginTime, String endTime);
	
	/**
	 * 根据条件查询
	 * @param name
	 * @param beginTime
	 * @param endTime
	 * @param area
	 * @return
	 */
	List<SysVegetableEntity> queryByCondition(String name, String beginTime, String endTime, String area);
	
	/**
	 * 获取蔬菜种类数目
	 * @return
	 */
	List<String> getItem();
}
