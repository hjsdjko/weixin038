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

import com.cl.entity.JiankangdanganEntity;
import com.cl.entity.view.JiankangdanganView;

import com.cl.service.JiankangdanganService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 健康档案
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-30 17:20:00
 */
@RestController
@RequestMapping("/jiankangdangan")
public class JiankangdanganController {
    @Autowired
    private JiankangdanganService jiankangdanganService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,JiankangdanganEntity jiankangdangan,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			jiankangdangan.setShouji((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yisheng")) {
			jiankangdangan.setYishengshouji((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<JiankangdanganEntity> ew = new EntityWrapper<JiankangdanganEntity>();

		PageUtils page = jiankangdanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangdangan), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,JiankangdanganEntity jiankangdangan, 
		HttpServletRequest request){
        EntityWrapper<JiankangdanganEntity> ew = new EntityWrapper<JiankangdanganEntity>();

		PageUtils page = jiankangdanganService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, jiankangdangan), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( JiankangdanganEntity jiankangdangan){
       	EntityWrapper<JiankangdanganEntity> ew = new EntityWrapper<JiankangdanganEntity>();
      	ew.allEq(MPUtil.allEQMapPre( jiankangdangan, "jiankangdangan")); 
        return R.ok().put("data", jiankangdanganService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(JiankangdanganEntity jiankangdangan){
        EntityWrapper< JiankangdanganEntity> ew = new EntityWrapper< JiankangdanganEntity>();
 		ew.allEq(MPUtil.allEQMapPre( jiankangdangan, "jiankangdangan")); 
		JiankangdanganView jiankangdanganView =  jiankangdanganService.selectView(ew);
		return R.ok("查询健康档案成功").put("data", jiankangdanganView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        JiankangdanganEntity jiankangdangan = jiankangdanganService.selectById(id);
		jiankangdangan = jiankangdanganService.selectView(new EntityWrapper<JiankangdanganEntity>().eq("id", id));
        return R.ok().put("data", jiankangdangan);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        JiankangdanganEntity jiankangdangan = jiankangdanganService.selectById(id);
		jiankangdangan = jiankangdanganService.selectView(new EntityWrapper<JiankangdanganEntity>().eq("id", id));
        return R.ok().put("data", jiankangdangan);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody JiankangdanganEntity jiankangdangan, HttpServletRequest request){
    	jiankangdangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangdangan);
        jiankangdanganService.insert(jiankangdangan);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody JiankangdanganEntity jiankangdangan, HttpServletRequest request){
    	jiankangdangan.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(jiankangdangan);
        jiankangdanganService.insert(jiankangdangan);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody JiankangdanganEntity jiankangdangan, HttpServletRequest request){
        //ValidatorUtils.validateEntity(jiankangdangan);
        jiankangdanganService.updateById(jiankangdangan);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        jiankangdanganService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
