/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public class ProyeccionDAO {

    public ProyeccionDAO() {
    }
    
    
    public double calcularCuota(int plazo,double interes,double monto){
    return monto*(Math.pow(1+interes/100,plazo)*interes/100)/(Math.pow(1+interes/100,plazo)-1);
}
    public List<Proyeccion> generarProyecion(int plazo,double interes,double monto){
        
        List<Proyeccion> lista= new ArrayList();
        double cuota=calcularCuota(plazo, interes, monto);
        double auxSaldoFinal=0;
        for (int i = 1; i <= plazo; i++) {
            Proyeccion proyeccion = new Proyeccion();
            proyeccion.setMes(i);
            proyeccion.setCuota(cuota);
            
            if(i==1)
                proyeccion.setSaldoInicial(monto);
            else
                proyeccion.setSaldoInicial(auxSaldoFinal);
            
            proyeccion.setIntereses(proyeccion.getSaldoInicial()* interes/100);
            proyeccion.setCapital(proyeccion.getCuota()-proyeccion.getIntereses());
            proyeccion.setSaldoFinal(proyeccion.getSaldoInicial()-proyeccion.getCapital());
            auxSaldoFinal=proyeccion.getSaldoFinal();
            
            lista.add(proyeccion);
            
        }
        return lista;
    }
}
