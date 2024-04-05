package ex3lab8;


interface Visitor {
    void visit(Carro carro);
    void visit(Onibus onibus);
    void visit(Bicicleta bicicleta);
}
