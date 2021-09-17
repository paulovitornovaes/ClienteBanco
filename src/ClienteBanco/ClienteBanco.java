package ClienteBanco;

public class ClienteBanco {
    String nome;
    int conta;
    float saldo;

    ClienteBanco(String pNome, int pConta) {
        nome = pNome;
        conta = pConta;
        saldo = 200;
    }

    void RealizaDeposito(float pValor) {
        saldo = saldo + pValor;
    }

    void RealizaDeposito(float pValorNota, int pQuantNotas) {
        RealizaDeposito(pValorNota * pQuantNotas);
    }

    void RealizaSaque(float s) {
        if (s > saldo)
            System.out.println("Saldo insuficiente...\n");
        else
            saldo = saldo - s;
    }

    void transferir(float s, ClienteBanco cliente){
        if (s > saldo)
            System.out.println("Saldo insuficiente...\n");
        else
            RealizaSaque(s);
            cliente.RealizaDeposito(s);
    }

}
