package cn.newbeedaly.pay.domain.controller;

import cn.newbeedaly.pay.adaptor.PayCallbackFeignClient;
import cn.newbeedaly.pay.api.client.InitiatePayCallbackClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InitiatePayCallbackController extends PayBaseController implements InitiatePayCallbackClient {

    Logger logger = LoggerFactory.getLogger(InitiatePayCallbackController.class);

    @Autowired
    private PayCallbackFeignClient payCallbackFeignClient;

    @Override
    public Boolean payCallback() {
        logger.info("支付中心：发起支付回调");
        return payCallbackFeignClient.payCallback();
    }

}
