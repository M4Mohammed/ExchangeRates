package taco.exchangerates.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeQuery {
    private Double amount;
    private String from;
    private String to;
}
