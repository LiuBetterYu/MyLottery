package com.lby.lottery.infrastructure.dao;

import com.lby.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 奖品信息表DAO
 * @author lby
 */
@Mapper
public interface IAwardDao {

    /**
     * 查询奖品信息
     * @param awardId
     * @return
     */
    Award queryAwardInfo(String awardId);

    /**
     * 插入奖品配置
     * @param list
     */
    void insertList(List<Award> list);
}
