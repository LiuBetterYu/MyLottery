package com.lby.lottery.domain.strategy.repository;

import com.lby.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.lby.lottery.infrastructure.po.Award;

public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    Award queryAwardInfo(String awardId);
}
