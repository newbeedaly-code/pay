package cn.newbeedaly.pay.adaptor;

import cn.newbeedaly.pay.adaptor.config.DefaultFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "order", contextId = "PayCallbackFeignClient", configuration = DefaultFeignClientConfiguration.class)
public interface PayCallbackFeignClient {

    @GetMapping("/order/pay/callback")
    Boolean payCallback();

}
