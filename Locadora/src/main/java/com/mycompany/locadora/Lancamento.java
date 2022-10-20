/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author aluno
 */
public class Lancamento implements Categoria{

    @Override
    public int getCódigoDePreço() {
        return Fita.LANÇAMENTO;
    }

    @Override
    public double getValorDoAluguel(int diasAlugada) {
        return diasAlugada * 3;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        return (diasAlugadas > 1) ? 2 : 1;
    }
    
}
