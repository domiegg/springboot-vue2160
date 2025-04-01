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


import com.dao.SiliaogoumaiDao;
import com.entity.SiliaogoumaiEntity;
import com.service.SiliaogoumaiService;
import com.entity.vo.SiliaogoumaiVO;
import com.entity.view.SiliaogoumaiView;

@Service("siliaogoumaiService")
public class SiliaogoumaiServiceImpl extends ServiceImpl<SiliaogoumaiDao, SiliaogoumaiEntity> implements SiliaogoumaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SiliaogoumaiEntity> page = this.selectPage(
                new Query<SiliaogoumaiEntity>(params).getPage(),
                new EntityWrapper<SiliaogoumaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SiliaogoumaiEntity> wrapper) {
		  Page<SiliaogoumaiView> page =new Query<SiliaogoumaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SiliaogoumaiVO> selectListVO(Wrapper<SiliaogoumaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SiliaogoumaiVO selectVO(Wrapper<SiliaogoumaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SiliaogoumaiView> selectListView(Wrapper<SiliaogoumaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SiliaogoumaiView selectView(Wrapper<SiliaogoumaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
