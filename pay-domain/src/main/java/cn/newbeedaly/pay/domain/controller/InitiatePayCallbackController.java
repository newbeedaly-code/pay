package cn.newbeedaly.pay.domain.controller;

import cn.newbeedaly.pay.adaptor.PayCallbackFeignClient;
import cn.newbeedaly.pay.api.client.InitiatePayCallbackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiatePayCallbackController implements InitiatePayCallbackClient {

    @Autowired
    private PayCallbackFeignClient payCallbackFeignClient;

    @Override
    public Boolean payCallback() {
        return payCallbackFeignClient.payCallback();
    }

}
