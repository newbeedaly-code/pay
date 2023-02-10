package cn.newbeedaly.pay.adaptor;

import cn.newbeedaly.pay.adaptor.config.DefaultFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "127.0.0.1:8000", name = "order", contextId = "PayCallbackFeignClient",
        path = "/order", configuration = DefaultFeignClientConfiguration.class)
public interface PayCallbackFeignClient {

    @GetMapping("/pay/callback")
    Boolean payCallback();

}
