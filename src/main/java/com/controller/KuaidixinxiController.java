package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.KuaidixinxiEntity;
import com.entity.view.KuaidixinxiView;

import com.service.KuaidixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 快递信息
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
@RestController
@RequestMapping("/kuaidixinxi")
public class KuaidixinxiController {
    @Autowired
    private KuaidixinxiService kuaidixinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			kuaidixinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KuaidixinxiEntity> ew = new EntityWrapper<KuaidixinxiEntity>();
		PageUtils page = kuaidixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kuaidixinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			kuaidixinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<KuaidixinxiEntity> ew = new EntityWrapper<KuaidixinxiEntity>();
		PageUtils page = kuaidixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, kuaidixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( KuaidixinxiEntity kuaidixinxi){
       	EntityWrapper<KuaidixinxiEntity> ew = new EntityWrapper<KuaidixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( kuaidixinxi, "kuaidixinxi")); 
        return R.ok().put("data", kuaidixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(KuaidixinxiEntity kuaidixinxi){
        EntityWrapper< KuaidixinxiEntity> ew = new EntityWrapper< KuaidixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( kuaidixinxi, "kuaidixinxi")); 
		KuaidixinxiView kuaidixinxiView =  kuaidixinxiService.selectView(ew);
		return R.ok("查询快递信息成功").put("data", kuaidixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        KuaidixinxiEntity kuaidixinxi = kuaidixinxiService.selectById(id);
        return R.ok().put("data", kuaidixinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        KuaidixinxiEntity kuaidixinxi = kuaidixinxiService.selectById(id);
        return R.ok().put("data", kuaidixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){
    	kuaidixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kuaidixinxi);

        kuaidixinxiService.insert(kuaidixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){
    	kuaidixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(kuaidixinxi);
    	kuaidixinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        kuaidixinxiService.insert(kuaidixinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody KuaidixinxiEntity kuaidixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(kuaidixinxi);
        kuaidixinxiService.updateById(kuaidixinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        kuaidixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<KuaidixinxiEntity> wrapper = new EntityWrapper<KuaidixinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = kuaidixinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
