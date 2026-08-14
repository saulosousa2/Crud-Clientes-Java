import java.util.ArrayList;
import java.util.Scanner;

public class Crudclientes {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    static void main(String[] args) {
        cadastrar();

        System.out.println(clientes.size());
    }

    static void cadastrar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("qual o seu nome\n");
        String nome = scanner.nextLine();

        System.out.println("digite o seu email\n");
        String email = scanner.nextLine();

        System.out.println("digite o seu numero de telefone\n");
        String telefone = scanner.nextLine();
        Cliente c1 = new Cliente();
        c1.nome = nome;
        c1.telefone = telefone;
        c1.email = email;
        clientes.add(c1);


    }
}