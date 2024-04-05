package ex3lab8;

public class Ex3Lab8 {
  public static void main(String[] args) {
        Veiculo carro = new Carro("Preto", "Toyota", "Corolla");
       Veiculo onibus = new Onibus(50, 2010);
       Veiculo bicicleta = new Bicicleta("Vermelho");

       // Criando os visitors
       Visitor mensagemVisitor = new MensagemVisitor();
       Visitor dadosVisitor = new DadosVisitor();

       // Realizando as operações
       carro.accept(mensagemVisitor);
       carro.accept(dadosVisitor);

       onibus.accept(mensagemVisitor);
       onibus.accept(dadosVisitor);

       bicicleta.accept(mensagemVisitor);
       bicicleta.accept(dadosVisitor);
    }
}
