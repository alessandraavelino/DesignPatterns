/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author aluno
 */
public class Fita implements InterfaceAluguel {
    private Categoria categoria;
    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    private String título;
    private int códigoDePreço;

    public Fita(String título, int códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
        codigoValorFita(códigoDePreço);
    }

    public String getTítulo() {
        return título;
    }

    public int getCódigoDePreço() {
        return códigoDePreço;
    }

    public void setCódigoDePreço(int códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }

    public double getValorDoAluguel(int diasAlugada) {
        return diasAlugada * 3;
    }

    public int getPontosDeAlugadorFrequente(int diasAlugadas) {
        if (diasAlugadas > 1) {
            return 2;
        } else {
            return 1;
        }

    }
    
    public int getCodigoValorFita(){
        return categoria.getCódigoDePreço();
    }

    public void codigoValorFita(int códigoDePreço) {
        switch (códigoDePreço) {
            case Fita.NORMAL:
                categoria = new Normal();

                break;

            case Fita.LANÇAMENTO:
                categoria = new Lancamento();
                break;

            case Fita.INFANTIL:
                categoria = new Infantil();
                break;
        } // switch
    }

}
