package com.ptw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ptw.pojo.OrderInfo;

@Mapper
public interface OrderInfoMapper {
	public List<OrderInfo> getAll();
	public List<OrderInfo> getByOrderNo_TeamNo(@Param("orderNo")String orderNo,@Param("teamNo")String teamNo);
	/***
	 * 查找修改时间 > 传过来的时间，即time时间之后修改的订单信息
	 * @param time
	 * @return
	 */
	public List<OrderInfo> getByTime(@Param("time")String time);
	/***
	 * 查找指定时间段的团信息
	 * @param time
	 * @return
	 */
	public List<OrderInfo> getByStartAndEnd(@Param("startTime")String startTime,@Param("endTime")String endTime);
}
