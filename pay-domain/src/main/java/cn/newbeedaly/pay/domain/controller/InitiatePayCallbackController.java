package cn.newbeedaly.pay.domain.controller;

import cn.newbeedaly.order.api.client.PayCallbackClient;
import cn.newbeedaly.pay.api.client.InitiatePayCallbackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiatePayCallbackController implements InitiatePayCallbackClient {

    @Autowired
    private PayCallbackClient payCallbackClient;

    @Override
    public Boolean payCallback() {
        return payCallbackClient.payCallback();
    }

}
