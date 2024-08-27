package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.YuyuedingdanEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.YuyuedingdanView;


/**
 * 预约订单
 *
 * @author 
 * @email 
 * @date 2024-03-30 17:20:00
 */
public interface YuyuedingdanService extends IService<YuyuedingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuyuedingdanView> selectListView(Wrapper<YuyuedingdanEntity> wrapper);
   	
   	YuyuedingdanView selectView(@Param("ew") Wrapper<YuyuedingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuyuedingdanEntity> wrapper);
   	

}

