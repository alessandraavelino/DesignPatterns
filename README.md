# DesignPatterns
Projeto de refatoração de códigos, seguindo os padrões GRASP.
<br>

REFATORE O CÓDIGO APLICANDO OS PADRÕES DE
RESPONSABILIDADE EXPERT, CREATOR, BAIXO ACOPLAMENTO E ALTA
COESÃO
<br>
**Expert:** Atribuir a  responsabilidade à classe que possui as informações para satisfazê-las.
<br>
**Creator:** A criação de Objetos no sistema, atribuindo a responsabilidade de criação à classes que realmente fazem sentido ter essa atribuição.
<br>
**Baixo acoplamento:** Medida de quão forte um elemento está conectado, tem conhecimento ou depende de outros elementos.
<br>
**Alta coesão:** A alta coesão significa que as responsabilidades de um determinado elemento estão fortemente relacionadas e altamente focadas.
<br>

A princípio foi observado que a Classe Cliente, possuia muitas responsabilidades/métodos, saindo do padrão de Alta Coesão, para isso, foi removido o método de alugador frequente, valor de aluguel e título, e inserido em uma interface, para que a classe fita, implemente esses métodos. Dessa forma, ficaria com um Baixo Acoplamento, já que estaria com menos dependência e não teria tanto impacto em outras classes, ao fazer modificações.
<br>

```
//Classe Fita
public class Fita {
    public static final int NORMAL = 0;
    public static final int LANÇAMENTO = 1;
    public static final int INFANTIL = 2;
    private String título;
    private int códigoDePreço;

    public Fita(String título, int códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
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
}
```

```
//Classe Aluguel
public class Aluguel {
    private Fita fita;
    private int diasAlugada;

    public Aluguel(Fita fita, int diasAlugada) {
        this.fita = fita;
        this.diasAlugada = diasAlugada;
    }

    public Fita getFita() {
        return fita;
    }

    public int getDiasAlugada() {
        return diasAlugada;
    }
}
```

```
//Classe cliente
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
            double valorCorrente = 0.0;
            Aluguel cada = (Aluguel) alugueis.next();
            // determina valores para cada linha
            switch (cada.getFita().getCódigoDePreço()) {
                case Fita.NORMAL:
                    valorCorrente += 2;
                    if (cada.getDiasAlugada() > 2) {
                        valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                    }
                    break;
                case Fita.LANÇAMENTO:
                    valorCorrente += cada.getDiasAlugada() * 3;
                    break;
                case Fita.INFANTIL:
                    valorCorrente += 1.5;
                    if (cada.getDiasAlugada() > 3) {
                        valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                    }
                    break;
            } // switch
              // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2 dias
            if (cada.getFita().getCódigoDePreço() == Fita.LANÇAMENTO &&
                    cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }
            // mostra valores para este aluguel
            resultado += "\t" + cada.getFita().getTítulo() + "\t" + valorCorrente +
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
```

```
//Classe locadora
public class Locadora {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Juliana");
        c1.adicionaAluguel(new Aluguel(new Fita("O Exorcista ",
                Fita.NORMAL), 3));
        c1.adicionaAluguel(new Aluguel(new Fita("Men in Black ",
                Fita.NORMAL), 2));
        c1.adicionaAluguel(new Aluguel(new Fita("Jurassic Park III ",
                Fita.LANÇAMENTO), 3));
        c1.adicionaAluguel(new Aluguel(new Fita("Planeta dos Macacos ",
                Fita.LANÇAMENTO), 4));
        c1.adicionaAluguel(new Aluguel(new Fita("Pateta no Planeta dos Macacos ",
                Fita.INFANTIL), 10));
        c1.adicionaAluguel(new Aluguel(new Fita("O Rei Leao ",
                Fita.INFANTIL), 30));
        System.out.println(c1.extrato());
    }
}
```


