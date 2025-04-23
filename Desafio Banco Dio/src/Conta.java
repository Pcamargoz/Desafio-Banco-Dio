public abstract class Conta implements iConta{
    // Classe mae

    protected static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;
    // protected para as classes filhas reconhecerem 
    protected int agencia;
    protected  int numero;
    protected  double saldo;
    

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        
    }
    public int getAgencia(){
        return agencia;
    }
    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }

    @Override
    public void sacar(double valor) {
        saldo = saldo - valor;
    }
    @Override
    public void depositar(double valor) {
        saldo = saldo + valor;
    }
    
    @Override
    public void transferir(double valor, Conta contadestino) { 
        this.sacar(valor);
        contadestino.depositar(valor);
    }
    
    protected  void imprimirInfcomuns() {
        System.out.println("Extrato da Conta Poupanca ===");
        System.out.println( agencia );
        System.out.println( numero );
        System.out.println( saldo );
    }

}
