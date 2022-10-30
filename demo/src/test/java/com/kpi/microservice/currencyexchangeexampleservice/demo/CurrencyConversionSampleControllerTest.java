package com.kpi.microservice.currencyexchangeexampleservice.demo;


import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CurrencyConversionSampleControllerTest {

	@Test
	public void Test() {
		CurrencyConversionController obj1 = new CurrencyConversionController();
		CurrencyConversionSampleBean ans = obj1.convertCurrency("USD", "INR", BigDecimal.valueOf(10));
		long id = ans.getId();
		String from = ans.getFrom();
		BigDecimal quantity = ans.getConversionMultiple();
		BigDecimal total = ans.getTotalCalculatedAmount();
		assertEquals(1,id);
		assertEquals("USD",from);
		assertEquals(65,quantity.intValue());
		assertEquals(650,total.intValue());
	}
}
