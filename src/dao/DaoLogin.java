package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import connection.SingleConnection;

public class DaoLogin {

	private Connection connection;
	
	public DaoLogin() {
		 connection = SingleConnection.getConnection();
	}
	
	public boolean validarLogin(String login, String senha) throws Exception {
		String sql =  "select * from usuarios WHERE login = ? and senha = ? ";
		PreparedStatement stts = connection.prepareStatement(sql);
		stts.setString(1, login);
		stts.setString(2, senha);
		ResultSet resultado = stts.executeQuery();
		
		if (resultado.next() ) {
			return true;
		}else {
			return false;
		}
			
		
	}
	
}
