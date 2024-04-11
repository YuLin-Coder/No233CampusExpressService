package com.dao;

import com.entity.DiscusskuaidiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusskuaidiyuanVO;
import com.entity.view.DiscusskuaidiyuanView;


/**
 * 快递员评论表
 * 
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface DiscusskuaidiyuanDao extends BaseMapper<DiscusskuaidiyuanEntity> {
	
	List<DiscusskuaidiyuanVO> selectListVO(@Param("ew") Wrapper<DiscusskuaidiyuanEntity> wrapper);
	
	DiscusskuaidiyuanVO selectVO(@Param("ew") Wrapper<DiscusskuaidiyuanEntity> wrapper);
	
	List<DiscusskuaidiyuanView> selectListView(@Param("ew") Wrapper<DiscusskuaidiyuanEntity> wrapper);

	List<DiscusskuaidiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusskuaidiyuanEntity> wrapper);
	
	DiscusskuaidiyuanView selectView(@Param("ew") Wrapper<DiscusskuaidiyuanEntity> wrapper);
	
}
