package com.lby.lottery.infrastructure.dao;

import com.lby.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;

/**
 * 策略表Dao
 * @author lby
 */
@Mapper
public interface IStrategyDao {

    /**
     * 查询策略配置
     * @param strategyId
     * @return
     */
    Strategy queryStrategy(Long strategyId);

    /**
     * 插入策略配置
     * @param req
     */
    void insert(Strategy req);
}
