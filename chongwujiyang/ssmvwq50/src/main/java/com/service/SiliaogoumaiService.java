package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SiliaogoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SiliaogoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SiliaogoumaiView;


/**
 * 饲料购买
 *
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
public interface SiliaogoumaiService extends IService<SiliaogoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SiliaogoumaiVO> selectListVO(Wrapper<SiliaogoumaiEntity> wrapper);
   	
   	SiliaogoumaiVO selectVO(@Param("ew") Wrapper<SiliaogoumaiEntity> wrapper);
   	
   	List<SiliaogoumaiView> selectListView(Wrapper<SiliaogoumaiEntity> wrapper);
   	
   	SiliaogoumaiView selectView(@Param("ew") Wrapper<SiliaogoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SiliaogoumaiEntity> wrapper);
   	
}

