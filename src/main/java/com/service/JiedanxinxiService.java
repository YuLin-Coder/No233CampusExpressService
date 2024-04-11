package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiedanxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiedanxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiedanxinxiView;


/**
 * 接单信息
 *
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface JiedanxinxiService extends IService<JiedanxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiedanxinxiVO> selectListVO(Wrapper<JiedanxinxiEntity> wrapper);
   	
   	JiedanxinxiVO selectVO(@Param("ew") Wrapper<JiedanxinxiEntity> wrapper);
   	
   	List<JiedanxinxiView> selectListView(Wrapper<JiedanxinxiEntity> wrapper);
   	
   	JiedanxinxiView selectView(@Param("ew") Wrapper<JiedanxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiedanxinxiEntity> wrapper);
   	
}

