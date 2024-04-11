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

import com.entity.QuhuoxinxiEntity;
import com.entity.view.QuhuoxinxiView;

import com.service.QuhuoxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 取货信息
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
@RestController
@RequestMapping("/quhuoxinxi")
public class QuhuoxinxiController {
    @Autowired
    private QuhuoxinxiService quhuoxinxiService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,QuhuoxinxiEntity quhuoxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			quhuoxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kuaidiyuan")) {
			quhuoxinxi.setKuaidiyuangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuhuoxinxiEntity> ew = new EntityWrapper<QuhuoxinxiEntity>();
		PageUtils page = quhuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quhuoxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,QuhuoxinxiEntity quhuoxinxi, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			quhuoxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("kuaidiyuan")) {
			quhuoxinxi.setKuaidiyuangonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<QuhuoxinxiEntity> ew = new EntityWrapper<QuhuoxinxiEntity>();
		PageUtils page = quhuoxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, quhuoxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( QuhuoxinxiEntity quhuoxinxi){
       	EntityWrapper<QuhuoxinxiEntity> ew = new EntityWrapper<QuhuoxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( quhuoxinxi, "quhuoxinxi")); 
        return R.ok().put("data", quhuoxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(QuhuoxinxiEntity quhuoxinxi){
        EntityWrapper< QuhuoxinxiEntity> ew = new EntityWrapper< QuhuoxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( quhuoxinxi, "quhuoxinxi")); 
		QuhuoxinxiView quhuoxinxiView =  quhuoxinxiService.selectView(ew);
		return R.ok("查询取货信息成功").put("data", quhuoxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        QuhuoxinxiEntity quhuoxinxi = quhuoxinxiService.selectById(id);
        return R.ok().put("data", quhuoxinxi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        QuhuoxinxiEntity quhuoxinxi = quhuoxinxiService.selectById(id);
        return R.ok().put("data", quhuoxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody QuhuoxinxiEntity quhuoxinxi, HttpServletRequest request){
    	quhuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quhuoxinxi);

        quhuoxinxiService.insert(quhuoxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody QuhuoxinxiEntity quhuoxinxi, HttpServletRequest request){
    	quhuoxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(quhuoxinxi);
    	quhuoxinxi.setUserid((Long)request.getSession().getAttribute("userId"));

        quhuoxinxiService.insert(quhuoxinxi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody QuhuoxinxiEntity quhuoxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(quhuoxinxi);
        quhuoxinxiService.updateById(quhuoxinxi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        quhuoxinxiService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<QuhuoxinxiEntity> wrapper = new EntityWrapper<QuhuoxinxiEntity>();
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
		if(tableName.equals("kuaidiyuan")) {
			wrapper.eq("kuaidiyuangonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = quhuoxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
