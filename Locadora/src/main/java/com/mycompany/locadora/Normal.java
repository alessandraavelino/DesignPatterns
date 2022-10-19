/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author aluno
 */
public abstract class Normal implements CategoriaInterface {

    public double getValorDoAluguel(int diasAlugado) {
        double valorDoAluguel = 2;
        if (diasAlugado > 2) {
            valorDoAluguel += (diasAlugado - 2) * 1.5;
        }
        return valorDoAluguel;
    }

    public int getPontosDeAlugadorFrequente(int diasAlugada) {
        return diasAlugada = 1; //test
         
    }
    
    
    
    
}
