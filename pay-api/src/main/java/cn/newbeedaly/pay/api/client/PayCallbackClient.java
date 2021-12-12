package cn.newbeedaly.pay.api.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/pay/api")
public interface PayCallbackClient {

    @GetMapping("/callback")
    Boolean payCallback();
}
