package taco.exchangerates.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taco.exchangerates.entity.ExchangeResponse;
import taco.exchangerates.service.ExchangeService;


@RestController
@RequestMapping("api/v1/exchanges")
@RequiredArgsConstructor
public class ExchangeController {

    private final ExchangeService exchangeService;

    @GetMapping("/convert")
    public ResponseEntity<ExchangeResponse> convert(@RequestParam("amount") Double amount,
                                                    @RequestParam("from") String sourceCurrency,
                                                    @RequestParam("to") String targetCurrency) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(exchangeService.convert(amount, sourceCurrency, targetCurrency));
    }

}
