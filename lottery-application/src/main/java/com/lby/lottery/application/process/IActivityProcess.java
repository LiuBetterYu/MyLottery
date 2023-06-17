package com.lby.lottery.application.process;

import com.lby.lottery.application.process.req.DrawProcessReq;
import com.lby.lottery.application.process.res.DrawProcessResult;

/**
 * 抽奖活动流程编排接口
 * @author lby
 */
public interface IActivityProcess {

    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);
}
