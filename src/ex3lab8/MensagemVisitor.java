 package ex3lab8;

class MensagemVisitor implements Visitor {
    @Override
    public void visit(Carro carro) {
        System.out.println("Mensagem para o dono do carro: Favor atualizar dados do IPVA");
    }

    @Override
    public void visit(Onibus onibus) {
        System.out.println("Mensagem para o dono do onibus: Atencao para atualização das licencas");
    }

    @Override
    public void visit(Bicicleta bicicleta) {
        System.out.println("Mensagem para o dono da bicicleta: Comemore no parque o dia do ciclismo");
    }
}