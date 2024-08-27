package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.DiscussyuyueyishengDao;
import com.cl.entity.DiscussyuyueyishengEntity;
import com.cl.service.DiscussyuyueyishengService;
import com.cl.entity.view.DiscussyuyueyishengView;

@Service("discussyuyueyishengService")
public class DiscussyuyueyishengServiceImpl extends ServiceImpl<DiscussyuyueyishengDao, DiscussyuyueyishengEntity> implements DiscussyuyueyishengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyuyueyishengEntity> page = this.selectPage(
                new Query<DiscussyuyueyishengEntity>(params).getPage(),
                new EntityWrapper<DiscussyuyueyishengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyuyueyishengEntity> wrapper) {
		  Page<DiscussyuyueyishengView> page =new Query<DiscussyuyueyishengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<DiscussyuyueyishengView> selectListView(Wrapper<DiscussyuyueyishengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyuyueyishengView selectView(Wrapper<DiscussyuyueyishengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
