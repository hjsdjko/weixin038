package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.YuyueyishengEntity;
import com.cl.entity.view.YuyueyishengView;

import com.cl.service.YuyueyishengService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 预约医生
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-30 17:20:00
 */
@RestController
@RequestMapping("/yuyueyisheng")
public class YuyueyishengController {
    @Autowired
    private YuyueyishengService yuyueyishengService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuyueyishengEntity yuyueyisheng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yisheng")) {
			yuyueyisheng.setYishengshouji((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuyueyishengEntity> ew = new EntityWrapper<YuyueyishengEntity>();

		PageUtils page = yuyueyishengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyueyisheng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuyueyishengEntity yuyueyisheng, 
		HttpServletRequest request){
        EntityWrapper<YuyueyishengEntity> ew = new EntityWrapper<YuyueyishengEntity>();

		PageUtils page = yuyueyishengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuyueyisheng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuyueyishengEntity yuyueyisheng){
       	EntityWrapper<YuyueyishengEntity> ew = new EntityWrapper<YuyueyishengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuyueyisheng, "yuyueyisheng")); 
        return R.ok().put("data", yuyueyishengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuyueyishengEntity yuyueyisheng){
        EntityWrapper< YuyueyishengEntity> ew = new EntityWrapper< YuyueyishengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuyueyisheng, "yuyueyisheng")); 
		YuyueyishengView yuyueyishengView =  yuyueyishengService.selectView(ew);
		return R.ok("查询预约医生成功").put("data", yuyueyishengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuyueyishengEntity yuyueyisheng = yuyueyishengService.selectById(id);
		yuyueyisheng = yuyueyishengService.selectView(new EntityWrapper<YuyueyishengEntity>().eq("id", id));
        return R.ok().put("data", yuyueyisheng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuyueyishengEntity yuyueyisheng = yuyueyishengService.selectById(id);
		yuyueyisheng = yuyueyishengService.selectView(new EntityWrapper<YuyueyishengEntity>().eq("id", id));
        return R.ok().put("data", yuyueyisheng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuyueyishengEntity yuyueyisheng, HttpServletRequest request){
    	yuyueyisheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyueyisheng);
        yuyueyishengService.insert(yuyueyisheng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuyueyishengEntity yuyueyisheng, HttpServletRequest request){
    	yuyueyisheng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuyueyisheng);
        yuyueyishengService.insert(yuyueyisheng);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody YuyueyishengEntity yuyueyisheng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuyueyisheng);
        yuyueyishengService.updateById(yuyueyisheng);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuyueyishengService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
