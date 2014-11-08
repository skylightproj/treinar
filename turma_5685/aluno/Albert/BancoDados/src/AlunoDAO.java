import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlunoDAO {
	
	private Connection connectionBase;
	
	public AlunoDAO() {
		this.connectionBase = new ConnectionBaseFactory().getConnection();
	}
	
	public void adicionar(Aluno contato) {
		//Comando para inser��o de dados
	    String sql = "insert into alunos " +
			            "(nomeAluno, enderecoAluno)" +
			            	" values (?,?)";
	    try {
	        
	        PreparedStatement stmt = connectionBase.prepareStatement(sql);	 

	        stmt.setString(1, contato.getNome());	        
	        stmt.setString(2, contato.getEndereco());	        
	     
	        //executa comando de inser��o
	        stmt.execute();
	        stmt.close();
	        
	        
	    } catch (SQLException e) {
	        throw new RuntimeException(e);
	    }
	}

}
