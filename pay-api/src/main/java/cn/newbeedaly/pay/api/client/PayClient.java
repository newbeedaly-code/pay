package cn.newbeedaly.pay.api.client;

import cn.newbeedaly.pay.api.vo.req.PaymentReqVO;
import cn.newbeedaly.pay.api.vo.res.PaymentResVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

public interface PayClient {


    /**
     * 支付
     * @param pay 支付请求信息
     * @return 支付结果
     */
    @PostMapping("/pay/pay")
    Boolean pay(@Validated @RequestBody PaymentReqVO pay);

    /**
     * 查询支付信息
     * @param key 支付ID
     * @return 支付信息
     */
    @GetMapping("/pay/pay/{key}")
    PaymentResVO getPaymentById(@PathVariable("key") String key);

}
