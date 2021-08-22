import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Funcionario funcionario = new Funcionario(11,"Jessica","87626227282",765.98);

        FuncionarioService service = new FuncionarioService();

        service.save(funcionario);

        funcionario.setNome(funcionario.getNome() + " - alterado");

        service.update(funcionario);

        FuncionarioRepository repository = new FuncionarioRepository();

        repository.findAll();

        repository.findById(1);

    }
}
