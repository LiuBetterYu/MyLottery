package com.lby.lottery.domain.activity.model.res;

import com.lby.lottery.common.Result;

/**
 * 活动参与结果
 * @author lby
 */
public class PartakeResult extends Result {

    /**
     * 策略ID
     */
    private Long strategyId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
