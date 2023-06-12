package com.lby.lottery.domain.strategy.repository;

import com.lby.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.lby.lottery.infrastructure.po.Award;

import java.util.List;

/**
 * 策略表仓储服务
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    boolean deductStock(Long strategyId, String awardId);
}
