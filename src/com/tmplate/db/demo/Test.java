package com.tmplate.db.demo;

import java.sql.SQLException;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataObject DataObject = new CustomerDataObject();
		try {
			DataObject.run();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
