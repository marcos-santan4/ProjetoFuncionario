import java.util.Scanner;

public class ColetaDados {
    Scanner sc = new Scanner(System.in);
        String resposta = "";
        int selecao;

    Funcionario funcionario = new Funcionario();
    Engenheiro engenheiro = new Engenheiro();
    Secretaria secretaria = new Secretaria();
    Gerente gerente = new Gerente();
    Diretor diretor = new Diretor();
    
    //menu para selecionar cadastro 
    public void menu() {

        System.out.println("Bem-vindo!\n");
        opcoes();
        System.out.print("\nSelecione uma opção: ");   
        selecao = sc.nextInt();

        switch (selecao) {
            case 0: 
            System.out.println("Sair");
            System.out.println("Até logo!");
            break;

            case 1:
            cadastro();
            break;

            case 2:
            informacoes();
            break;
  
            default:
            System.out.println("Opção invalida!");
            break;
        }
    }

    /// metodo para adicionar outro colaborador ou retornar para o menu principal
    public void verificadorCadastro() {
        String resposta = "";
        System.out.print("\nDeseja cadastrar outro colaborador? (s/n) ");
        resposta = sc.next();

        if(!resposta.equals("n")){
            cadastro();
        } else {            
        retornoMenuPrincipal();
        }
    }
    
    // metodo para verificar outro colaborador ou retornar para o menu principal
    public void verificadorInformacoes() {
        String resposta = "";
        System.out.print("\nDeseja verificar outro colaborador? (s/n) ");
        resposta = sc.next();
        System.out.println();

        if(!resposta.equals("n")){
            informacoes();
        } else {
        retornoMenuPrincipal();
        }
    }

    // metodo para retornar ao menu principal
    public void retornoMenuPrincipal() {
        String resposta = "";
        System.out.print("\nDeseja voltar pro menu inicial? (s/n) ");
        resposta = sc.next();
        System.out.println("\n");

        if(!resposta.equals("n")){
            menu();
        } else {
            System.out.print("Até mais\n");
        }
    }

    // metodo para coletar os dados
    public void cadastro() {
        
        System.out.println("\nCadastro");
        System.out.print("Opções:\n00-Sair\n01-Funcionário\n02-Engenheiro\n03-Gerente\n04-Diretor\n05-Secretário\n\n");
        System.out.print("Opção escolhida: ");
        selecao = sc.nextInt();

        switch(selecao) {
            case 0:
            System.out.println("Sair");
            break;

            case 1: 
            System.out.println("\nFuncionario: ");
            funcionario.coletaDados();
            verificadorCadastro();
            break;

            case 2:
            System.out.println("\nEngenheiro: ");
            engenheiro.coletaDados();
            verificadorCadastro();
            break;

            case 3:
            System.out.println("\nGerente: ");
            gerente.coletaDados();
            System.out.print("Qtd. Funcionários gerenciados: ");
            gerente.setFuncGerenciados(sc.nextInt());
            verificadorCadastro();
            break;

            case 4:
            System.out.println("\nDiretor: ");
            diretor.coletaDados();
            System.out.print("Qtd. Departamentos gerenciados: ");
            diretor.setNumDepartGeren(sc.nextInt());
            verificadorCadastro();
            break;

            case 5:
            System.out.println("\nSecretária: ");
            secretaria.coletaDados();
            verificadorCadastro();
            break;

            default:
            System.out.println("\nOpção invalida");
            break;
        }        
    }

    //void para imprimir opções
    public void opcoes() {
        System.out.println("Opções:\n0: Sair\n1: Cadastro\n2: Informações");
    }

    // metodo para imprimir as informações lidas
    public void informacoes() {
        System.out.print("\nSelecione uma opção para verificar:\n00: Sair\n01: Funcionario\n02: Engenheiro\n03: Gerente\n04: Diretor\n05: Secretário\n");
        System.out.print("\nOpção escolhida: ");
        selecao = sc.nextInt();
        System.out.println();

        switch(selecao) {
            case 0:
            System.out.println("Sair");
                break;

            case 1: 
            System.out.println("\nInformações do(a) Funcionario(a): ");
            System.out.println(funcionario.inforFunc());
            verificadorInformacoes();
            break;

            case 2:
            System.out.println("\nInformções do(a) Engenheiro(a): ");
            System.out.println(engenheiro.inforEng());
            verificadorInformacoes();
            break;

            case 3:
            System.out.println("\nInformações do(a) Gerente: ");
            System.out.println(gerente.inforGer());
            verificadorInformacoes();
            break;

            case 4:
            System.out.println("\nInformações do(a) Diretor(a): ");
            System.out.println(diretor.inforDir());
            verificadorInformacoes();
            break;

            case 5:
            System.out.println("\nInformações do(a) Secretário(a): ");
            System.out.println(secretaria.inforSec());
            verificadorInformacoes();
            break;

            default:
            System.out.println("\nOpção invalida");
            break;
        } 
    }
 
}