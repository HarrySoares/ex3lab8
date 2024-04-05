package ex3lab8;

class DadosVisitor implements Visitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Dados do carro:");
        System.out.println("Cor: " + carro.getCor());
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Dados do onibus:");
        System.out.println("Quantidade de lugares: " + onibus.getLugares());
        System.out.println("Ano de fabricacao: " + onibus.getAnoFabricacao());
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Dados da bicicleta:");
        System.out.println("Cor: " + bicicleta.getCor());
    }
}