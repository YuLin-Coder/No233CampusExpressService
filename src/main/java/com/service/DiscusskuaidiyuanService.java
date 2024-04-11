package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusskuaidiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusskuaidiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusskuaidiyuanView;


/**
 * 快递员评论表
 *
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface DiscusskuaidiyuanService extends IService<DiscusskuaidiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusskuaidiyuanVO> selectListVO(Wrapper<DiscusskuaidiyuanEntity> wrapper);
   	
   	DiscusskuaidiyuanVO selectVO(@Param("ew") Wrapper<DiscusskuaidiyuanEntity> wrapper);
   	
   	List<DiscusskuaidiyuanView> selectListView(Wrapper<DiscusskuaidiyuanEntity> wrapper);
   	
   	DiscusskuaidiyuanView selectView(@Param("ew") Wrapper<DiscusskuaidiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusskuaidiyuanEntity> wrapper);
   	
}

