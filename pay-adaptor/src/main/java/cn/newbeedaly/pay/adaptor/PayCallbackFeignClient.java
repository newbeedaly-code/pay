package cn.newbeedaly.pay.adaptor;

import cn.newbeedaly.order.api.client.PayCallbackClient;
import cn.newbeedaly.pay.adaptor.config.DefaultFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "order", contextId = "PayCallbackFeignClient", configuration = DefaultFeignClientConfiguration.class)
public interface PayCallbackFeignClient extends PayCallbackClient {

}
