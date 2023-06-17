package com.lby.lottery.domain.rule.service.engine.impl;

import com.lby.lottery.domain.rule.model.aggregates.TreeRuleRich;
import com.lby.lottery.domain.rule.model.req.DecisionMatterReq;
import com.lby.lottery.domain.rule.model.res.EngineResult;
import com.lby.lottery.domain.rule.model.vo.TreeNodeVO;
import com.lby.lottery.domain.rule.repository.IRuleRepository;
import com.lby.lottery.domain.rule.service.engine.EngineBase;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 规则引擎处理器
 * @author lby
 */
@Service("ruleEngineHandle")
public class RuleEngineHandle extends EngineBase {

    @Resource
    private IRuleRepository iRuleRepository;

    @Override
    public EngineResult process(DecisionMatterReq matter) {
        // 决策规则树
        TreeRuleRich treeRuleRich = iRuleRepository.queryTreeRuleRich(matter.getTreeId());
        if (null == treeRuleRich) {
            throw new RuntimeException("Tree Rule is null");
        }

        // 决策节点
        TreeNodeVO treeNodeInfo = engineDecisionMaker(treeRuleRich, matter);

        // 决策结果
        return new EngineResult(matter.getUserId(), treeNodeInfo.getTreeId(), treeNodeInfo.getTreeNodeId(), treeNodeInfo.getNodeValue());
    }
}
