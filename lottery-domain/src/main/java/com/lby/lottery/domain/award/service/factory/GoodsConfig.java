package com.lby.lottery.domain.award.service.factory;

import com.lby.lottery.common.Constants;
import com.lby.lottery.domain.award.service.goods.IDistributionGoods;
import com.lby.lottery.domain.award.service.goods.impl.CouponGoods;
import com.lby.lottery.domain.award.service.goods.impl.DescGoods;
import com.lby.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.lby.lottery.domain.award.service.goods.impl.RedeemCodeGoods;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 各类发奖奖品配置类
 * @author lby
 */
public class GoodsConfig {

    // 奖品发放策略组
    protected static Map<Integer, IDistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private DescGoods descGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(Constants.AwardType.DESC.getCode(), descGoods);
        goodsMap.put(Constants.AwardType.CouponGoods.getCode(), couponGoods);
        goodsMap.put(Constants.AwardType.PhysicalGoods.getCode(), physicalGoods);
        goodsMap.put(Constants.AwardType.RedeemCodeGoods.getCode(), redeemCodeGoods);
    }
}
