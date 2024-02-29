package com.zjf.cloud.service;

import com.zjf.cloud.entities.Order;

/**
 * @Author zjf
 * @Date 2024/2/29
 */
public interface OrderService {
    /**
     * 创建订单
     */
    void create(Order order);
}
