package dao;

public class DAOFactory {

	private DAOFactory() {
		//
	}

	public static PessoaDAO criarPessoaDAO() {
		return new JDBCPessoaDAO();
	}

	public static UsuarioDAO criarUsuarioDAO() {
		return new JDBCUsuarioDAO();
	}

	public static AlunoDAO criarAlunoDAO() {
		return new JDBCAlunoDAO();
	}

	public static ServidorDAO criarServidorDAO() {
		return new JDBCServidorDAO();
	}

	public static ProfessorDAO criarProfessorDAO() {
		return new JDBCProfessorDAO();
	}

	public static PerfilDAO criarPerfilDAO() {
		return new JDBCPerfilDAO();
	}

	public static JDBCCursoDAO criarCursoDAO() {
		return new JDBCCursoDAO();
	}

}