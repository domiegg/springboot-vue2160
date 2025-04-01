package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LingyangxiangqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LingyangxiangqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LingyangxiangqingView;


/**
 * 领养详情
 *
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
public interface LingyangxiangqingService extends IService<LingyangxiangqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LingyangxiangqingVO> selectListVO(Wrapper<LingyangxiangqingEntity> wrapper);
   	
   	LingyangxiangqingVO selectVO(@Param("ew") Wrapper<LingyangxiangqingEntity> wrapper);
   	
   	List<LingyangxiangqingView> selectListView(Wrapper<LingyangxiangqingEntity> wrapper);
   	
   	LingyangxiangqingView selectView(@Param("ew") Wrapper<LingyangxiangqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LingyangxiangqingEntity> wrapper);
   	
}

