package cn.newbeedaly.pay.domain.controller;

import cn.newbeedaly.common.api.client.HelloCallbackClient;
import cn.newbeedaly.pay.api.client.PayCallbackClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayCallbackController implements PayCallbackClient {

    @Autowired
    private HelloCallbackClient helloCallbackClient;

    @Override
    public Boolean payCallback() {
        return helloCallbackClient.payCallback();
    }
}
