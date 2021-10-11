
package counter;

import java.util.logging.Level;
import java.util.logging.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Tarea1 implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
       
          System.out.print("Hola");
   
        try {
            Ventana v = new Ventana();
            v.Ejecutar();
            Thread.sleep(60*1000);
            v.GuardarPropiedades();
             v.Enviar();
        } catch (InterruptedException ex) {
            Logger.getLogger(Tarea1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.print("espera");
      

  
   
    }

}
