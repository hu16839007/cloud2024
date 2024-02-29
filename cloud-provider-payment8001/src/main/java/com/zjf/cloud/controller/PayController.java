package com.zjf.cloud.controller;

import com.zjf.cloud.entities.Pay;
import com.zjf.cloud.entities.PayDTO;
import com.zjf.cloud.resp.ResultData;
import com.zjf.cloud.resp.ReturnCodeEnum;
import com.zjf.cloud.service.PayService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author zjf
 * @Date 2024/2/27
 */
@RestController
@Slf4j
@Tag(name = "支付微服务模块",description = "支付CRUD")
public class PayController {

    @Resource
    private PayService payService;

    @PostMapping(value = "/pay/add")
    @Operation(summary = "新增",description = "新增支付流水方法,json串做参数")
    public ResultData<String> addPay(@RequestBody Pay pay){

        System.out.println(pay.toString());
        int i = payService.add(pay);
        return ResultData.success("成功插入记录，返回值："+i);
    }

    @DeleteMapping(value = "/pay/del/{id}")
    @Operation(summary = "删除",description = "删除支付流水方法")
    public ResultData<Integer> delectPay(@PathVariable("id") Integer id){
        int i = payService.delect(id);
        return ResultData.success(i);
    }

    @PutMapping("/pay/update")
    @Operation(summary = "修改",description = "修改支付流水方法")
    public ResultData<String> updatePay(@RequestBody PayDTO payDTO){
        Pay pay = new Pay();
        BeanUtils.copyProperties(payDTO, pay);
        int i = payService.update(pay);
        return ResultData.success("成功修改记录，返回值："+i);
    }
    @GetMapping("/pay/get/{id}")
    @Operation(summary = "按照ID查流水",description = "查询支付流水方法")
    public ResultData<Pay> getPayId(@PathVariable("id") Integer id){
        if(id == -4) throw new RuntimeException("id不能为负数");
        Pay pay = payService.getByld(id);
        return ResultData.success(pay);
    }
    @GetMapping("/pay/getAll")
    @Operation(summary = "查询所有支付流水",description = "查询所有支付流水")
    public ResultData<List<Pay>> getAllPay(){
        List<Pay> pays = payService.getAll();
        return ResultData.success(pays);
    }

    @RequestMapping(value = "/pay/error",method = RequestMethod.GET)
    public ResultData<Integer> getPayError()
    {
        Integer i = Integer.valueOf(200);
        try
        {
            System.out.println("--------come here");
            int data = 10/0;
        }catch (Exception e){
            e.printStackTrace();
            return ResultData.fail(ReturnCodeEnum.RC500.getCode(),e.getMessage());
        }
        return ResultData.success(i);
    }


}
