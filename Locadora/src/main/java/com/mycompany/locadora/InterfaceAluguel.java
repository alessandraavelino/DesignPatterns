/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author aluno
 */
public interface InterfaceAluguel {
    String getTítulo();
    double getValorDoAluguel(int diasAlugada); 

    public int getPontosDeAlugadorFrequente(int diasAlugada);
}
