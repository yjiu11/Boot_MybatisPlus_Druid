package com.ptw.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ptw.App;
import com.ptw.pojo.TTeam;
import com.ptw.service.OrderInfoService;
import com.ptw.service.TTeamService;

@RunWith(SpringJUnit4ClassRunner.class) // 让junit与spring环境进行整合
@SpringBootTest(classes = { App.class }) // 自动加载spring相关的配置文件
public class TestMain {
	@Autowired
	private OrderInfoService orderService;
	@Autowired
	private TTeamService teamService;
	@Test
	public void t1() {
		String result = orderService.getByOrderNo_TeamNo("DBJ19-01775","SITSBJ-1903-22EU-PCZ13");
		System.out.println(result);
	}
	@Test
	public void t2() {
		List<TTeam> list = teamService.getAll2();
		System.out.println(list);
	}
}
