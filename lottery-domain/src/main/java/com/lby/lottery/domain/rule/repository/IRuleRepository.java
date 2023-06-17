package com.lby.lottery.domain.rule.repository;

import com.lby.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * 规则信息仓储服务接口
 * @author lby
 */
public interface IRuleRepository {

    /**
     * 查询规则决策树配置
     * @param treeId  决策树Id
     * @return        决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);
}
