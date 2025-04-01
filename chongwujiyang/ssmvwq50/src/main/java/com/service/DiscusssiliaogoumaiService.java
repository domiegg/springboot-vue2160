package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusssiliaogoumaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusssiliaogoumaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusssiliaogoumaiView;


/**
 * 饲料购买评论表
 *
 * @author 
 * @email 
 * @date 2021-03-16 22:40:43
 */
public interface DiscusssiliaogoumaiService extends IService<DiscusssiliaogoumaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusssiliaogoumaiVO> selectListVO(Wrapper<DiscusssiliaogoumaiEntity> wrapper);
   	
   	DiscusssiliaogoumaiVO selectVO(@Param("ew") Wrapper<DiscusssiliaogoumaiEntity> wrapper);
   	
   	List<DiscusssiliaogoumaiView> selectListView(Wrapper<DiscusssiliaogoumaiEntity> wrapper);
   	
   	DiscusssiliaogoumaiView selectView(@Param("ew") Wrapper<DiscusssiliaogoumaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusssiliaogoumaiEntity> wrapper);
   	
}

