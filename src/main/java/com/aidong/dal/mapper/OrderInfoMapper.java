package com.aidong.dal.mapper;

import com.aidong.dal.entity.OrderInfo;
import java.util.List;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(String orderNo);

    int insert(OrderInfo record);

    OrderInfo selectByPrimaryKey(String orderNo);

    List<OrderInfo> selectAll();

    int updateByPrimaryKey(OrderInfo record);
}