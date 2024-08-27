package com.cl.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 预约医生
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-30 17:20:00
 */
@TableName("yuyueyisheng")
public class YuyueyishengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YuyueyishengEntity() {
		
	}
	
	public YuyueyishengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 医生手机
	 */
					
	private String yishengshouji;
	
	/**
	 * 擅长
	 */
					
	private String shanzhang;
	
	/**
	 * 价格
	 */
					
	private Double jiage;
	
	/**
	 * 服务类型
	 */
					
	private String fuwuleixing;
	
	/**
	 * 可预约时间
	 */
					
	private String keyuyueshijian;
	
	/**
	 * 医生简介
	 */
					
	private String yishengjianjie;
	
	/**
	 * 医院名称
	 */
					
	private String yiyuanmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 状态
	 */
					
	private String zhuangtai;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：医生姓名
	 */
	public void setYishengxingming(String yishengxingming) {
		this.yishengxingming = yishengxingming;
	}
	/**
	 * 获取：医生姓名
	 */
	public String getYishengxingming() {
		return yishengxingming;
	}
	/**
	 * 设置：医生手机
	 */
	public void setYishengshouji(String yishengshouji) {
		this.yishengshouji = yishengshouji;
	}
	/**
	 * 获取：医生手机
	 */
	public String getYishengshouji() {
		return yishengshouji;
	}
	/**
	 * 设置：擅长
	 */
	public void setShanzhang(String shanzhang) {
		this.shanzhang = shanzhang;
	}
	/**
	 * 获取：擅长
	 */
	public String getShanzhang() {
		return shanzhang;
	}
	/**
	 * 设置：价格
	 */
	public void setJiage(Double jiage) {
		this.jiage = jiage;
	}
	/**
	 * 获取：价格
	 */
	public Double getJiage() {
		return jiage;
	}
	/**
	 * 设置：服务类型
	 */
	public void setFuwuleixing(String fuwuleixing) {
		this.fuwuleixing = fuwuleixing;
	}
	/**
	 * 获取：服务类型
	 */
	public String getFuwuleixing() {
		return fuwuleixing;
	}
	/**
	 * 设置：可预约时间
	 */
	public void setKeyuyueshijian(String keyuyueshijian) {
		this.keyuyueshijian = keyuyueshijian;
	}
	/**
	 * 获取：可预约时间
	 */
	public String getKeyuyueshijian() {
		return keyuyueshijian;
	}
	/**
	 * 设置：医生简介
	 */
	public void setYishengjianjie(String yishengjianjie) {
		this.yishengjianjie = yishengjianjie;
	}
	/**
	 * 获取：医生简介
	 */
	public String getYishengjianjie() {
		return yishengjianjie;
	}
	/**
	 * 设置：医院名称
	 */
	public void setYiyuanmingcheng(String yiyuanmingcheng) {
		this.yiyuanmingcheng = yiyuanmingcheng;
	}
	/**
	 * 获取：医院名称
	 */
	public String getYiyuanmingcheng() {
		return yiyuanmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：状态
	 */
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}

}
