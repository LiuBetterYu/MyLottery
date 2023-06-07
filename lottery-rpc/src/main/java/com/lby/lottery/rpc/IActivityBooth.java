package com.lby.lottery.rpc;

import com.lby.lottery.rpc.req.ActivityReq;
import com.lby.lottery.rpc.res.ActivityRes;

public interface IActivityBooth {

    ActivityRes queryActivityById(ActivityReq req);
}
