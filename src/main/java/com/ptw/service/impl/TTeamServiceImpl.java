package com.ptw.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.util.StringUtils;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.ptw.db.DataSource;
import com.ptw.db.DataSourceEnum;
import com.ptw.mapper.TTeamMapper;
import com.ptw.pojo.TTeam;
import com.ptw.service.TTeamService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yjiu123
 * @since 2019-01-12
 */
@Service
public class TTeamServiceImpl extends ServiceImpl<TTeamMapper, TTeam> implements TTeamService {
	@Autowired
	private TTeamMapper ttMapper;

	@Override
	public List<TTeam> selectByPage(Page page, String field, String order) {
		boolean flag = StringUtils.equals(order, "desc")?false:true;
		return ttMapper.selectPage(page, new EntityWrapper<TTeam>().orderBy(field, flag));
	}

	@Override
	public List<TTeam> selectByPage(Page page, String field, String order, String teamNo, String lineName,String teamLeader, String nationality) {
		boolean flag = StringUtils.equals(order, "desc")?false:true;
		EntityWrapper<TTeam> wrapper = new EntityWrapper<TTeam>();
		if(!StringUtils.isEmpty(teamNo)) {
			wrapper.like("team_no", teamNo);
		}
		if(!StringUtils.isEmpty(lineName)) {
			wrapper.like("line_name", lineName);
		}
		if(!StringUtils.isEmpty(teamLeader)) {
			wrapper.like("team_leader", teamLeader);
		}
		if(!StringUtils.isEmpty(nationality)) {
			wrapper.like("nationality", nationality);
		}
		wrapper.orderBy(field, flag);
		return ttMapper.selectPage(page, wrapper);
	}

	@Override
	@DataSource(DataSourceEnum.MySQL)
	public List<TTeam> All() {
		return ttMapper.selectList(null);
	}

	@Override
	public List<TTeam> getAll2() {
		// TODO Auto-generated method stub
		return ttMapper.getAll2();
	}
}
