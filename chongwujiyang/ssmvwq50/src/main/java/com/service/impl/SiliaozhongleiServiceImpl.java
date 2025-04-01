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


import com.dao.SiliaozhongleiDao;
import com.entity.SiliaozhongleiEntity;
import com.service.SiliaozhongleiService;
import com.entity.vo.SiliaozhongleiVO;
import com.entity.view.SiliaozhongleiView;

@Service("siliaozhongleiService")
public class SiliaozhongleiServiceImpl extends ServiceImpl<SiliaozhongleiDao, SiliaozhongleiEntity> implements SiliaozhongleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SiliaozhongleiEntity> page = this.selectPage(
                new Query<SiliaozhongleiEntity>(params).getPage(),
                new EntityWrapper<SiliaozhongleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SiliaozhongleiEntity> wrapper) {
		  Page<SiliaozhongleiView> page =new Query<SiliaozhongleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<SiliaozhongleiVO> selectListVO(Wrapper<SiliaozhongleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public SiliaozhongleiVO selectVO(Wrapper<SiliaozhongleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<SiliaozhongleiView> selectListView(Wrapper<SiliaozhongleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SiliaozhongleiView selectView(Wrapper<SiliaozhongleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
