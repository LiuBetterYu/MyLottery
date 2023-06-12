package com.lby.lottery.domain.strategy.repository.impl;

import com.lby.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.lby.lottery.domain.strategy.repository.IStrategyRepository;
import com.lby.lottery.infrastructure.dao.IAwardDao;
import com.lby.lottery.infrastructure.dao.IStrategyDao;
import com.lby.lottery.infrastructure.dao.IStrategyDetailDao;
import com.lby.lottery.infrastructure.po.Award;
import com.lby.lottery.infrastructure.po.Strategy;
import com.lby.lottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * 策略表仓储服务
 */
@Component
public class StrategyRepository implements IStrategyRepository {

    @Resource
    private IAwardDao awardDao;

    @Resource
    private IStrategyDao strategyDao;

    @Resource
    private IStrategyDetailDao strategyDetailDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetails = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetails);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return strategyDetailDao.queryNoStockStrategyAwardList(strategyId);
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        StrategyDetail req = new StrategyDetail();
        req.setStrategyId(strategyId);
        req.setAwardId(awardId);
        int count = strategyDetailDao.deductStock(req);
        return count == 1;
    }
}
