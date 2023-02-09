package cn.newbeedaly.pay.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pay")
public interface InitiatePayCallbackClient {

    /**
     * 模拟发起支付回调
     * @return 回调结果
     */
    @GetMapping("/callback/payCallback")
    Boolean payCallback();

}
