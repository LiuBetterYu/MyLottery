package com.lby.lottery.domain.award.service.goods.impl;

import com.lby.lottery.common.Constants;
import com.lby.lottery.domain.award.model.req.GoodsReq;
import com.lby.lottery.domain.award.model.res.DistributionRes;
import com.lby.lottery.domain.award.service.goods.DistributionBase;
import com.lby.lottery.domain.award.service.goods.IDistributionGoods;
import org.springframework.stereotype.Component;

/**
 * 优惠券商品
 * @author lby
 */
@Component
public class CouponGoods extends DistributionBase implements IDistributionGoods {
    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用优惠券发放接口
        logger.info("模拟调用优惠券发放接口 uId：{} awardContent：{}", req.getuId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getuId(), req.getOrderId(), req.getAwardId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());

        return new DistributionRes(req.getuId(), Constants.AwardState.SUCCESS.getCode(), Constants.AwardState.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return Constants.AwardType.CouponGoods.getCode();
    }
}
