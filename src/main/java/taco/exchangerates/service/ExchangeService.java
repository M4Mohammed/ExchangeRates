package taco.exchangerates.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import taco.exchangerates.entity.ExchangeResponse;
import taco.exchangerates.proxy.ExchangeAPI;


@Service
@RequiredArgsConstructor
public class ExchangeService {

    public final ExchangeAPI exchangeAPI;

    @Value("${api.key}")
    private String apiKey;

    public ExchangeResponse convert(Double amount, String sourceCurrency, String targetCurrency) {

        ExchangeResponse response = exchangeAPI.convert(amount, sourceCurrency, targetCurrency, apiKey);

        if (response != null && response.getSuccess()) {
            return response;
        }
        else {
            throw new RuntimeException("Failed to convert currency");
        }
    }

}
