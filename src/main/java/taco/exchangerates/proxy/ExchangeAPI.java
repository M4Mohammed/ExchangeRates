package taco.exchangerates.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import taco.exchangerates.entity.ExchangeResponse;

@FeignClient(name = "Exchanges", url = "${exchange.service.url}")
public interface ExchangeAPI {

    @GetMapping("/convert")
    ExchangeResponse convert(@RequestParam("amount") Double amount,
                             @RequestParam("from") String sourceCurrency,
                             @RequestParam("to") String targetCurrency,
                             @RequestHeader("apikey") String apikey);

}
