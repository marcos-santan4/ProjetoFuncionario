public class Gerente extends Funcionario{
    private int funcGerenciados;

    public Gerente(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }
    
    public Gerente() {
        
	}

	public int getFuncGerenciados() {
        return funcGerenciados;
    }

    public void setFuncGerenciados(int funcGerenciados) {
        this.funcGerenciados = funcGerenciados;
    }

    public double getBonificacao() {
        double bonificacao = getSalario() * 0.15;
        return bonificacao;
    }

    public String inforGer () {
        String info = "\nNome: " + getNome();
        info += "\nCPF: " + getCpf();
        info += "\nSalario: " + getSalario();
        info += "\nBonificação: " + getBonificacao();
        info += "\nQtd. Funcionários gerenciados: " + getFuncGerenciados();
        return info;
    }
}