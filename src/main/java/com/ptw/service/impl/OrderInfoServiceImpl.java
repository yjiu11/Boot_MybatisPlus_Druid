package com.ptw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSON;
import com.ptw.db.DataSource;
import com.ptw.db.DataSourceEnum;
import com.ptw.mapper.OrderInfoMapper;
import com.ptw.pojo.OrderInfo;
import com.ptw.service.OrderInfoService;

import lombok.extern.slf4j.Slf4j;
@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	@Autowired
	private OrderInfoMapper mapper;
	@Override
	@DataSource(DataSourceEnum.SQLServer)
	public String getByOrderNo_TeamNo(String orderNo, String teamNo) {
		List<OrderInfo> list = mapper.getByOrderNo_TeamNo(orderNo, teamNo);
		String input = JSON.toJSONString(list);
		return input;
	}
	@Override
	@DataSource(DataSourceEnum.SQLServer)
	public String orderAndGuest(String orderNo, String teamNo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	@DataSource(DataSourceEnum.SQLServer)
	public String getByTime(Integer hour) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	@DataSource(DataSourceEnum.SQLServer)
	public String getByStartAndEnd(String startTime, String endTime) {
		// TODO Auto-generated method stub
		return null;
	}
}
