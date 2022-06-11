public class Engenheiro extends Funcionario{
        
    public Engenheiro(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Engenheiro() {
        
    }

    public double getBonificacao() {
        double bonificacao = getSalario() * 0.2;
        return bonificacao;
    }

    public String inforEng () {
        String info = "\nNome: " + getNome();
        info += "\nCPF: " + getCpf();
        info += "\nSalario: " + getSalario();
        info += "\nBonificação: " + getBonificacao();
        return info;
    }
}