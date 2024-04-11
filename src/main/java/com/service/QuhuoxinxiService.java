package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.QuhuoxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.QuhuoxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.QuhuoxinxiView;


/**
 * 取货信息
 *
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface QuhuoxinxiService extends IService<QuhuoxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<QuhuoxinxiVO> selectListVO(Wrapper<QuhuoxinxiEntity> wrapper);
   	
   	QuhuoxinxiVO selectVO(@Param("ew") Wrapper<QuhuoxinxiEntity> wrapper);
   	
   	List<QuhuoxinxiView> selectListView(Wrapper<QuhuoxinxiEntity> wrapper);
   	
   	QuhuoxinxiView selectView(@Param("ew") Wrapper<QuhuoxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<QuhuoxinxiEntity> wrapper);
   	
}

