package com.dao;

import com.entity.DiscusssiliaogoumaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusssiliaogoumaiVO;
import com.entity.view.DiscusssiliaogoumaiView;


/**
 * 饲料购买评论表
 * 
 * @author 
 * @email 
 * @date 2021-03-16 22:40:43
 */
public interface DiscusssiliaogoumaiDao extends BaseMapper<DiscusssiliaogoumaiEntity> {
	
	List<DiscusssiliaogoumaiVO> selectListVO(@Param("ew") Wrapper<DiscusssiliaogoumaiEntity> wrapper);
	
	DiscusssiliaogoumaiVO selectVO(@Param("ew") Wrapper<DiscusssiliaogoumaiEntity> wrapper);
	
	List<DiscusssiliaogoumaiView> selectListView(@Param("ew") Wrapper<DiscusssiliaogoumaiEntity> wrapper);

	List<DiscusssiliaogoumaiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusssiliaogoumaiEntity> wrapper);
	
	DiscusssiliaogoumaiView selectView(@Param("ew") Wrapper<DiscusssiliaogoumaiEntity> wrapper);
	
}
