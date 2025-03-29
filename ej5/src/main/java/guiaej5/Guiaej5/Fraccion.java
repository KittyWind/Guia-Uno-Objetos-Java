/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package guiaej5.Guiaej5;

/**
 *
 * @author kitty
 */
public class Fraccion {

    private int numerador;
    private int denominador;

    public Fraccion(int numerador, int denominador) {
        this.denominador = denominador;
        this.numerador = numerador;
    }

    public String mostrarFraccion() {
        return numerador + "/" + denominador;
    }

    public void sumarEntero(int entero){
        numerador = numerador + entero * denominador;
    }

    public void sumarFraccion(Fraccion fraccion){
        if (denominador == fraccion.denominador){
            numerador = numerador + fraccion.numerador;
        } else {
            numerador = numerador * fraccion.denominador + fraccion.numerador * denominador;
            denominador = denominador * fraccion.denominador;
        }
    
        
    }
    
    private int mcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return Math.abs(a);
        }

    public void simplifarFraccion(){
        int mcd = mcd(numerador, denominador);
        numerador = numerador / mcd;
        denominador = denominador / mcd;
    }

    public boolean esFraccionImpropia(){
        return numerador > denominador && numerador/denominador != 0;
    }

    public boolean esFraccionPropia(){
        return numerador < denominador;
    }

    public boolean esFraccionAparente(){
        return numerador/denominador == 0;
    }
}
