package taco.exchangerates.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import taco.exchangerates.entity.CurrencyFluctuation;
import taco.exchangerates.proxy.FluctuationAPI;

@Service
@RequiredArgsConstructor
public class FluctuationService {

    private final FluctuationAPI fluctuationAPI;

    @Value("${api.key}")
    private String apiKey;


    public CurrencyFluctuation getFluctuation(String startDate, String endDate, String base) {

        CurrencyFluctuation currencyFluctuation = fluctuationAPI.getFluctuation(startDate, endDate, base, apiKey);

        if (currencyFluctuation != null && currencyFluctuation.isSuccess()) {
            return currencyFluctuation;
        }
        else {
            throw new RuntimeException("Failed to get fluctuation");
        }

    }
}
