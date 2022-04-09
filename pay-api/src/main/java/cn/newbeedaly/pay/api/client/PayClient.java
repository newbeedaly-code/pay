package cn.newbeedaly.pay.api.client;

import cn.newbeedaly.pay.api.vo.PaymentReqVO;
import cn.newbeedaly.pay.api.vo.PaymentResVO;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RequestMapping("/pay/api")
public interface PayClient {

    @GetMapping("/pay/{key}")
    PaymentResVO getPaymentById(@PathVariable("key") String key);

    @PostMapping("/pay")
    Boolean pay(@Validated @RequestBody PaymentReqVO pay);

}
