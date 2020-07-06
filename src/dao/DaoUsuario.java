package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Beans.BeanCursoJsp;
import connection.SingleConnection;

public class DaoUsuario {
	
	private Connection connection;
	
	public DaoUsuario() {
		connection = SingleConnection.getConnection();
	}
	
	public void salvar(BeanCursoJsp usuario)  {
		String novoLogin = usuario.getLogin();
		String novaSenha = usuario.getSenha();
			
		try {
			String sql = "insert into usuarios(login, senha) values(?, ?)";
			PreparedStatement stts = connection.prepareStatement(sql);
			stts.setString(1,novoLogin);
			stts.setString(2, novaSenha);
			stts.execute();
		} catch (Exception e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
				
	}
	
	public List<BeanCursoJsp> listar() throws Exception{
		List<BeanCursoJsp> listar = new ArrayList<BeanCursoJsp>();
		
		String sql = "select * from usuarios";
		PreparedStatement stts = connection.prepareStatement(sql);
		ResultSet resultado = stts.executeQuery();
		
		while (resultado.next()) {
			BeanCursoJsp novoUsuario = new BeanCursoJsp();
			novoUsuario.setLogin(resultado.getString("login"));
			novoUsuario.setSenha(resultado.getString("senha"));
			listar.add(novoUsuario);
		}
		return listar;
		
	}
	
}
