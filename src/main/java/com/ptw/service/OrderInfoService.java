package com.ptw.service;

public interface OrderInfoService {
	/**
	 * 根据团号、订单号，手工同步订单信息
	 * @param orderNo
	 * @param teamNo
	 * @return
	 */
	public String getByOrderNo_TeamNo(String orderNo,String teamNo);
	/**
	 * 同时同步订单+
	 * @param orderNo
	 * @param teamNo
	 * @return
	 */
	public String orderAndGuest(String orderNo,String teamNo);
	/**
	 * 查询近hour小时内的订单,可为null，默认1小时
	 * @param hour	
	 * @return
	 */
	public String getByTime(Integer hour);
	public String getByStartAndEnd(String startTime,String endTime);
}
