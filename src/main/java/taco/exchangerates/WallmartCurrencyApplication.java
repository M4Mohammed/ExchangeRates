package taco.exchangerates;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients()
public class WallmartCurrencyApplication {

	public static void main(String[] args) {
		SpringApplication.run(WallmartCurrencyApplication.class, args);
	}

}
