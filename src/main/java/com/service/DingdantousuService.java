package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingdantousuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingdantousuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingdantousuView;


/**
 * 订单投诉
 *
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface DingdantousuService extends IService<DingdantousuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingdantousuVO> selectListVO(Wrapper<DingdantousuEntity> wrapper);
   	
   	DingdantousuVO selectVO(@Param("ew") Wrapper<DingdantousuEntity> wrapper);
   	
   	List<DingdantousuView> selectListView(Wrapper<DingdantousuEntity> wrapper);
   	
   	DingdantousuView selectView(@Param("ew") Wrapper<DingdantousuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingdantousuEntity> wrapper);
   	
}

