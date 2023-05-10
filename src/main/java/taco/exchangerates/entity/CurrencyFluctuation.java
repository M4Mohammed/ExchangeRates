package taco.exchangerates.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class CurrencyFluctuation {
    private String base;
    private String startDate;
    private String endDate;
    private boolean success;
    private boolean fluctuation;
    private Map<String, Rate> rates;


}
