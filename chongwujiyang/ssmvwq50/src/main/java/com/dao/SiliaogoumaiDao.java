package com.dao;

import com.entity.SiliaogoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.SiliaogoumaiVO;
import com.entity.view.SiliaogoumaiView;


/**
 * 饲料购买
 * 
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
public interface SiliaogoumaiDao extends BaseMapper<SiliaogoumaiEntity> {
	
	List<SiliaogoumaiVO> selectListVO(@Param("ew") Wrapper<SiliaogoumaiEntity> wrapper);
	
	SiliaogoumaiVO selectVO(@Param("ew") Wrapper<SiliaogoumaiEntity> wrapper);
	
	List<SiliaogoumaiView> selectListView(@Param("ew") Wrapper<SiliaogoumaiEntity> wrapper);

	List<SiliaogoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<SiliaogoumaiEntity> wrapper);
	
	SiliaogoumaiView selectView(@Param("ew") Wrapper<SiliaogoumaiEntity> wrapper);
	
}
