/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counter;

import java.io.IOException;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

public class Principal {

    public static void main(String[] args) throws IOException {
        Ventana v = new Ventana();
        v.Ventana();
        TareaDefinida();

    }

    public static void TareaDefinida() {
        try {
            JobDetail myJob = JobBuilder.newJob(Tarea1.class).withIdentity("myjob", "mygroup").build();
            Trigger myTrigger = TriggerBuilder.newTrigger().withIdentity("mytrigger", "mygroup").startNow()
                    .withSchedule(CronScheduleBuilder.cronSchedule("0 0/5 * * * ?")).build();
            Scheduler myScheduler = new StdSchedulerFactory().getScheduler();
            //0 0 12 ? * 2L
            myScheduler.start();
            myScheduler.scheduleJob(myJob, myTrigger);
        } catch (SchedulerException e) {
        }

    }

}
