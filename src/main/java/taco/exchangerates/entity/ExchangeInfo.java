package taco.exchangerates.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeInfo {
    private Double rate;
    private Long timestamp;
}
