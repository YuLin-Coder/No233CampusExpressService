package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 取货信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
@TableName("quhuoxinxi")
public class QuhuoxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public QuhuoxinxiEntity() {
		
	}
	
	public QuhuoxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 快递编号
	 */
					
	private String kuaidibianhao;
	
	/**
	 * 商品名称
	 */
					
	private String shangpinmingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 运费险
	 */
					
	private String yunfeixian;
	
	/**
	 * 快递状态
	 */
					
	private String kuaidizhuangtai;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 大学
	 */
					
	private String daxue;
	
	/**
	 * 班级
	 */
					
	private String banji;
	
	/**
	 * 楼栋
	 */
					
	private String loudong;
	
	/**
	 * 楼层
	 */
					
	private String louceng;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 快递员工号
	 */
					
	private String kuaidiyuangonghao;
	
	/**
	 * 快递员姓名
	 */
					
	private String kuaidiyuanxingming;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：快递编号
	 */
	public void setKuaidibianhao(String kuaidibianhao) {
		this.kuaidibianhao = kuaidibianhao;
	}
	/**
	 * 获取：快递编号
	 */
	public String getKuaidibianhao() {
		return kuaidibianhao;
	}
	/**
	 * 设置：商品名称
	 */
	public void setShangpinmingcheng(String shangpinmingcheng) {
		this.shangpinmingcheng = shangpinmingcheng;
	}
	/**
	 * 获取：商品名称
	 */
	public String getShangpinmingcheng() {
		return shangpinmingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：运费险
	 */
	public void setYunfeixian(String yunfeixian) {
		this.yunfeixian = yunfeixian;
	}
	/**
	 * 获取：运费险
	 */
	public String getYunfeixian() {
		return yunfeixian;
	}
	/**
	 * 设置：快递状态
	 */
	public void setKuaidizhuangtai(String kuaidizhuangtai) {
		this.kuaidizhuangtai = kuaidizhuangtai;
	}
	/**
	 * 获取：快递状态
	 */
	public String getKuaidizhuangtai() {
		return kuaidizhuangtai;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：大学
	 */
	public void setDaxue(String daxue) {
		this.daxue = daxue;
	}
	/**
	 * 获取：大学
	 */
	public String getDaxue() {
		return daxue;
	}
	/**
	 * 设置：班级
	 */
	public void setBanji(String banji) {
		this.banji = banji;
	}
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
	/**
	 * 设置：楼栋
	 */
	public void setLoudong(String loudong) {
		this.loudong = loudong;
	}
	/**
	 * 获取：楼栋
	 */
	public String getLoudong() {
		return loudong;
	}
	/**
	 * 设置：楼层
	 */
	public void setLouceng(String louceng) {
		this.louceng = louceng;
	}
	/**
	 * 获取：楼层
	 */
	public String getLouceng() {
		return louceng;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：快递员工号
	 */
	public void setKuaidiyuangonghao(String kuaidiyuangonghao) {
		this.kuaidiyuangonghao = kuaidiyuangonghao;
	}
	/**
	 * 获取：快递员工号
	 */
	public String getKuaidiyuangonghao() {
		return kuaidiyuangonghao;
	}
	/**
	 * 设置：快递员姓名
	 */
	public void setKuaidiyuanxingming(String kuaidiyuanxingming) {
		this.kuaidiyuanxingming = kuaidiyuanxingming;
	}
	/**
	 * 获取：快递员姓名
	 */
	public String getKuaidiyuanxingming() {
		return kuaidiyuanxingming;
	}
	/**
	 * 设置：联系电话
	 */
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
