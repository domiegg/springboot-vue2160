package com.entity.view;

import com.entity.LingyangxiangqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 领养详情
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
@TableName("lingyangxiangqing")
public class LingyangxiangqingView  extends LingyangxiangqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LingyangxiangqingView(){
	}
 
 	public LingyangxiangqingView(LingyangxiangqingEntity lingyangxiangqingEntity){
 	try {
			BeanUtils.copyProperties(this, lingyangxiangqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
