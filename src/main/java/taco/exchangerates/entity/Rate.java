package taco.exchangerates.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Rate {
    private double startRate;
    private double endRate;
    private double change;
    private double changePct;
}
