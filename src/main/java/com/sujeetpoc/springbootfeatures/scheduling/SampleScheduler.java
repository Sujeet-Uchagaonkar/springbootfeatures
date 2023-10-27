package com.sujeetpoc.springbootfeatures.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.java.Log;

@Component
@Log
public class SampleScheduler {

	@Scheduled(cron = "0 * 19 * * ?") // This will trigger this task every 1 minute between 19:00 to 19:59
	public void scheduledTask1() {
		log.info("Inside scheduled task 1 : scheduled task for every 1 minute between 19:00 to 19:59");
	}

	@Scheduled(cron = "0 30 19 ? * *", zone = "IST") // This will trigger this task at 19:30 for given timezone
	public void scheduledTask2() {
		log.info("Inside scheduled task 2 : scheduled task for at 19:30 for given timezone");
	}

	//@Scheduled(fixedRate = 5000) // This will trigger this task at fixed rate of 5 seconds
	public void scheduledTask3() {
		log.info("Inside scheduled task 3 : scheduled task for fixed rate of 5 seconds");
	}

}
