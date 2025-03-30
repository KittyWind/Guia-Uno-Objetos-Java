/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej13.Guiaej13;

/**
 *
 * @author kitty
 */
public class Domicilio {
    private String calle;
    private int numero;
    private String ciudad;


    public Domicilio(String calle, int numero, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.ciudad = ciudad;
    }
    public String getCalle() {
        return calle;
    }
    public void setCalle(String calle) {
        this.calle = calle;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getCiudad() {
        return ciudad;
    }
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Domicilio{");
        sb.append("calle=").append(calle);
        sb.append(", numero=").append(numero);
        sb.append(", ciudad=").append(ciudad);
        sb.append('}');
        return sb.toString();
    }
    
}
