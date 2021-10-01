
package counter;

 
//import classes  
import org.apache.log4j.Logger;  
import org.quartz.Job;  
import org.quartz.JobExecutionContext;  
import org.quartz.JobExecutionException;  
  
//create CreateQuartzJob class that implements Job  
public class Trabajo implements Job{  
      
    //Create instance of logger  
    private Logger log = Logger.getLogger(Trabajo.class);  
      
    //execute Job by using execute() method of the Job interface  
    public void execute(JobExecutionContext jExeCtx) throws JobExecutionException {//handle JobExecutionException  
          
        //debug message   
        log.debug("Clase Trabajo......");  
    }  
}  