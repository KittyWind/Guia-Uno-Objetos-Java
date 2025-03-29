/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1ej2.Guia1ej2;

/**
 *
 * @author kitty
 */
public class Empleado {

    private String DNI;
    private String nombre;
    private String apellido;
    private double salBase;
    private EstadoCivil estadoCivil;
    private int cantHijos;
    

    public Empleado(String DNI, String apellido, int cantHijos, EstadoCivil estadoCivil, String nombre, double salBase) {
        this.DNI = DNI;
        this.apellido = apellido;
        this.cantHijos = cantHijos;
        this.estadoCivil = estadoCivil;
        this.nombre = nombre;
        this.salBase = salBase;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getCantHijos() {
        return cantHijos;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public double AumentoPorHijos(){
        int porc = 0;
        double sueldoaumentado = 0;
        if(this.cantHijos <= 3){
            for(int i = 0; i < this.cantHijos; i++){
                porc += 3;
            }
        }
        else{
            porc = 10;
        }
        sueldoaumentado = this.salBase + (this.salBase * porc / 100);
        return sueldoaumentado;
    }

    public double DescuentoSiEsSoltero(){
        double sueldodescontado = 0;
        if(this.estadoCivil == EstadoCivil.SOLTERO){
            sueldodescontado = this.salBase - (this.salBase * 4 / 100);
        }
        else{
            sueldodescontado = this.salBase;
        }
        return sueldodescontado;
    }

}
