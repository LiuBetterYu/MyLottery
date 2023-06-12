package com.lby.lottery.domain.strategy.service.draw;

import com.lby.lottery.domain.strategy.model.req.DrawReq;
import com.lby.lottery.domain.strategy.model.res.DrawResult;

public interface IDrawExec {

    /**
     * 抽奖业务
     * @param req
     * @return
     */
    DrawResult doDrawExec(DrawReq req);
}
