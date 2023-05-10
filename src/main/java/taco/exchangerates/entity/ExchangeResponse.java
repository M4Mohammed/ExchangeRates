package taco.exchangerates.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExchangeResponse {
    private String date;
    private String historical;
    private ExchangeInfo info;
    private ExchangeQuery query;
    private Double result;
    private Boolean success;
}
