package cn.newbeedaly.pay.adaptor;

import cn.newbeedaly.common.api.client.HelloCallbackClient;
import cn.newbeedaly.pay.adaptor.config.DefaultFeignClientConfiguration;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "common", contextId = "HelloCallbackFeignClient", configuration = DefaultFeignClientConfiguration.class)
public interface HelloCallbackFeignClient extends HelloCallbackClient {

}
