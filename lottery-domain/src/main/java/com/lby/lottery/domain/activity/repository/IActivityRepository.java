package com.lby.lottery.domain.activity.repository;

import com.lby.lottery.common.Constants;
import com.lby.lottery.domain.activity.model.req.PartakeReq;
import com.lby.lottery.domain.activity.model.vo.*;

import java.util.List;

/**
 * 活动仓库服务(活动表、奖品表、策略表、策略明细表)
 * @author lby
 */
public interface IActivityRepository {

    /**
     * 添加活动配置
     * @param activity  活动配置
     */
    void addActivity(ActivityVO activity);

    /**
     * 添加奖品配置集合
     * @param awardList
     */
    void addAward(List<AwardVO> awardList);

    /**
     * 添加策略配置
     *
     * @param strategy 策略配置
     */
    void addStrategy(StrategyVO strategy);

    /**
     * 添加策略明细配置
     *
     * @param strategyDetailList 策略明细集合
     */
    void addStrategyDetailList(List<StrategyDetailVO> strategyDetailList);


    /**
     * 变更活动状态
     *
     * @param activityId    活动ID
     * @param beforeState   修改前状态
     * @param afterState    修改后状态
     * @return              更新结果
     */
    boolean alterStatus(Long activityId, Enum<Constants.ActivityState> beforeState, Enum<Constants.ActivityState> afterState);

    /**
     * 扣减活动库存
     * @param activityId   活动ID
     * @return      扣减结果
     */
    int subtractionActivityStock(Long activityId);

    /**
     * 查询活动账单信息【库存、状态、日期、个人参与次数】
     * @param req 参与活动请求
     * @return    活动账单
     */
    ActivityBillVO queryActivityBill(PartakeReq req);
}
