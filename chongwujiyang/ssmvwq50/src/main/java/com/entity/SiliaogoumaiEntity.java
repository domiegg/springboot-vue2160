package com.entity;

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
 * 饲料购买
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
@TableName("siliaogoumai")
public class SiliaogoumaiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public SiliaogoumaiEntity() {
		
	}
	
	public SiliaogoumaiEntity(T t) {
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
	 * 饲料名称
	 */
					
	private String siliaomingcheng;
	
	/**
	 * 适用宠物
	 */
					
	private String shiyongchongwu;
	
	/**
	 * 饲料种类
	 */
					
	private String siliaozhonglei;
	
	/**
	 * 饲料配料
	 */
					
	private String siliaopeiliao;
	
	/**
	 * 出厂公司
	 */
					
	private String chuchanggongsi;
	
	/**
	 * 饲料图片
	 */
					
	private String siliaotupian;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	/**
	 * 价格
	 */
					
	private Float price;
	
	
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
	 * 设置：饲料名称
	 */
	public void setSiliaomingcheng(String siliaomingcheng) {
		this.siliaomingcheng = siliaomingcheng;
	}
	/**
	 * 获取：饲料名称
	 */
	public String getSiliaomingcheng() {
		return siliaomingcheng;
	}
	/**
	 * 设置：适用宠物
	 */
	public void setShiyongchongwu(String shiyongchongwu) {
		this.shiyongchongwu = shiyongchongwu;
	}
	/**
	 * 获取：适用宠物
	 */
	public String getShiyongchongwu() {
		return shiyongchongwu;
	}
	/**
	 * 设置：饲料种类
	 */
	public void setSiliaozhonglei(String siliaozhonglei) {
		this.siliaozhonglei = siliaozhonglei;
	}
	/**
	 * 获取：饲料种类
	 */
	public String getSiliaozhonglei() {
		return siliaozhonglei;
	}
	/**
	 * 设置：饲料配料
	 */
	public void setSiliaopeiliao(String siliaopeiliao) {
		this.siliaopeiliao = siliaopeiliao;
	}
	/**
	 * 获取：饲料配料
	 */
	public String getSiliaopeiliao() {
		return siliaopeiliao;
	}
	/**
	 * 设置：出厂公司
	 */
	public void setChuchanggongsi(String chuchanggongsi) {
		this.chuchanggongsi = chuchanggongsi;
	}
	/**
	 * 获取：出厂公司
	 */
	public String getChuchanggongsi() {
		return chuchanggongsi;
	}
	/**
	 * 设置：饲料图片
	 */
	public void setSiliaotupian(String siliaotupian) {
		this.siliaotupian = siliaotupian;
	}
	/**
	 * 获取：饲料图片
	 */
	public String getSiliaotupian() {
		return siliaotupian;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
	/**
	 * 设置：价格
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
