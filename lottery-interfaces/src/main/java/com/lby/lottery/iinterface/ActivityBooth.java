package com.lby.lottery.iinterface;

import com.lby.lottery.common.Constants;
import com.lby.lottery.common.Result;
import com.lby.lottery.infrastructure.dao.IActivityDao;
import com.lby.lottery.infrastructure.po.Activity;
import com.lby.lottery.rpc.IActivityBooth;
import com.lby.lottery.rpc.dto.ActivityDto;
import com.lby.lottery.rpc.req.ActivityReq;
import com.lby.lottery.rpc.res.ActivityRes;
import org.apache.dubbo.config.annotation.Service;


import javax.annotation.Resource;

@Service
public class ActivityBooth implements IActivityBooth {

    @Resource
    private IActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {
        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = new ActivityDto();
        activityDto.setActivityId(activity.getActivityId());
        activityDto.setActivityDesc(activity.getActivityDesc());
        activityDto.setActivityName(activity.getActivityName());
        activityDto.setBeginDateTime(activity.getBeginDateTime());
        activityDto.setEndDateTime(activity.getEndDateTime());
        activityDto.setStockCount(activity.getStockCount());
        activityDto.setTakeCount(activity.getTakeCount());

        return new ActivityRes(new Result(Constants.ResponseCode.SUCCESS.getCode(), Constants.ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
