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

import com.entity.DingdantousuEntity;
import com.entity.view.DingdantousuView;

import com.service.DingdantousuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 订单投诉
 * 后端接口
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
@RestController
@RequestMapping("/dingdantousu")
public class DingdantousuController {
    @Autowired
    private DingdantousuService dingdantousuService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DingdantousuEntity dingdantousu, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kuaidiyuan")) {
			dingdantousu.setKuaidiyuangonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			dingdantousu.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DingdantousuEntity> ew = new EntityWrapper<DingdantousuEntity>();
		PageUtils page = dingdantousuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdantousu), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DingdantousuEntity dingdantousu, HttpServletRequest request){
        EntityWrapper<DingdantousuEntity> ew = new EntityWrapper<DingdantousuEntity>();
		PageUtils page = dingdantousuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, dingdantousu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DingdantousuEntity dingdantousu){
       	EntityWrapper<DingdantousuEntity> ew = new EntityWrapper<DingdantousuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( dingdantousu, "dingdantousu")); 
        return R.ok().put("data", dingdantousuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DingdantousuEntity dingdantousu){
        EntityWrapper< DingdantousuEntity> ew = new EntityWrapper< DingdantousuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( dingdantousu, "dingdantousu")); 
		DingdantousuView dingdantousuView =  dingdantousuService.selectView(ew);
		return R.ok("查询订单投诉成功").put("data", dingdantousuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") String id){
        DingdantousuEntity dingdantousu = dingdantousuService.selectById(id);
        return R.ok().put("data", dingdantousu);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") String id){
        DingdantousuEntity dingdantousu = dingdantousuService.selectById(id);
        return R.ok().put("data", dingdantousu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DingdantousuEntity dingdantousu, HttpServletRequest request){
    	dingdantousu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dingdantousu);

        dingdantousuService.insert(dingdantousu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DingdantousuEntity dingdantousu, HttpServletRequest request){
    	dingdantousu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(dingdantousu);

        dingdantousuService.insert(dingdantousu);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody DingdantousuEntity dingdantousu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(dingdantousu);
        dingdantousuService.updateById(dingdantousu);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        dingdantousuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DingdantousuEntity> wrapper = new EntityWrapper<DingdantousuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("kuaidiyuan")) {
			wrapper.eq("kuaidiyuangonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}

		int count = dingdantousuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
