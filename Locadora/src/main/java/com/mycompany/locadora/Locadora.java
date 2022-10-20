/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.locadora;

/**
 *
 * @author aluno
 */
public class Locadora {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juliana");
           
        c1.adicionaAluguel(new Aluguel(new Fita("O Exorcista ", Fita.NORMAL), 3));
        c1.adicionaAluguel(new Aluguel(new Fita("Men in Black ", Fita.NORMAL), 2));
        c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III ", Fita.LANÇAMENTO), 3));
        c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos ", Fita.LANÇAMENTO), 4));
        c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ", Fita.INFANTIL), 10));
        c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leao ", Fita.INFANTIL), 30));

        System.out.println(c1.extrato());
    }
}
