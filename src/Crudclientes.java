import java.util.ArrayList;
import java.util.Scanner;

public class Crudclientes {
    static ArrayList<Cliente> clientes = new ArrayList<>();

    static void main(String[] args) {
        cadastrar();
        listar();
        System.out.println("----atualizando----");
        atualizar();
        listar();
        remover();


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

    static void listar() {
        for (Cliente c : clientes) {
            System.out.println(c.nome);
            System.out.println(c.telefone);
            System.out.println(c.email);

        }
    }

    static void remover() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome do cliente que deseja remover \n");
        String nomepararemover = (scanner.nextLine());
        clientes.removeIf(cliente -> cliente.nome.equals(nomepararemover));
    }

    static void atualizar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("digite o nome do cliente que deseja atualizar \n");
        String nomeparaatualizar = (scanner.nextLine());
        for (Cliente c : clientes) {
            if (c.nome.equals(nomeparaatualizar)) {
                System.out.println("digite o novotelefone");
                String novotelefone = scanner.nextLine();
                c.telefone = novotelefone;

                System.out.println("digite o novo email");
                String novoemail = scanner.nextLine();
                c.email = novoemail;


            }
        }
    }

}
