package com.lby.lottery.domain.activity.service.deploy;

import com.lby.lottery.domain.activity.model.req.ActivityConfigReq;

/**
 * 部署活动配置接口
 * @author lby
 */
public interface IActivityDeploy {

    /**
     * 创建活动信息
     * @param req  活动配置信息
     */
    void createActivity(ActivityConfigReq req);

    /**
     * 修改活动信息
     * @param req
     */
    void updateActivity(ActivityConfigReq req);
}
