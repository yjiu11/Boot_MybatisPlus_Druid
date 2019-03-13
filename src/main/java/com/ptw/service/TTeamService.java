package com.ptw.service;

import java.util.List;

import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.ptw.pojo.TTeam;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yjiu123
 * @since 2019-01-12
 */
public interface TTeamService extends IService<TTeam> {
	List<TTeam> getAll2();
	List<TTeam> All();
	//分页+排序+搜索
	List<TTeam> selectByPage(Page page,String field,String order);
	//分页+排序+搜索
	/***
	 * 
	 * @param page	分页信息
	 * @param field	排序字段
	 * @param order	正序、降序
	 * @param teamNo		搜索--团号
	 * @param lineName		搜索--线路名称
	 * @param teamLeader	搜索--领队
	 * @param nationality	搜索--国籍
	 * @return
	 */
	List<TTeam> selectByPage(Page page,String field,String order,String teamNo,String lineName,String teamLeader,String nationality);
}
