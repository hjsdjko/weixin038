package com.cl.dao;

import com.cl.entity.DiscussyuyueyishengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyuyueyishengView;


/**
 * 预约医生评论表
 * 
 * @author 
 * @email 
 * @date 2024-03-30 17:20:01
 */
public interface DiscussyuyueyishengDao extends BaseMapper<DiscussyuyueyishengEntity> {
	
	List<DiscussyuyueyishengView> selectListView(@Param("ew") Wrapper<DiscussyuyueyishengEntity> wrapper);

	List<DiscussyuyueyishengView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyuyueyishengEntity> wrapper);
	
	DiscussyuyueyishengView selectView(@Param("ew") Wrapper<DiscussyuyueyishengEntity> wrapper);
	

}
