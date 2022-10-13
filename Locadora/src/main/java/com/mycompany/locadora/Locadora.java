/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.locadora;

/**
 *
 * @author aless
 */
public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juliana");
        Cliente c2 = new Cliente("Julia");


        Fita fita1 = new Fita("Exorcista", 34);
        Fita fita2 = new Fita("Men in black", 32);
        Fita fita3 = new Fita("Jurassic Park III", 43);
        Fita fita4= new Fita("Planeta dos Macacos", 12);
        Fita fita5= new Fita("Pateta no Planeta dos Macacos", 12);
        Fita fita6= new Fita("O Rei Leão", 11);

        Aluguel al1 = new Aluguel(fita1, c1, 16);
        Aluguel al2 = new Aluguel(fita2, c2, 13);

        al1.alugarFita(fita1);
        al2.alugarFita(fita2);
        System.out.println(al1.extrato(c1));
    }
}