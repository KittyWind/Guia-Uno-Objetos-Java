/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia1ej12.Guia1ej12;

/**
 *
 * @author kitty
 */
public class Ej12 {

    public static void main(String[] args) {
        Impresora impresora = new Impresora();
        Documento doc = new Documento("2021-09-01", "sdwasdef", "dhejakhfjkehausdhkuad dhusaksdkhaushdj saudshkajshdjksahsud\nasjdhkajshdjkas dhasjkdhasjk dhasjk");
        impresora.imprimir(doc);
        impresora.setEncendido(true);
        impresora.imprimir(doc);
        impresora.recargarBandeja(35);
        impresora.imprimir(doc);
    }
}
