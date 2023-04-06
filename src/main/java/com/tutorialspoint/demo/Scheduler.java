package com.tutorialspoint.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

   protected Logger logger = LoggerFactory.getLogger(this.getClass());


   /**
    * Scheduled to run from 9h00 - 18h00 every day, at 2 minute intervals.
    */

   @Scheduled(cron = "0 0/1 9-18 ? * *")
   public void cronJobSch() {
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
      Date now = new Date();
      String strDate = sdf.format(now);
      logger.info("Java cron job expression:: " + strDate);
   }
}
