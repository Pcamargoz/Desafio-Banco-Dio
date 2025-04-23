public class ContaCorrente extends Conta {
    // ta herdando tudo que a classe conta tem com os metodos 

    // brincadeira para gerar um valor sequencial dentro da classe

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da Conta Corrente ===");
        super.imprimirInfcomuns();
    }
}

