package com.zjf.cloud.apis;

import com.zjf.cloud.resp.ResultData;
import com.zjf.cloud.resp.ReturnCodeEnum;
import org.springframework.stereotype.Component;

/**
 * @Author zjf
 * @Date 2024/2/28
 */
@Component
public class PayFeignSentinelApiFallBack implements PayFeignSentinelApi{
    @Override
    public ResultData getPayByOrderNo(String orderNo) {
        return ResultData.fail(ReturnCodeEnum.RC500.getCode(),"对方服务宕机或不可用，FallBack服务降级o(╥﹏╥)o");
    }
}
