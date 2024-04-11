package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.KuaidixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.KuaidixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.KuaidixinxiView;


/**
 * 快递信息
 *
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public interface KuaidixinxiService extends IService<KuaidixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<KuaidixinxiVO> selectListVO(Wrapper<KuaidixinxiEntity> wrapper);
   	
   	KuaidixinxiVO selectVO(@Param("ew") Wrapper<KuaidixinxiEntity> wrapper);
   	
   	List<KuaidixinxiView> selectListView(Wrapper<KuaidixinxiEntity> wrapper);
   	
   	KuaidixinxiView selectView(@Param("ew") Wrapper<KuaidixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<KuaidixinxiEntity> wrapper);
   	
}

