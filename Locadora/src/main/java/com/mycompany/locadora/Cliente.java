/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class Cliente {
    private String nome;
    private Collection fitasAlugadas = new ArrayList();

    public Cliente(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void adicionaAluguel(Aluguel aluguel) {
        fitasAlugadas.add(aluguel);
    }

    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;

        while (alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel cada = (Aluguel) alugueis.next();
            // determina valores para cada linha
            
            // mostra valores para este aluguel
            resultado += "\t" + cada.getFita().getTítulo() + "\t" + valorCorrente +
                    fimDeLinha;
            valorTotal += valorCorrente;
        } // while
          // adiciona rodapé

        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
        return resultado;
    }
    
}
