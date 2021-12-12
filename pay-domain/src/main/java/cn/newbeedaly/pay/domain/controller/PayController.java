package cn.newbeedaly.pay.domain.controller;

import cn.newbeedaly.pay.api.client.PayClient;
import cn.newbeedaly.pay.api.vo.PaymentReqVO;
import cn.newbeedaly.pay.api.vo.PaymentResVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PayController implements PayClient {

    Logger logger = LoggerFactory.getLogger(PayController.class );

    @Override
    public PaymentResVO getPaymentById(String key) {
        logger.info("获取支付信息, 支付id {}", key);
        PaymentResVO vo = new PaymentResVO();
        vo.setId(key);
        return vo;
    }

    @Override
    public Boolean pay(PaymentReqVO pay) {
        logger.info("请求支付 {}", pay);
        return Boolean.TRUE;
    }
}
