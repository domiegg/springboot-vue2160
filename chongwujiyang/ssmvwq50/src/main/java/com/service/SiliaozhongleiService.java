package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.SiliaozhongleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.SiliaozhongleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.SiliaozhongleiView;


/**
 * 饲料种类
 *
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
public interface SiliaozhongleiService extends IService<SiliaozhongleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SiliaozhongleiVO> selectListVO(Wrapper<SiliaozhongleiEntity> wrapper);
   	
   	SiliaozhongleiVO selectVO(@Param("ew") Wrapper<SiliaozhongleiEntity> wrapper);
   	
   	List<SiliaozhongleiView> selectListView(Wrapper<SiliaozhongleiEntity> wrapper);
   	
   	SiliaozhongleiView selectView(@Param("ew") Wrapper<SiliaozhongleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SiliaozhongleiEntity> wrapper);
   	
}

