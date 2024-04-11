package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FuwupingjiaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FuwupingjiaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FuwupingjiaView;


/**
 * 服务评价
 *
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface FuwupingjiaService extends IService<FuwupingjiaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FuwupingjiaVO> selectListVO(Wrapper<FuwupingjiaEntity> wrapper);
   	
   	FuwupingjiaVO selectVO(@Param("ew") Wrapper<FuwupingjiaEntity> wrapper);
   	
   	List<FuwupingjiaView> selectListView(Wrapper<FuwupingjiaEntity> wrapper);
   	
   	FuwupingjiaView selectView(@Param("ew") Wrapper<FuwupingjiaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FuwupingjiaEntity> wrapper);
   	
}

