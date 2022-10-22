/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadoradesignpatterns;

/**
 *
 * @author aless
 */
public class Infantil extends Categoria {
    
    public double getValorAluguel(int diasAlugado) {
        double valorDoAluguel = 1.5;
        if (diasAlugado > 3) {
            valorDoAluguel += (diasAlugado - 3) * 1.5;
        }
        return valorDoAluguel;
    }
    
    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        return 1;
    }

    

    
}
