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


import com.dao.DingdantousuDao;
import com.entity.DingdantousuEntity;
import com.service.DingdantousuService;
import com.entity.vo.DingdantousuVO;
import com.entity.view.DingdantousuView;

@Service("dingdantousuService")
public class DingdantousuServiceImpl extends ServiceImpl<DingdantousuDao, DingdantousuEntity> implements DingdantousuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingdantousuEntity> page = this.selectPage(
                new Query<DingdantousuEntity>(params).getPage(),
                new EntityWrapper<DingdantousuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingdantousuEntity> wrapper) {
		  Page<DingdantousuView> page =new Query<DingdantousuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingdantousuVO> selectListVO(Wrapper<DingdantousuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingdantousuVO selectVO(Wrapper<DingdantousuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingdantousuView> selectListView(Wrapper<DingdantousuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingdantousuView selectView(Wrapper<DingdantousuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
