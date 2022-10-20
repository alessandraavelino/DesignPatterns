/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author aless
 */
public class Infantil implements Categoria {

    @Override
    public int getCódigoDePreço() {
       return Fita.INFANTIL;
    }

    @Override
    public double getValorDoAluguel(int diasAlugada) {
        double valorDoAluguel = 1.5;
        if(diasAlugada > 3){
            valorDoAluguel += (diasAlugada -3) * 1.5;
        }
        return valorDoAluguel;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        return 1;
    }
    
    
}
