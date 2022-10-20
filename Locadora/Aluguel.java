public class Aluguel {
    private Fita fita;
    private int diasAlugada;
    private InterfaceAluguel fitas;

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

    double getValorDoAluguel() {
        return fitas.getValorDoAluguel(diasAlugada);
    }

    int getPontosDeAlugadorFrequente() {
        return fitas.getPontosDeAlugadorFrequente(diasAlugada);
    }
}