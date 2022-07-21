/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Aprendiz
 */
public class Proyeccion {
    
    private int mes;
    private double saldoInicial;
    private double cuota;
    private double intereses;
       private double capital;
    private double saldoFinal;
     public Proyeccion() {
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getCuota() {
        return cuota;
    }

    public void setCuota(double cuota) {
        this.cuota = cuota;
    }

    public double getIntereses() {
        return intereses;
    }

    public void setIntereses(double intereses) {
        this.intereses = intereses;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }

    @Override
    public String toString() {
        return "Proyeccion{" + "mes=" + mes + ", saldoInicial=" + saldoInicial + ", cuota=" + cuota + ", intereses=" + intereses + ", capital=" + capital + ", saldoFinal=" + saldoFinal + '}';
    }
     
}
