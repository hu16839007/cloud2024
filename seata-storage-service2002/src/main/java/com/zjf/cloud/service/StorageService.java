package com.zjf.cloud.service;

/**
 * @Author zjf
 * @Date 2024/2/29
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
