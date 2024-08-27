package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YuyueyishengEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YuyueyishengView;


/**
 * 预约医生
 *
 * @author 
 * @email 
 * @date 2024-03-30 17:20:00
 */
public interface YuyueyishengService extends IService<YuyueyishengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyueyishengView> selectListView(Wrapper<YuyueyishengEntity> wrapper);
   	
   	YuyueyishengView selectView(@Param("ew") Wrapper<YuyueyishengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyueyishengEntity> wrapper);
   	

}

