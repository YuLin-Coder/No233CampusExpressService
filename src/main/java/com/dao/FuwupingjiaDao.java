package com.dao;

import com.entity.FuwupingjiaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FuwupingjiaVO;
import com.entity.view.FuwupingjiaView;


/**
 * 服务评价
 * 
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface FuwupingjiaDao extends BaseMapper<FuwupingjiaEntity> {
	
	List<FuwupingjiaVO> selectListVO(@Param("ew") Wrapper<FuwupingjiaEntity> wrapper);
	
	FuwupingjiaVO selectVO(@Param("ew") Wrapper<FuwupingjiaEntity> wrapper);
	
	List<FuwupingjiaView> selectListView(@Param("ew") Wrapper<FuwupingjiaEntity> wrapper);

	List<FuwupingjiaView> selectListView(Pagination page,@Param("ew") Wrapper<FuwupingjiaEntity> wrapper);
	
	FuwupingjiaView selectView(@Param("ew") Wrapper<FuwupingjiaEntity> wrapper);
	
}
