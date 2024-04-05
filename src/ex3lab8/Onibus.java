package ex3lab8;

class Onibus implements Veiculo {
    private int lugares;
    private int anoFabricacao;

    public Onibus(int lugares, int anoFabricacao) {
        this.lugares = lugares;
        this.anoFabricacao = anoFabricacao;
    }

    public int getLugares() {
        return lugares;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}