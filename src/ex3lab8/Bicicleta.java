package ex3lab8;

class Bicicleta implements Veiculo {
    private String cor;

    public Bicicleta(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}