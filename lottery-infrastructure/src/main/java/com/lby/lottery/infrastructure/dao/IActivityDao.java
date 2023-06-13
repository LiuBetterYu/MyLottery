package com.lby.lottery.infrastructure.dao;

import com.lby.lottery.domain.activity.model.vo.AlterStateVO;
import com.lby.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 活动基础信息表DAO
 * @author lby
 */
@Mapper
public interface IActivityDao {

    /**
     * 插入数据
     * @param req
     */
    void insert(Activity req);

    /**
     * 根据活动号查询活动信息
     * @param activityId
     * @return
     */
    Activity queryActivityById(Long activityId);

    /**
     * 变更活动状态
     * @param alterStateVO
     * @return
     */
    int alterState(AlterStateVO alterStateVO);
}
