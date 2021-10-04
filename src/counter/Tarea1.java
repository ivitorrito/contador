/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
        System.out.println("Que pasaaaaaaaaaa");
    }

}
