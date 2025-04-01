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


import com.dao.DiscusssiliaogoumaiDao;
import com.entity.DiscusssiliaogoumaiEntity;
import com.service.DiscusssiliaogoumaiService;
import com.entity.vo.DiscusssiliaogoumaiVO;
import com.entity.view.DiscusssiliaogoumaiView;

@Service("discusssiliaogoumaiService")
public class DiscusssiliaogoumaiServiceImpl extends ServiceImpl<DiscusssiliaogoumaiDao, DiscusssiliaogoumaiEntity> implements DiscusssiliaogoumaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusssiliaogoumaiEntity> page = this.selectPage(
                new Query<DiscusssiliaogoumaiEntity>(params).getPage(),
                new EntityWrapper<DiscusssiliaogoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusssiliaogoumaiEntity> wrapper) {
		  Page<DiscusssiliaogoumaiView> page =new Query<DiscusssiliaogoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusssiliaogoumaiVO> selectListVO(Wrapper<DiscusssiliaogoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusssiliaogoumaiVO selectVO(Wrapper<DiscusssiliaogoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusssiliaogoumaiView> selectListView(Wrapper<DiscusssiliaogoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusssiliaogoumaiView selectView(Wrapper<DiscusssiliaogoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
