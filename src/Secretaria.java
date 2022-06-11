public class Secretaria extends Funcionario{
    
    public Secretaria(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Secretaria() {

    }

    public double getBonificacao() {
        double bonificacao = getSalario() * 0.05;
        return bonificacao;
    }

    public String inforSec () {
        String info = "\nNome: " + getNome();
        info += "\nCPF: " + getCpf();
        info += "\nSalario: " + getSalario();
        info += "\nBonificação: " + getBonificacao();
        return info;
    }

}