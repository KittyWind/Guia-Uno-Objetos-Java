/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej11.Guiaej11;

/**
 *
 * @author kitty10
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String fechaNacimiento;
    private Domicilio domicilio;

    public Persona(String nombre, String apellido, String fechaNacimiento, Domicilio domicilio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.domicilio = domicilio;
    }

    public Domicilio getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(Domicilio domicilio) {
        this.domicilio = domicilio;
    }
    
    public void modificarDomicilio(String calle, int altura, String barrio){
        this.domicilio.modificarDomicilio(calle, altura, barrio);
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", fechaNacimiento=").append(fechaNacimiento);
        sb.append(", domicilio=").append(domicilio);
        sb.append('}');
        return sb.toString();
    }
    
    
}
