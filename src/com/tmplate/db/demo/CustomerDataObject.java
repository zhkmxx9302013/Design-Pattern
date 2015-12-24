package com.tmplate.db.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CustomerDataObject extends DataObject {

	//���ݿ�����
	Connection connection = null;
	//Ԥ�����Statement,�������ݿ⻺�棬������ݿ�����
	PreparedStatement preparedStatement = null;
	//�����
	ResultSet resultSet = null;

	public CustomerDataObject() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Connect() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm_kl","root","5407922");
	}

	@Override
	public void Select() throws SQLException {
		// TODO Auto-generated method stub
		String sql = "select * from login where name=?";
		preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, "admin");
		resultSet = preparedStatement.executeQuery();
	}

	@Override
	public void Process() throws SQLException {
		// TODO Auto-generated method stub
		while(resultSet.next()){
			System.out.println(resultSet.getString("id")+resultSet.getString("username"));
		}
	}

	@Override
	public void Disconnected() throws SQLException {
		// TODO Auto-generated method stub
		if(resultSet!=null){
			resultSet.close();
		}
		if(preparedStatement!=null){
			preparedStatement.close();
		}
		if (connection!=null) {
			connection.close();
		}
		}
	}


