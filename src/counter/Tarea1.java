package counter;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class Tarea1 implements Job {

    public void execute(JobExecutionContext context) throws JobExecutionException {

        System.out.print("Hola" + "\n");
        Ventana v = new Ventana();
         System.out.print("Hola2" + "\n");
        v.Ventana();
        v.Ejecutar();
        
        System.out.print("Ejecutado" + "\n");
        v.GuardarPropiedades();

       //System.out.print(Maquinas.getNSerie()+"\n");
      //System.out.print(maquinas.getModelo()+"\n");
        v.Enviar();
        v.Mysql();
        System.out.print("Todo OK" + "\n");
       
         
 
        //System.out.print("este es el String  ."+v.ODIValue4);
        
        System.exit(0);
        
       
    }

}
