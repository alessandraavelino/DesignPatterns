/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadoradesignpatterns;

/**
 *
 * @author aless
 */
public class Aluguel {
    private InterfaceAluguel alugar;
    private int diasAlugada;

    public Aluguel(InterfaceAluguel alugar, int diasAlugada) {
        this.alugar = alugar;
        this.diasAlugada = diasAlugada;
    }

    public InterfaceAluguel getAlugar() {
        return alugar;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
    
    public int pontosAcumulados(){
        return this.alugar.getPontosDeAluguel(diasAlugada);
    }

    public double totalDeAluguel(){
        return this.alugar.getValorAluguel(diasAlugada);
    }

    
}
