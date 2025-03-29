/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej8.Guiaej8;

/**
 *
 * @author kitty
 */
public class Password {
    private final int LONGITUD_FUERTE = 8;
    private final int LONGITUD_MINIMA = 6;
    private String password;

    public Password(String password) {
        this.password = password;
    }
    
    public boolean esFuerte(){
        return this.password.length() >= LONGITUD_FUERTE;
    }

    public boolean nuevoValor(String password){
        boolean exito = false;
        if (this.password.length() >= LONGITUD_MINIMA){
            exito = true;
            this.password = password;
        }
        return exito;
    }
}
