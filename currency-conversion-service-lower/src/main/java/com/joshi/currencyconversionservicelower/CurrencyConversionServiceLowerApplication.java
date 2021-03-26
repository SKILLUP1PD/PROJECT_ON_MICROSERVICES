package com.joshi.currencyconversionservicelower;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.joshi.currencyconversionservicelower")
@EnableDiscoveryClient
public class CurrencyConversionServiceLowerApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionServiceLowerApplication.class, args);
    }

}
