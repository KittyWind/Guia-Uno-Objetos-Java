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

    private String password;

    public Password(String password) {
        this.password = password;
    }
    
    public boolean esFuerte(){
        return this.password.length() >= 8;
    }

    public boolean nuevoValor(String password){
        boolean exito = false;
        if (this.password.length() >= 6){
            exito = true;
            this.password = password;
        }
        return exito;
    }
}
