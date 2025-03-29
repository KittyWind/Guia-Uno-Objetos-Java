/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej1.Guiaej1;
import java.time.LocalDate;

/**
 *
 * @author kitty
 */
public class Persona {
    private String nombre;
    private String apellido;
    private int anioNacimiento;

    public Persona(int anioNacimiento, String apellido, String nombre) {
        this.anioNacimiento = anioNacimiento;
        this.apellido = apellido;
        this.nombre = nombre;
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

    public int getAnioNacimiento() {
        return anioNacimiento;
    }

    public void setAnioNacimiento(int anioNacimiento) {
        this.anioNacimiento = anioNacimiento;
    }

    public String getIdentidad(){
        return "nombre: " + this.nombre + " apellido: " + this.apellido;
    }

    public int getEdad(){
        //obtenemos el año actual
        LocalDate fechaActual = LocalDate.now();
        int anioActual = fechaActual.getYear();
        //calculamos la edad
        return anioActual - this.anioNacimiento;
    }

    public boolean esMayor(int x){
        return this.getEdad() > x;
    }

    public void setNombreApellido(String nombre, String apellido){
        //cambiar nombre y apellido
        this.setNombre(nombre);
        this.setApellido(apellido);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{ ");
        sb.append("nombre = ").append(nombre);
        sb.append(", apellido = ").append(apellido);
        sb.append(", anioNacimiento = ").append(anioNacimiento);
        sb.append('}');
        return sb.toString();
    }

    
}
