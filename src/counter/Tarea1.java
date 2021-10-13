package counter;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Tarea1 implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {

        System.out.print("Hola" + "\n");
        Ventana v = new Ventana();
        
        v.Ventana();
        v.Ejecutar();
        System.out.print("Ejecutado" + "\n");
        v.GuardarPropiedades();
        v.Enviar();
        System.out.print("Todo OK" + "\n");
        System.exit(0);
    }

}
