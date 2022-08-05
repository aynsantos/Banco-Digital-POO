public class Main {
    public static void main(String[] args) {
        Cliente allyson = new Cliente();
        allyson.setNome("Allyson");

        Conta cc = new ContaCorrente(allyson);
        Conta poupanca = new ContaPoupanca(allyson);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}