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


import com.dao.FuwupingjiaDao;
import com.entity.FuwupingjiaEntity;
import com.service.FuwupingjiaService;
import com.entity.vo.FuwupingjiaVO;
import com.entity.view.FuwupingjiaView;

@Service("fuwupingjiaService")
public class FuwupingjiaServiceImpl extends ServiceImpl<FuwupingjiaDao, FuwupingjiaEntity> implements FuwupingjiaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FuwupingjiaEntity> page = this.selectPage(
                new Query<FuwupingjiaEntity>(params).getPage(),
                new EntityWrapper<FuwupingjiaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FuwupingjiaEntity> wrapper) {
		  Page<FuwupingjiaView> page =new Query<FuwupingjiaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FuwupingjiaVO> selectListVO(Wrapper<FuwupingjiaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FuwupingjiaVO selectVO(Wrapper<FuwupingjiaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FuwupingjiaView> selectListView(Wrapper<FuwupingjiaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FuwupingjiaView selectView(Wrapper<FuwupingjiaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
