package com.dao;

import com.entity.LingyangxiangqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LingyangxiangqingVO;
import com.entity.view.LingyangxiangqingView;


/**
 * 领养详情
 * 
 * @author 
 * @email 
 * @date 2021-03-16 22:40:42
 */
public interface LingyangxiangqingDao extends BaseMapper<LingyangxiangqingEntity> {
	
	List<LingyangxiangqingVO> selectListVO(@Param("ew") Wrapper<LingyangxiangqingEntity> wrapper);
	
	LingyangxiangqingVO selectVO(@Param("ew") Wrapper<LingyangxiangqingEntity> wrapper);
	
	List<LingyangxiangqingView> selectListView(@Param("ew") Wrapper<LingyangxiangqingEntity> wrapper);

	List<LingyangxiangqingView> selectListView(Pagination page,@Param("ew") Wrapper<LingyangxiangqingEntity> wrapper);
	
	LingyangxiangqingView selectView(@Param("ew") Wrapper<LingyangxiangqingEntity> wrapper);
	
}
