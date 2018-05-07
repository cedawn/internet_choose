package com.gch.common.utils;

import java.io.Serializable;

import org.apache.poi.xssf.usermodel.XSSFCellStyle;

public class ExcelBean implements  Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String headTextName; //��ͷ�����⣩��  
    private String propertyName; //��Ӧ�ֶ���  
    private Integer cols; //�ϲ���Ԫ����  
    private XSSFCellStyle cellStyle;   
	public ExcelBean() {
		super();
		
	}
	public ExcelBean(String headTextName, String propertyName) {
		super();
		this.headTextName = headTextName;
		this.propertyName = propertyName;
	}

	public ExcelBean(String headTextName, String propertyName, Integer cols) {
		super();
		this.headTextName = headTextName;
		this.propertyName = propertyName;
		this.cols = cols;
	}
	public String getHeadTextName() {
		return headTextName;
	}
	public void setHeadTextName(String headTextName) {
		this.headTextName = headTextName;
	}
	public String getPropertyName() {
		return propertyName;
	}
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	public Integer getCols() {
		return cols;
	}
	public void setCols(Integer cols) {
		this.cols = cols;
	}
	public XSSFCellStyle getCellStyle() {
		return cellStyle;
	}
	public void setCellStyle(XSSFCellStyle cellStyle) {
		this.cellStyle = cellStyle;
	}  
    
}
