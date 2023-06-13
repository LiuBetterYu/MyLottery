package com.lby.lottery.domain.strategy.repository;

import com.lby.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.lby.lottery.domain.strategy.model.vo.AwardBriefVO;


import java.util.List;

/**
 * 策略表仓储服务
 */
public interface IStrategyRepository {

    StrategyRich queryStrategyRich(Long strategyId);

    AwardBriefVO queryAwardInfo(String awardId);

    List<String> queryNoStockStrategyAwardList(Long strategyId);

    boolean deductStock(Long strategyId, String awardId);
}
