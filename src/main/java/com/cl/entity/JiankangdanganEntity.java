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
 * 健康档案
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-30 17:20:00
 */
@TableName("jiankangdangan")
public class JiankangdanganEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiankangdanganEntity() {
		
	}
	
	public JiankangdanganEntity(T t) {
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
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 医生手机
	 */
					
	private String yishengshouji;
	
	/**
	 * 医生姓名
	 */
					
	private String yishengxingming;
	
	/**
	 * 病史记录
	 */
					
	private String bingshijilu;
	
	/**
	 * 诊断结果
	 */
					
	private String zhenduanjieguo;
	
	/**
	 * 诊断详情
	 */
					
	private String zhenduanxiangqing;
	
	/**
	 * 需要注意
	 */
					
	private String xuyaozhuyi;
	
	/**
	 * 档案图片
	 */
					
	private String dangantupian;
	
	/**
	 * 跨表用户id
	 */
					
	private Long crossuserid;
	
	/**
	 * 跨表主键id
	 */
					
	private Long crossrefid;
	
	
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
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
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
	 * 设置：病史记录
	 */
	public void setBingshijilu(String bingshijilu) {
		this.bingshijilu = bingshijilu;
	}
	/**
	 * 获取：病史记录
	 */
	public String getBingshijilu() {
		return bingshijilu;
	}
	/**
	 * 设置：诊断结果
	 */
	public void setZhenduanjieguo(String zhenduanjieguo) {
		this.zhenduanjieguo = zhenduanjieguo;
	}
	/**
	 * 获取：诊断结果
	 */
	public String getZhenduanjieguo() {
		return zhenduanjieguo;
	}
	/**
	 * 设置：诊断详情
	 */
	public void setZhenduanxiangqing(String zhenduanxiangqing) {
		this.zhenduanxiangqing = zhenduanxiangqing;
	}
	/**
	 * 获取：诊断详情
	 */
	public String getZhenduanxiangqing() {
		return zhenduanxiangqing;
	}
	/**
	 * 设置：需要注意
	 */
	public void setXuyaozhuyi(String xuyaozhuyi) {
		this.xuyaozhuyi = xuyaozhuyi;
	}
	/**
	 * 获取：需要注意
	 */
	public String getXuyaozhuyi() {
		return xuyaozhuyi;
	}
	/**
	 * 设置：档案图片
	 */
	public void setDangantupian(String dangantupian) {
		this.dangantupian = dangantupian;
	}
	/**
	 * 获取：档案图片
	 */
	public String getDangantupian() {
		return dangantupian;
	}
	/**
	 * 设置：跨表用户id
	 */
	public void setCrossuserid(Long crossuserid) {
		this.crossuserid = crossuserid;
	}
	/**
	 * 获取：跨表用户id
	 */
	public Long getCrossuserid() {
		return crossuserid;
	}
	/**
	 * 设置：跨表主键id
	 */
	public void setCrossrefid(Long crossrefid) {
		this.crossrefid = crossrefid;
	}
	/**
	 * 获取：跨表主键id
	 */
	public Long getCrossrefid() {
		return crossrefid;
	}

}
