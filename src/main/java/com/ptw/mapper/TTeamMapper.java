package com.ptw.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.ptw.pojo.TTeam;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author yjiu123
 * @since 2019-01-12
 */
@Mapper
public interface TTeamMapper extends BaseMapper<TTeam> {
	public List<TTeam> getAll2();
}
