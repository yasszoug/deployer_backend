package fr.piman.statistics.client;

import fr.piman.statistics.domain.Currency;
import fr.piman.statistics.domain.ExchangeRatesContainer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(url = "${rates.url}", name = "rates-client", fallback = ExchangeRatesClientFallback.class)
public interface ExchangeRatesClient {

    @RequestMapping(method = RequestMethod.GET, value = "/latest")
    ExchangeRatesContainer getRates(@RequestParam("base") Currency base);

}
