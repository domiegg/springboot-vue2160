package com.entity.vo;

import com.entity.QingkuangfankuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 情况反馈
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
public class QingkuangfankuiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 宠物名称
	 */
	
	private String chongwumingcheng;
		
	/**
	 * 宠物种类
	 */
	
	private String chongwuzhonglei;
		
	/**
	 * 宠物年龄
	 */
	
	private String chongwunianling;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 领养时间
	 */
	
	private String lingyangshijian;
		
	/**
	 * 领养时长
	 */
	
	private String lingyangshizhang;
		
	/**
	 * 近况照片
	 */
	
	private String jinkuangzhaopian;
		
	/**
	 * 近况反馈
	 */
	
	private String jinkuangfankui;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
	/**
	 * 设置：宠物名称
	 */
	 
	public void setChongwumingcheng(String chongwumingcheng) {
		this.chongwumingcheng = chongwumingcheng;
	}
	
	/**
	 * 获取：宠物名称
	 */
	public String getChongwumingcheng() {
		return chongwumingcheng;
	}
				
	
	/**
	 * 设置：宠物种类
	 */
	 
	public void setChongwuzhonglei(String chongwuzhonglei) {
		this.chongwuzhonglei = chongwuzhonglei;
	}
	
	/**
	 * 获取：宠物种类
	 */
	public String getChongwuzhonglei() {
		return chongwuzhonglei;
	}
				
	
	/**
	 * 设置：宠物年龄
	 */
	 
	public void setChongwunianling(String chongwunianling) {
		this.chongwunianling = chongwunianling;
	}
	
	/**
	 * 获取：宠物年龄
	 */
	public String getChongwunianling() {
		return chongwunianling;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
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
	 * 设置：领养时间
	 */
	 
	public void setLingyangshijian(String lingyangshijian) {
		this.lingyangshijian = lingyangshijian;
	}
	
	/**
	 * 获取：领养时间
	 */
	public String getLingyangshijian() {
		return lingyangshijian;
	}
				
	
	/**
	 * 设置：领养时长
	 */
	 
	public void setLingyangshizhang(String lingyangshizhang) {
		this.lingyangshizhang = lingyangshizhang;
	}
	
	/**
	 * 获取：领养时长
	 */
	public String getLingyangshizhang() {
		return lingyangshizhang;
	}
				
	
	/**
	 * 设置：近况照片
	 */
	 
	public void setJinkuangzhaopian(String jinkuangzhaopian) {
		this.jinkuangzhaopian = jinkuangzhaopian;
	}
	
	/**
	 * 获取：近况照片
	 */
	public String getJinkuangzhaopian() {
		return jinkuangzhaopian;
	}
				
	
	/**
	 * 设置：近况反馈
	 */
	 
	public void setJinkuangfankui(String jinkuangfankui) {
		this.jinkuangfankui = jinkuangfankui;
	}
	
	/**
	 * 获取：近况反馈
	 */
	public String getJinkuangfankui() {
		return jinkuangfankui;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}
