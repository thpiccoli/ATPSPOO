/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package poo2;

/**
 *
 * @author PauloMagno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    static TelaInicial T;    
    static Data data;
    
    public static void main(String[] args) {
        data = new Data();
        T = new TelaInicial();
        T.setVisible(true);
    }
    
}
