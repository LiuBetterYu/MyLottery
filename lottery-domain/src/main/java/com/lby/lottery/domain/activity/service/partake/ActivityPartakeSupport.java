package com.lby.lottery.domain.activity.service.partake;

import com.lby.lottery.domain.activity.model.req.PartakeReq;
import com.lby.lottery.domain.activity.model.vo.ActivityBillVO;
import com.lby.lottery.domain.activity.repository.IActivityRepository;

import javax.annotation.Resource;

/**
 * 活动领取操作，一些通用的数据服务
 * @author lby
 */
public class ActivityPartakeSupport {

    @Resource
    protected IActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }
}
