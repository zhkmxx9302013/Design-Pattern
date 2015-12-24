/**
 * 
 */
package com.tmplate.db.demo;

import java.sql.SQLException;

/**
 * @author zhkmx
 *	抽象类，模板方法
 */
public abstract class DataObject {
	abstract public void Connect() throws ClassNotFoundException, SQLException;
	abstract public void Select() throws SQLException;
	abstract public void Process() throws SQLException;
	abstract public void Disconnected() throws SQLException;
	//定义模板方法
	public void run() throws ClassNotFoundException, SQLException{
		Connect();
		Select();
		Process();
		Disconnected();
	}
}
