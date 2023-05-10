package taco.exchangerates.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;
import taco.exchangerates.entity.CurrencyFluctuation;

@FeignClient(name = "Fluctuations", url = "${fluctuation.service.url}")
public interface FluctuationAPI {

    CurrencyFluctuation getFluctuation(@RequestParam("end_date") String endDate,
                                       @RequestParam("start_date") String startDate,
                                       @RequestParam("base") String base,
                                       @RequestParam("symbols") String symbols);
}