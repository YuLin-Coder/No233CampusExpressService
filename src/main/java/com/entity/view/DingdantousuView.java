package com.entity.view;

import com.entity.DingdantousuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 订单投诉
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
@TableName("dingdantousu")
public class DingdantousuView  extends DingdantousuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingdantousuView(){
	}
 
 	public DingdantousuView(DingdantousuEntity dingdantousuEntity){
 	try {
			BeanUtils.copyProperties(this, dingdantousuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
