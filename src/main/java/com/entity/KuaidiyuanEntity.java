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
 * 快递员
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
@TableName("kuaidiyuan")
public class KuaidiyuanEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public KuaidiyuanEntity() {
		
	}
	
	public KuaidiyuanEntity(T t) {
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
	 * 快递员工号
	 */
					
	private String kuaidiyuangonghao;
	
	/**
	 * 密码
	 */
					
	private String mima;
	
	/**
	 * 快递员姓名
	 */
					
	private String kuaidiyuanxingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 快递公司
	 */
					
	private String kuaidigongsi;
	
	/**
	 * 联系电话
	 */
					
	private String lianxidianhua;
	
	/**
	 * 年龄
	 */
					
	private Integer nianling;
	
	/**
	 * 身份证
	 */
					
	private String shenfenzheng;
	
	/**
	 * 入职时间
	 */
					
	private String ruzhishijian;
	
	/**
	 * 个人履历
	 */
					
	private String gerenlvli;
	
	
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
	 * 设置：密码
	 */
	public void setMima(String mima) {
		this.mima = mima;
	}
	/**
	 * 获取：密码
	 */
	public String getMima() {
		return mima;
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
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：快递公司
	 */
	public void setKuaidigongsi(String kuaidigongsi) {
		this.kuaidigongsi = kuaidigongsi;
	}
	/**
	 * 获取：快递公司
	 */
	public String getKuaidigongsi() {
		return kuaidigongsi;
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
	public void setNianling(Integer nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getNianling() {
		return nianling;
	}
	/**
	 * 设置：身份证
	 */
	public void setShenfenzheng(String shenfenzheng) {
		this.shenfenzheng = shenfenzheng;
	}
	/**
	 * 获取：身份证
	 */
	public String getShenfenzheng() {
		return shenfenzheng;
	}
	/**
	 * 设置：入职时间
	 */
	public void setRuzhishijian(String ruzhishijian) {
		this.ruzhishijian = ruzhishijian;
	}
	/**
	 * 获取：入职时间
	 */
	public String getRuzhishijian() {
		return ruzhishijian;
	}
	/**
	 * 设置：个人履历
	 */
	public void setGerenlvli(String gerenlvli) {
		this.gerenlvli = gerenlvli;
	}
	/**
	 * 获取：个人履历
	 */
	public String getGerenlvli() {
		return gerenlvli;
	}

}
