
package counter;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Tarea1 implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {
        Ventana v = new Ventana();
   v.Ejecutar();
       v.GuardarPropiedades();
   v.Enviar();
   
    }

}
