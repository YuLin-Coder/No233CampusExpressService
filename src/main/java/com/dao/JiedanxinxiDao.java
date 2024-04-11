package com.dao;

import com.entity.JiedanxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiedanxinxiVO;
import com.entity.view.JiedanxinxiView;


/**
 * 接单信息
 * 
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface JiedanxinxiDao extends BaseMapper<JiedanxinxiEntity> {
	
	List<JiedanxinxiVO> selectListVO(@Param("ew") Wrapper<JiedanxinxiEntity> wrapper);
	
	JiedanxinxiVO selectVO(@Param("ew") Wrapper<JiedanxinxiEntity> wrapper);
	
	List<JiedanxinxiView> selectListView(@Param("ew") Wrapper<JiedanxinxiEntity> wrapper);

	List<JiedanxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<JiedanxinxiEntity> wrapper);
	
	JiedanxinxiView selectView(@Param("ew") Wrapper<JiedanxinxiEntity> wrapper);
	
}
