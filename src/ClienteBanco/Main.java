package ClienteBanco;

public class Main {
    public static void main(String[] args) {
        ClienteBanco cliente1, cliente2;
        cliente1 = new ClienteBanco("eu", 6);
        cliente2 = new ClienteBanco("voce", 2);
        System.out.println("Conta do cliente 1 = " + cliente1.conta);
        System.out.println("Conta do cliente 2 = " + cliente2.conta);
        System.out.println("Renda do cliente 2 = " + cliente2.saldo);
        cliente2.saldo = cliente2.saldo + 500;
        System.out.println("Renda do cliente 2 = " + cliente2.saldo);

    }
}