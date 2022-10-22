/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadoradesignpatterns;

/**
 *
 * @author aless
 */
public class Lancamento extends Categoria{
    @Override
    public double getValorAluguel(int diasAlugado) {
        return diasAlugado * 3;
    }

    @Override
    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        return (diasAlugadas > 1) ? 2 : 1;
    }
}
