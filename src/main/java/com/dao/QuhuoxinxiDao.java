package com.dao;

import com.entity.QuhuoxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.QuhuoxinxiVO;
import com.entity.view.QuhuoxinxiView;


/**
 * 取货信息
 * 
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface QuhuoxinxiDao extends BaseMapper<QuhuoxinxiEntity> {
	
	List<QuhuoxinxiVO> selectListVO(@Param("ew") Wrapper<QuhuoxinxiEntity> wrapper);
	
	QuhuoxinxiVO selectVO(@Param("ew") Wrapper<QuhuoxinxiEntity> wrapper);
	
	List<QuhuoxinxiView> selectListView(@Param("ew") Wrapper<QuhuoxinxiEntity> wrapper);

	List<QuhuoxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<QuhuoxinxiEntity> wrapper);
	
	QuhuoxinxiView selectView(@Param("ew") Wrapper<QuhuoxinxiEntity> wrapper);
	
}
