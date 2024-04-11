package com.dao;

import com.entity.DingdantousuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingdantousuVO;
import com.entity.view.DingdantousuView;


/**
 * 订单投诉
 * 
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface DingdantousuDao extends BaseMapper<DingdantousuEntity> {
	
	List<DingdantousuVO> selectListVO(@Param("ew") Wrapper<DingdantousuEntity> wrapper);
	
	DingdantousuVO selectVO(@Param("ew") Wrapper<DingdantousuEntity> wrapper);
	
	List<DingdantousuView> selectListView(@Param("ew") Wrapper<DingdantousuEntity> wrapper);

	List<DingdantousuView> selectListView(Pagination page,@Param("ew") Wrapper<DingdantousuEntity> wrapper);
	
	DingdantousuView selectView(@Param("ew") Wrapper<DingdantousuEntity> wrapper);
	
}
