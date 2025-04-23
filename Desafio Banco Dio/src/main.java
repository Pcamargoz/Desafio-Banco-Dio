public class main {
    public static void main(String[] args) {

        // Testando o codigo 
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}