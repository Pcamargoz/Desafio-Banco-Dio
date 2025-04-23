public interface iConta {
    // todo metodo que esta em uma interfacae ja e publico
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contadestino);
     void imprimirExtrato();
    // cada metodo vala o que ele deve ter que esta do lado
    // metodos nescessarios estao acima que vao ser obrigatorio implementar
}
