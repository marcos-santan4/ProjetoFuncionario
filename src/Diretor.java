public class Diretor extends Funcionario  {
    private int numDepartGeren;

    public Diretor(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    public Diretor() {
        
    }

    public int getNumDepartGeren() {
        return numDepartGeren;
    }

    public void setNumDepartGeren(int numDepartGeren) {
        this.numDepartGeren = numDepartGeren;
    }
    
    public double getBonificacao() {
        double bonificacao = getSalario() * 0.3;
        return bonificacao;
    }

    public String inforDir () {
        String info = "\nNome: " + getNome();
        info += "\nCPF: " + getCpf();
        info += "\nSalario: " + getSalario();
        info += "\nBonificação: " + getBonificacao();
        info += "\nQtd. Departamentos gerenciados: " + getNumDepartGeren();
        return info;
    }

}