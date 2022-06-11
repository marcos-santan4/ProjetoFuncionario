import java.util.Scanner;

public class Funcionario {

    Scanner ler = new Scanner(System.in);

    private String nome;
    private String cpf;
    private double salario;    

    public Funcionario(String nome, String cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public Funcionario() {
        this.nome = null;
        this.cpf = null;
        this.salario = 0.0;
    }        

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void coletaDados() {
        System.out.print("CPF: ");
        setCpf(ler.nextLine());
        System.out.print("NOME: ");
        setNome(ler.nextLine());
        System.out.print("SALARIO: ");
        setSalario(ler.nextDouble());
    }

	public double getBonificacao() {
        double bonificacao = getSalario() * 0.1;
        return bonificacao;
    }

    public String inforFunc () {
        String info = "\nNome: " + getNome();
        info += "\nCPF: " + getCpf();
        info += "\nSalario: " + getSalario();
        info += "\nBonificação: " + getBonificacao();
        return info;
    }
    
}