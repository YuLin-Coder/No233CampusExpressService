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


import com.dao.KuaidiyuanDao;
import com.entity.KuaidiyuanEntity;
import com.service.KuaidiyuanService;
import com.entity.vo.KuaidiyuanVO;
import com.entity.view.KuaidiyuanView;

@Service("kuaidiyuanService")
public class KuaidiyuanServiceImpl extends ServiceImpl<KuaidiyuanDao, KuaidiyuanEntity> implements KuaidiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<KuaidiyuanEntity> page = this.selectPage(
                new Query<KuaidiyuanEntity>(params).getPage(),
                new EntityWrapper<KuaidiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<KuaidiyuanEntity> wrapper) {
		  Page<KuaidiyuanView> page =new Query<KuaidiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<KuaidiyuanVO> selectListVO(Wrapper<KuaidiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public KuaidiyuanVO selectVO(Wrapper<KuaidiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<KuaidiyuanView> selectListView(Wrapper<KuaidiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public KuaidiyuanView selectView(Wrapper<KuaidiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
