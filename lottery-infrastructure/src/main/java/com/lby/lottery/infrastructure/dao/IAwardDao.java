package com.lby.lottery.infrastructure.dao;

import com.lby.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IAwardDao {

    Award queryAwardInfo(String awardId);
}
