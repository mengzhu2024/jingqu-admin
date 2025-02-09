package com.entity.model;

import com.entity.JingqushangchengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 景区商城
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class JingqushangchengModel  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 分类
	 */

	private String fenlei;

	/**
	 * 图片
	 */

	private String tupian;

	/**
	 * 规格
	 */

	private String guige;

	/**
	 * 品牌
	 */

	private String pinpai;

	/**
	 * 详情
	 */

	private String xiangqing;

	/**
	 * 价格
	 */

	private Float price;


	/**
	 * 设置：分类
	 */

	public void setFenlei(String fenlei) {
		this.fenlei = fenlei;
	}

	/**
	 * 获取：分类
	 */
	public String getFenlei() {
		return fenlei;
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
	 * 设置：规格
	 */

	public void setGuige(String guige) {
		this.guige = guige;
	}

	/**
	 * 获取：规格
	 */
	public String getGuige() {
		return guige;
	}


	/**
	 * 设置：品牌
	 */

	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}

	/**
	 * 获取：品牌
	 */
	public String getPinpai() {
		return pinpai;
	}


	/**
	 * 设置：详情
	 */

	public void setXiangqing(String xiangqing) {
		this.xiangqing = xiangqing;
	}

	/**
	 * 获取：详情
	 */
	public String getXiangqing() {
		return xiangqing;
	}


	/**
	 * 设置：价格
	 */

	public void setPrice(Float price) {
		this.price = price;
	}

	/**
	 * 获取：价格
	 */
	public Float getPrice() {
		return price;
	}

}
