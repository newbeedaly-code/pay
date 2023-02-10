package cn.newbeedaly.pay.api.client;

import org.springframework.web.bind.annotation.GetMapping;

public interface InitiatePayCallbackClient {

    /**
     * 发起支付回调
     *
     * @return 回调结果
     */
    @GetMapping("/callback/payCallback")
    Boolean payCallback();

}
