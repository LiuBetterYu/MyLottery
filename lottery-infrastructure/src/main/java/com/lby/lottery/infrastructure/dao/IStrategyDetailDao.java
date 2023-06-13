package com.lby.lottery.infrastructure.dao;

import com.lby.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface IStrategyDetailDao {

    /**
     * 查询策略表详细配置
     * @param strategyId
     * @return
     */
    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

    /**
     * 查询无库存策略奖品ID
     * @param startegyId
     * @return
     */
    List<String> queryNoStockStrategyAwardList(Long startegyId);

    /**
     * 扣减库存
     * @param strategyDetailReq
     * @return
     */
    int deductStock(StrategyDetail strategyDetailReq);

    /**
     * 插入策略配置组
     * @param list
     */
    void insertList(List<StrategyDetail> list);
}
