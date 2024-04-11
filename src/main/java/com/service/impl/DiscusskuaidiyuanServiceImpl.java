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


import com.dao.DiscusskuaidiyuanDao;
import com.entity.DiscusskuaidiyuanEntity;
import com.service.DiscusskuaidiyuanService;
import com.entity.vo.DiscusskuaidiyuanVO;
import com.entity.view.DiscusskuaidiyuanView;

@Service("discusskuaidiyuanService")
public class DiscusskuaidiyuanServiceImpl extends ServiceImpl<DiscusskuaidiyuanDao, DiscusskuaidiyuanEntity> implements DiscusskuaidiyuanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusskuaidiyuanEntity> page = this.selectPage(
                new Query<DiscusskuaidiyuanEntity>(params).getPage(),
                new EntityWrapper<DiscusskuaidiyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusskuaidiyuanEntity> wrapper) {
		  Page<DiscusskuaidiyuanView> page =new Query<DiscusskuaidiyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusskuaidiyuanVO> selectListVO(Wrapper<DiscusskuaidiyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusskuaidiyuanVO selectVO(Wrapper<DiscusskuaidiyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusskuaidiyuanView> selectListView(Wrapper<DiscusskuaidiyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusskuaidiyuanView selectView(Wrapper<DiscusskuaidiyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
