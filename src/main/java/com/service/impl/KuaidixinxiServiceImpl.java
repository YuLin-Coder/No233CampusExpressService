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


import com.dao.KuaidixinxiDao;
import com.entity.KuaidixinxiEntity;
import com.service.KuaidixinxiService;
import com.entity.vo.KuaidixinxiVO;
import com.entity.view.KuaidixinxiView;

@Service("kuaidixinxiService")
public class KuaidixinxiServiceImpl extends ServiceImpl<KuaidixinxiDao, KuaidixinxiEntity> implements KuaidixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KuaidixinxiEntity> page = this.selectPage(
                new Query<KuaidixinxiEntity>(params).getPage(),
                new EntityWrapper<KuaidixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KuaidixinxiEntity> wrapper) {
		  Page<KuaidixinxiView> page =new Query<KuaidixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KuaidixinxiVO> selectListVO(Wrapper<KuaidixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KuaidixinxiVO selectVO(Wrapper<KuaidixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KuaidixinxiView> selectListView(Wrapper<KuaidixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KuaidixinxiView selectView(Wrapper<KuaidixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
