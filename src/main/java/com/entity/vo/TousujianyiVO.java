package com.entity.vo;

import com.entity.TousujianyiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;


/**
 * 投诉建议
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
public class TousujianyiVO  implements Serializable {
	private static final long serialVersionUID = 1L;


	/**
	 * 投诉建议
	 */

	private String tousujianyi;

	/**
	 * 日期
	 */

	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date riqi;

	/**
	 * 用户名
	 */

	private String yonghuming;

	/**
	 * 手机
	 */

	private String shouji;

	/**
	 * 是否审核
	 */

	private String sfsh;

	/**
	 * 审核回复
	 */

	private String shhf;


	/**
	 * 设置：投诉建议
	 */

	public void setTousujianyi(String tousujianyi) {
		this.tousujianyi = tousujianyi;
	}

	/**
	 * 获取：投诉建议
	 */
	public String getTousujianyi() {
		return tousujianyi;
	}


	/**
	 * 设置：日期
	 */

	public void setRiqi(Date riqi) {
		this.riqi = riqi;
	}

	/**
	 * 获取：日期
	 */
	public Date getRiqi() {
		return riqi;
	}


	/**
	 * 设置：用户名
	 */

	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}

	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
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
	 * 设置：是否审核
	 */

	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}

	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}


	/**
	 * 设置：审核回复
	 */

	public void setShhf(String shhf) {
		this.shhf = shhf;
	}

	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}

}
