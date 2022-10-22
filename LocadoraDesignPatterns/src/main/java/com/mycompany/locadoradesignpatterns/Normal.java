/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadoradesignpatterns;

/**
 *
 * @author aless
 */
public class Normal extends Categoria {

    public Normal() {
    }
    @Override
    public double getValorAluguel(int diasAlugado) {
        double valorDoAluguel = 2;
        if (diasAlugado > 2) {
            valorDoAluguel += (diasAlugado - 2) * 1.5;
        }
        return valorDoAluguel;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        return 1;
    }
}
