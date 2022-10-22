/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadoradesignpatterns;

/**
 *
 * @author aless
 */
import java.util.*;

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
            Aluguel cada = (Aluguel) alugueis.next();
            double valorCorrente = cada.totalDeAluguel();
            pontosDeAlugadorFrequente += cada.pontosAcumulados();

            resultado += "\t" + cada.getAlugar().getTítulo() + "\t" + valorCorrente +
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
