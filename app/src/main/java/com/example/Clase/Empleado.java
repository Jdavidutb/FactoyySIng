package com.example.Clase;

/**
 * Created by JOSELIN GASTELBONDO on 1/09/2017.
 */

public class Empleado extends Persona {
    private double salario=0;
    private double horasextras=0;
    private String cedula="";

    public Empleado(String nombre, String cedula,int sexo, double salario, int horasextras){
        super(nombre, cedula, sexo);
        this.horasextras=horasextras;
        this.salario=salario;
    }

    public void setsalario(double sala){
        salario=sala;

    }
    public void sethorasextras(int horas){
        horasextras=horas;
    }
    public void setcedula(String ced){
        cedula=ced;
    }
    public String getcedula(){
        return cedula;
    }
}
