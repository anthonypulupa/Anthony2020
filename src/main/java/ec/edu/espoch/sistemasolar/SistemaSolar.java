/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.espoch.sistemasolar;

import ec.edu.espoch.sistemasolar.clases.Planeta;
import ec.edu.espoch.sistemasolar.enumeraciones.TipoPlaneta;

/**
 *
 * @author anthony
 */
public class SistemaSolar {

    public static void main(String[] args) {
        Planeta objPlaneta=new Planeta("Tierra",1,22,44,33,55,TipoPlaneta.TERESTRE);
        
        //objPlaneta.nombre="Marte";
        //objPlaneta.cantidadSatelite=2;
        //objPlaneta.mKg=1.024;
        //objPlaneta.vKm3=6.254;
        //objPlaneta.km=40.244;
        //objPlaneta.distanciaMediaSol=200;
        //objPlaneta.tipoPlaneta=TipoPlaneta.TERESTRE;
        
        objPlaneta.imprimir();
        
        double densidad=objPlaneta.calcularDencidadPlaneta();
        System.out.println("La dencidad es: " + densidad);
    }
}
