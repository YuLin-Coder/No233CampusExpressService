package com.dao;

import com.entity.KuaidiyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.KuaidiyuanVO;
import com.entity.view.KuaidiyuanView;


/**
 * 快递员
 * 
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface KuaidiyuanDao extends BaseMapper<KuaidiyuanEntity> {
	
	List<KuaidiyuanVO> selectListVO(@Param("ew") Wrapper<KuaidiyuanEntity> wrapper);
	
	KuaidiyuanVO selectVO(@Param("ew") Wrapper<KuaidiyuanEntity> wrapper);
	
	List<KuaidiyuanView> selectListView(@Param("ew") Wrapper<KuaidiyuanEntity> wrapper);

	List<KuaidiyuanView> selectListView(Pagination page,@Param("ew") Wrapper<KuaidiyuanEntity> wrapper);
	
	KuaidiyuanView selectView(@Param("ew") Wrapper<KuaidiyuanEntity> wrapper);
	
}
