package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KuaidiyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KuaidiyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KuaidiyuanView;


/**
 * 快递员
 *
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface KuaidiyuanService extends IService<KuaidiyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KuaidiyuanVO> selectListVO(Wrapper<KuaidiyuanEntity> wrapper);
   	
   	KuaidiyuanVO selectVO(@Param("ew") Wrapper<KuaidiyuanEntity> wrapper);
   	
   	List<KuaidiyuanView> selectListView(Wrapper<KuaidiyuanEntity> wrapper);
   	
   	KuaidiyuanView selectView(@Param("ew") Wrapper<KuaidiyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KuaidiyuanEntity> wrapper);
   	
}

