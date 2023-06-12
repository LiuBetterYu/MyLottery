package com.lby.lottery.domain.strategy.service.draw;

import com.lby.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.lby.lottery.domain.strategy.repository.IStrategyRepository;
import com.lby.lottery.infrastructure.po.Award;

import javax.annotation.Resource;

/**
 * 抽奖策略数据支撑，一些通用的数据服务
 */
public class DrawStrategySupport extends DrawConfig{

    @Resource
    protected IStrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     * @param strategyId
     * @return
     */
    protected StrategyRich queryStrategyRich(Long strategyId) {
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     * @param awardId
     * @return
     */
    protected Award queryAwardInfoByAwardId(String awardId) {
        return strategyRepository.queryAwardInfo(awardId);
    }
}
