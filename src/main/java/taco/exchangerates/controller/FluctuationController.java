package taco.exchangerates.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import taco.exchangerates.entity.CurrencyFluctuation;


@RestController
@RequestMapping("api/v1/fluctuations")
@RequiredArgsConstructor
public class FluctuationController {

    private final FluctuationService fluctuationService;

    @GetMapping
    public ResponseEntity<CurrencyFluctuation> getFluctuation(@RequestParam String startDate,
                                                             @RequestParam String endDate,
                                                             @RequestParam String base) {

        return ResponseEntity
                .status(HttpStatus.OK)
                .body(fluctuationService.getFluctuation(startDate, endDate, base));
    }

}
