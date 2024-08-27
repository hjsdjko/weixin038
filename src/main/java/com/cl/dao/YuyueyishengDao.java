package com.cl.dao;

import com.cl.entity.YuyueyishengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YuyueyishengView;


/**
 * 预约医生
 * 
 * @author 
 * @email 
 * @date 2024-03-30 17:20:00
 */
public interface YuyueyishengDao extends BaseMapper<YuyueyishengEntity> {
	
	List<YuyueyishengView> selectListView(@Param("ew") Wrapper<YuyueyishengEntity> wrapper);

	List<YuyueyishengView> selectListView(Pagination page,@Param("ew") Wrapper<YuyueyishengEntity> wrapper);
	
	YuyueyishengView selectView(@Param("ew") Wrapper<YuyueyishengEntity> wrapper);
	

}
