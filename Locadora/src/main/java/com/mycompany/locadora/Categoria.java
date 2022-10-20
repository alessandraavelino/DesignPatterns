/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.locadora;

/**
 *
 * @author aless
 */
public interface Categoria {
    int getCódigoDePreço();
    double getValorDoAluguel(int diasAlugada);
    
    int getPontosDeAlugadorFrequente(int diasAlugadas);
}
