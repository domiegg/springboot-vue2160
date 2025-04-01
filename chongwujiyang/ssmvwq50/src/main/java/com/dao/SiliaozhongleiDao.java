package com.dao;

import com.entity.SiliaozhongleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SiliaozhongleiVO;
import com.entity.view.SiliaozhongleiView;


/**
 * 饲料种类
 * 
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
public interface SiliaozhongleiDao extends BaseMapper<SiliaozhongleiEntity> {
	
	List<SiliaozhongleiVO> selectListVO(@Param("ew") Wrapper<SiliaozhongleiEntity> wrapper);
	
	SiliaozhongleiVO selectVO(@Param("ew") Wrapper<SiliaozhongleiEntity> wrapper);
	
	List<SiliaozhongleiView> selectListView(@Param("ew") Wrapper<SiliaozhongleiEntity> wrapper);

	List<SiliaozhongleiView> selectListView(Pagination page,@Param("ew") Wrapper<SiliaozhongleiEntity> wrapper);
	
	SiliaozhongleiView selectView(@Param("ew") Wrapper<SiliaozhongleiEntity> wrapper);
	
}
