package com.lby.lottery.domain.activity.service.partake;

import com.lby.lottery.domain.activity.model.req.PartakeReq;
import com.lby.lottery.domain.activity.model.res.PartakeResult;

/**
 * 抽奖活动参与接口
 * @author lby
 */
public interface IActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return  领取结果
     */
    PartakeResult doPartake(PartakeReq req);
}
