package com.lby.lottery.application.process.res;

import com.lby.lottery.common.Result;
import com.lby.lottery.domain.strategy.model.vo.DrawAwardInfo;

/**
 * 活动抽奖结果
 * @author lby
 */
public class DrawProcessResult extends Result {

    private DrawAwardInfo drawAwardInfo;
    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardInfo drawAwardInfo) {
        super(code, info);
        this.drawAwardInfo = drawAwardInfo;
    }

    public DrawAwardInfo getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardInfo drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }
}
