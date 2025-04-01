package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.LingyangxiangqingDao;
import com.entity.LingyangxiangqingEntity;
import com.service.LingyangxiangqingService;
import com.entity.vo.LingyangxiangqingVO;
import com.entity.view.LingyangxiangqingView;

@Service("lingyangxiangqingService")
public class LingyangxiangqingServiceImpl extends ServiceImpl<LingyangxiangqingDao, LingyangxiangqingEntity> implements LingyangxiangqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LingyangxiangqingEntity> page = this.selectPage(
                new Query<LingyangxiangqingEntity>(params).getPage(),
                new EntityWrapper<LingyangxiangqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LingyangxiangqingEntity> wrapper) {
		  Page<LingyangxiangqingView> page =new Query<LingyangxiangqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LingyangxiangqingVO> selectListVO(Wrapper<LingyangxiangqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LingyangxiangqingVO selectVO(Wrapper<LingyangxiangqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LingyangxiangqingView> selectListView(Wrapper<LingyangxiangqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LingyangxiangqingView selectView(Wrapper<LingyangxiangqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
