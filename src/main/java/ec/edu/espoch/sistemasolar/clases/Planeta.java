
package ec.edu.espoch.sistemasolar.clases;

import ec.edu.espoch.sistemasolar.enumeraciones.TipoPlaneta;


public class Planeta {
    
    public String nombre;
    public int cantidadSatelite;
    public double mKg;
    public double vKm3;
    public double km;
    public double distanciaMediaSol;
    public TipoPlaneta tipoPlaneta;
    public boolean exterior;
    

    //Constructor
    
   /* public Planeta (){
     }*/       

    public Planeta(String nombre, int cantidadSatelite, double mKg, double vKm3, double km, double distanciaMediaSol, TipoPlaneta tipoPlaneta) {
        this.nombre = nombre;
        this.cantidadSatelite = cantidadSatelite;
        this.mKg = mKg;
        this.vKm3 = vKm3;
        this.km = km;
        this.distanciaMediaSol = distanciaMediaSol;
        this.tipoPlaneta = tipoPlaneta;
        this.exterior();
    
    }
            
   
        

    public void imprimir (){
        System.out.println("Nombre: " + nombre);
        System.out.println("CantidadSatelite: " + cantidadSatelite);
        System.out.println("mKg: " + mKg);
        System.out.println("vKm3: " + vKm3);
        System.out.println("Km: " + km);
        System.out.println("DistanciaMediaSol: " + distanciaMediaSol);
        System.out.println("TipoPlaneta: " + tipoPlaneta);
    }
    
    public double calcularDencidadPlaneta (){
        
        return mKg/vKm3;
    }
    
  /*  public boolean exterior (){
        
        double maximo = 3.4;
        double distancia = 149597870;
        double limite = maximo*distancia;
        
        if(distanciaMediaSol > limite) {
        exterior = true;
        
    }
    return exterior;*/
}
