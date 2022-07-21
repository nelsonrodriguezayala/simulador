/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
@Named(value = "newJSFManagedBean")
@SessionScoped
public class NewJSFManagedBean implements Serializable {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public NewJSFManagedBean() {
    }
    Proyeccion proyeccion=new Proyeccion();
    ProyeccionDAO proyeccionDAO=new ProyeccionDAO();
    List<Proyeccion> lista= new ArrayList();
    int plazo=0;
    double monto=0;
    double interes=0;
    
    
    public void calcularCuota(){
        proyeccionDAO.calcularCuota(plazo, interes, monto);
        lista=proyeccionDAO.generarProyecion(plazo, interes, monto);
    }

    public Proyeccion getProyeccion() {
        return proyeccion;
    }

    public void setProyeccion(Proyeccion proyeccion) {
        this.proyeccion = proyeccion;
    }

    public ProyeccionDAO getProyeccionDAO() {
        return proyeccionDAO;
    }

    public void setProyeccionDAO(ProyeccionDAO proyeccionDAO) {
        this.proyeccionDAO = proyeccionDAO;
    }

    public List<Proyeccion> getLista() {
        return lista;
    }

    public void setLista(List<Proyeccion> lista) {
        this.lista = lista;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
}
}