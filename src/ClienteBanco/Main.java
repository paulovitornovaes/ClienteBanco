package ClienteBanco;

public class Main {
    public static void main(String[] args) {
        ClienteBanco cliente1, cliente2;
        cliente1 = new ClienteBanco("eu", 6);
        cliente2 = new ClienteBanco("voce", 2);
        cliente1.RealizaDeposito(500);
        System.out.println("Valor na conta do cliente1 = " + cliente1.saldo);
        System.out.println("Valor na conta do cliente2 = " + cliente2.saldo);
        cliente1.transferir(200, cliente2);
        System.out.println("Valor na conta do cliente1 = " + cliente1.saldo);
        System.out.println("Valor na conta do cliente2 = " + cliente2.saldo);

    }
}