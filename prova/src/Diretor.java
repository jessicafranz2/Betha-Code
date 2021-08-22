public class Diretor {

    private Integer id;
    private String nome;
    private String CPF;
    private Double salario;
    private Double bonus;

    public Diretor() {

    }

    public Diretor(Integer id, String nome, String CPF, Double salario, Double bonus) {
        this.id = id;
        this.nome = nome;
        this.CPF = CPF;
        this.salario = salario;
        this.bonus = bonus;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
}
