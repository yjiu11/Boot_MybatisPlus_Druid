package com.ptw.pojo;

import com.alibaba.fastjson.annotation.JSONField;
/**
 * 签证需要的订单相关数据项
 * @author fh
 */
public class OrderInfo {
	private String orderNo;
	private String teamNo;
	private String saleName;
	private String Status;
	private String newTeamNo;
	private String saleLoginName;
	private String CustomerName;
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getTeamNo() {
		return teamNo;
	}
	public void setTeamNo(String teamNo) {
		this.teamNo = teamNo;
	}
	public String getSaleName() {
		return saleName;
	}
	public void setSaleName(String saleName) {
		this.saleName = saleName;
	}
	@JSONField(name="Status")
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getNewTeamNo() {
		return newTeamNo;
	}
	public void setNewTeamNo(String newTeamNo) {
		this.newTeamNo = newTeamNo;
	}
	public String getSaleLoginName() {
		return saleLoginName;
	}
	public void setSaleLoginName(String saleLoginName) {
		this.saleLoginName = saleLoginName;
	}
	@JSONField(name="CustomerName")
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}
	@Override
	public String toString() {
		return "OrderInfo [orderNo=" + orderNo + ", teamNo=" + teamNo + ", saleName=" + saleName + ", Status=" + Status
				+ ", newTeamNo=" + newTeamNo + ", saleLoginName=" + saleLoginName + ", CustomerName=" + CustomerName
				+ "]";
	}
}
