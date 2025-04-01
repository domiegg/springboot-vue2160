package com.entity.view;

import com.entity.SiliaozhongleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 饲料种类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
@TableName("siliaozhonglei")
public class SiliaozhongleiView  extends SiliaozhongleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public SiliaozhongleiView(){
	}
 
 	public SiliaozhongleiView(SiliaozhongleiEntity siliaozhongleiEntity){
 	try {
			BeanUtils.copyProperties(this, siliaozhongleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
