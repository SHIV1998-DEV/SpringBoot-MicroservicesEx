package com.app;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class EPFO_Report_Monthly {
	// @Scheduled(fixedDelay = 1000)
	@Scheduled(cron = "10 * * * * *")
	public void Report() {

		System.out.println("Genrating Report..." + new Date());

	}

}
