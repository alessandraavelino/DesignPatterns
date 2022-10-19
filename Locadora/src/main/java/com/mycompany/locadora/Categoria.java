/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author aluno
 */
public abstract class Categoria {
    public abstract double getValorAluguel(int diasAlugado);
    public abstract int getPontosDeAlugadorFrequente(int diasAlugadas);
}
