import java.util.ArrayList;
import java.util.Scanner;

public class Crudclientes {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    static void main(String[] args) {
        cadastrar();
        listar();

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

        System.out.println("digie sua idade");
        String idade = scanner.nextLine();
        Cliente c1 = new Cliente();
        c1.nome = nome;
        c1.telefone = telefone;
        c1.email = email;
        c1.idade = idade;
        clientes.add(c1);


    }

    static void listar() {
        for (Cliente c : clientes) {
            System.out.println(c.nome);
            System.out.println(c.telefone);
            System.out.println(c.email);
            System.out.println(c.idade);
        }

    }
}