package com.joshi.project.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joshi.project.demo.bean.Configuration;
import com.joshi.project.demo.bean.Limitconfiguration;


@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")
	public Limitconfiguration retrieveLimitsFromConfigurations() {
		return new Limitconfiguration(configuration.getMaximum(),configuration.getMinimum());
	}
	
}
