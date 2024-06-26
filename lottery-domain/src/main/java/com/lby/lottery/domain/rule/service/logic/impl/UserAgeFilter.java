package com.lby.lottery.domain.rule.service.logic.impl;

import com.lby.lottery.domain.rule.model.req.DecisionMatterReq;
import com.lby.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * 年龄规则
 * @author lby
 */
@Component
public class UserAgeFilter extends BaseLogic {
    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }
}
