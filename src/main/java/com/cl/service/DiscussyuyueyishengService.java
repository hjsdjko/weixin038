package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.DiscussyuyueyishengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.DiscussyuyueyishengView;


/**
 * 预约医生评论表
 *
 * @author 
 * @email 
 * @date 2024-03-30 17:20:01
 */
public interface DiscussyuyueyishengService extends IService<DiscussyuyueyishengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyuyueyishengView> selectListView(Wrapper<DiscussyuyueyishengEntity> wrapper);
   	
   	DiscussyuyueyishengView selectView(@Param("ew") Wrapper<DiscussyuyueyishengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyuyueyishengEntity> wrapper);
   	

}

