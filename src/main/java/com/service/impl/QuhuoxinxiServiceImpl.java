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


import com.dao.QuhuoxinxiDao;
import com.entity.QuhuoxinxiEntity;
import com.service.QuhuoxinxiService;
import com.entity.vo.QuhuoxinxiVO;
import com.entity.view.QuhuoxinxiView;

@Service("quhuoxinxiService")
public class QuhuoxinxiServiceImpl extends ServiceImpl<QuhuoxinxiDao, QuhuoxinxiEntity> implements QuhuoxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<QuhuoxinxiEntity> page = this.selectPage(
                new Query<QuhuoxinxiEntity>(params).getPage(),
                new EntityWrapper<QuhuoxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<QuhuoxinxiEntity> wrapper) {
		  Page<QuhuoxinxiView> page =new Query<QuhuoxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<QuhuoxinxiVO> selectListVO(Wrapper<QuhuoxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public QuhuoxinxiVO selectVO(Wrapper<QuhuoxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<QuhuoxinxiView> selectListView(Wrapper<QuhuoxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public QuhuoxinxiView selectView(Wrapper<QuhuoxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
