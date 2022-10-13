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
 * @author aless
 */
public class Aluguel {
    private Fita fita;
    private Cliente cliente;
    private int diasAlugada;
    private Collection fitasAlugadas = new ArrayList();

    public Aluguel(Fita fita, Cliente cliente, int diasAlugada) {
        this.fita = fita;
        this.cliente = cliente;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public void setFita(Fita fita) {
        this.fita = fita;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }

    public void setDiasAlugada(int diasAlugada) {
        this.diasAlugada = diasAlugada;
    }

    public Collection getFitasAlugadas() {
        return fitasAlugadas;
    }

    public void setFitasAlugadas(Collection fitasAlugadas) {
        this.fitasAlugadas = fitasAlugadas;
    }
    
    public void alugarFita(Fita fita) {
        fitasAlugadas.add(fita);
    }
    
    public String extrato(Cliente cliente) {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        Iterator alugueis = fitasAlugadas.iterator();
        String resultado = "Registro de Alugueis de " + cliente.getNome() + fimDeLinha;
        
        while(alugueis.hasNext()) {
            double valorCorrente = 0.0;
            Aluguel cada = (Aluguel)alugueis.next();
            // determina valores para cada linha
            switch(cada.getFita().getCódigoDePreço()) {
                case Fita.NORMAL:
                    valorCorrente += 2;
                    if(cada.getDiasAlugada() > 2) {
                        valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                    }
                    break;
                case Fita.LANÇAMENTO:
                    valorCorrente += cada.getDiasAlugada() * 3;
                    break;
                case Fita.INFANTIL:
                    valorCorrente += 1.5;
                    if(cada.getDiasAlugada() > 3) {
                        valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                    }
                    break;
            } //switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
                // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if(cada.getFita().getCódigoDePreço() == Fita.LANÇAMENTO && cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }
                // mostra valores para este aluguel
            resultado += "\t" + cada.getFita().getTítulo() + "\t" + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
            } // while
            // adiciona rodapé

            resultado += "Valor total devido: " + valorTotal + fimDeLinha;
            resultado += "Voce acumulou " + pontosDeAlugadorFrequente +
                " pontos de alugador frequente";
            return resultado;
        }
  
   
}