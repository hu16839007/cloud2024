package com.zjf.cloud.service;

import com.zjf.cloud.entities.Pay;

import java.util.List;

/**
 * @Author zjf
 * @Date 2024/2/27
 */
public interface PayService {

    public int add(Pay pay);
    public int delect(Integer id);
    public int update(Pay pay);

    public Pay getByld(Integer id);

    public List<Pay> getAll();



}
