package com.entity.model;

import com.entity.JiedanxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 接单信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-02 20:04:37
 */
public class JiedanxinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	
	private String shuliang;
		
	/**
	 * 运费险
	 */
	
	private String yunfeixian;
		
	/**
	 * 派发状态
	 */
	
	private String paifazhuangtai;
		
	/**
	 * 状态更新
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zhuangtaigengxin;
		
	/**
	 * 学号
	 */
	
	private String xuehao;
		
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
	 * 快递费用
	 */
	
	private Integer kuaidifeiyong;
		
	/**
	 * 快递员工号
	 */
	
	private String kuaidiyuangonghao;
		
	/**
	 * 快递员姓名
	 */
	
	private String kuaidiyuanxingming;
		
	/**
	 * 年龄
	 */
	
	private String nianling;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 快递公司
	 */
	
	private String kuaidigongsi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 
	public void setShuliang(String shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public String getShuliang() {
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
	 * 设置：派发状态
	 */
	 
	public void setPaifazhuangtai(String paifazhuangtai) {
		this.paifazhuangtai = paifazhuangtai;
	}
	
	/**
	 * 获取：派发状态
	 */
	public String getPaifazhuangtai() {
		return paifazhuangtai;
	}
				
	
	/**
	 * 设置：状态更新
	 */
	 
	public void setZhuangtaigengxin(Date zhuangtaigengxin) {
		this.zhuangtaigengxin = zhuangtaigengxin;
	}
	
	/**
	 * 获取：状态更新
	 */
	public Date getZhuangtaigengxin() {
		return zhuangtaigengxin;
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
	 * 设置：快递费用
	 */
	 
	public void setKuaidifeiyong(Integer kuaidifeiyong) {
		this.kuaidifeiyong = kuaidifeiyong;
	}
	
	/**
	 * 获取：快递费用
	 */
	public Integer getKuaidifeiyong() {
		return kuaidifeiyong;
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
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
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
