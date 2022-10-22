/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadoradesignpatterns;

/**
 *
 * @author aless
 */
public class Fita implements InterfaceAluguel {

    Categoria categoria;
    private String título;
    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    

    public Fita(String título, int códigoDePreço) {
        this.título = título;
        valorDaFita(códigoDePreço);
    }

    public String getTítulo() {
        return título;
    }

    @Override
    public double getValorAluguel(int diasAlugado) {
        return categoria.getValorAluguel(diasAlugado);
    }

    @Override
    public int getPontosDeAluguel(int diasAlugado) {
        return categoria.getPontosDeAlugadorFrequente(diasAlugado);
    }

    public void valorDaFita(int códigoDePreço) {
        switch (códigoDePreço) {
            case NORMAL:
                this.categoria = new Normal();
                break;
            case LANÇAMENTO:
                this.categoria = new Lancamento();
                break;
            case INFANTIL:
                this.categoria = new Infantil();
                break;
        }
    }
}
