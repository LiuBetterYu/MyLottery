package com.lby.lottery.domain.award.service.goods.impl;

import com.lby.lottery.common.Constants;
import com.lby.lottery.domain.award.model.req.GoodsReq;
import com.lby.lottery.domain.award.model.res.DistributionRes;
import com.lby.lottery.domain.award.service.goods.DistributionBase;
import com.lby.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * 描述类商品，以文字形式展示给用户
 * @author lby
 */
@Component
public class DescGoods extends DistributionBase implements IDistributionGoods {
    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.DESC.getCode();
    }
}
