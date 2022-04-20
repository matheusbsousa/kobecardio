package jedi.project;

import jedi.project.login.Usuario;
import jedi.project.model.Medico;

import java.util.Scanner;

public class KobeCardioApi {

    static Boolean execucao = true;

    public static void main(String[] args) {

        while (execucao) {


            System.out.println("Digite a opção");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar usuário");
            System.out.println("3 - Sair");

            Scanner scan = new Scanner(System.in);

            String opcao = scan.nextLine();

            switch (opcao) {
                case "1":
                    login();
                    break;
                case "2":
                    cadastrarUsuario();
                    break;
                case "3":
                    execucao = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }

        System.out.println("Fim da execução");
    }

    public static void login() {

        Boolean login = true;

        while (login) {

            String userAdmin = "admin";
            String senhaAdmin = "admin";

            System.out.println("Digitar usuario");

            Scanner scan = new Scanner(System.in);
            String username = scan.nextLine();

            System.out.println("Digitar senha");
            String password = scan.nextLine();

            if (username.equals(userAdmin) && password.equals(senhaAdmin)) {
                System.out.println("Usuario logado");
                listarFuncionalidades();
                login = false;
            } else {
                System.out.println("Usuario não existe");
                System.out.println("Digite a opção desejada");
                System.out.println("1 - Tentar login novamente");
                System.out.println("2 - Sair do sistema");

                Boolean loginInvalido = true;
                while (loginInvalido) {
                    String opcao = scan.nextLine();
                    switch (opcao) {
                        case "1":
                            loginInvalido = false;
                            break;
                        case "2":
                            loginInvalido = false;
                            login = false;
                            execucao = false;
                            break;
                        default:
                            System.out.println("Opção inválida");
                    }
                }
            }

        }

    }

    public static void cadastrarUsuario() {


    }


    public static void listarFuncionalidades() {
        Boolean listarFuncionalidades = true;

        while (listarFuncionalidades) {

            System.out.println(" 1 - Func ");
            System.out.println(" 2 - Func ");
            System.out.println(" 3 - Func ");
            System.out.println(" 4 - Func ");
            System.out.println(" 5 - Voltar ao menu de login ");
            Scanner scan = new Scanner(System.in);
            String opcao = scan.nextLine();
            switch (opcao) {
                case "1":
                    System.out.println("Func 1");
                    break;
                case "2":
                    System.out.println("Func 2");
                    break;
                case "3":
                    System.out.println("Func 3");
                    break;
                case "4":
                    System.out.println("Func 4");
                    break;
                case "5":
                    System.out.println("Func 5");
                    listarFuncionalidades = false;
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }




}
