package com.li.arcweb.common.excel;

/**
 * The Class CellDataType.
 * 列数据定义
 *
 * @company Shanghai HHJR Software Systems CO.,LTD.
 * @author 
 * @since 2014
 * @version 1.0.0
 */
public class CellDataType {

	/** 属性名. */
	private String propName;

	/** 显示列名. */
	private String showName;
	
	/** 是否统计列总数.  */
	private boolean flag;

	/** 渲染方式. */
	private CellDataRender render;

	/**
	 * Instantiates a new cell data type. with default type.
	 * 
	 * @param propName
	 *            the prop name
	 * @param showName
	 *            the show name
	 */
	public CellDataType(String propName, String showName) {
		this(propName, showName, CellDataRender.defaultText);
	}

	/**
	 * Instantiates a new cell data type.
	 *
	 * @param propName the prop name
	 * @param showName the show name
	 * @param render the render
	 */
	public CellDataType(String propName, String showName, CellDataRender render) {
		this.propName = propName;
		this.showName = showName;
		this.render = render;
	}
	
	/**
	 * Instantiates a new cell data type.
	 *
	 * @param propName the prop name
	 * @param showName the show name
	 * @param render the render
	 */
	public CellDataType(String propName, String showName, CellDataRender render,boolean flag) {
		this.propName = propName;
		this.showName = showName;
		this.render = render;
		this.flag = flag;
	}

	/**
	 * Gets the prop name.
	 * 
	 * @return the prop name
	 */
	public String getPropName() {
		return propName;
	}

	/**
	 * Sets the prop name.
	 * 
	 * @param propName
	 *            the new prop name
	 */
	public void setPropName(String propName) {
		this.propName = propName;
	}

	/**
	 * Gets the show name.
	 * 
	 * @return the show name
	 */
	public String getShowName() {
		return showName;
	}

	/**
	 * Sets the show name.
	 * 
	 * @param showName
	 *            the new show name
	 */
	public void setShowName(String showName) {
		this.showName = showName;
	}

	/**
	 * 获取 渲染方式.
	 *
	 * @return the render
	 */
	public CellDataRender getRender() {
		return render;
	}

	/**
	 * 设置 渲染方式.
	 *
	 * @param render the render to set
	 */
	public void setRender(CellDataRender render) {
		this.render = render;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean falg) {
		this.flag = falg;
	}

	
}
