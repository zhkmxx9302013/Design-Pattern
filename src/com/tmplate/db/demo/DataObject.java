/**
 * 
 */
package com.tmplate.db.demo;

import java.sql.SQLException;

/**
 * @author zhkmx
 *	�����࣬ģ�巽��
 */
public abstract class DataObject {
	abstract public void Connect() throws ClassNotFoundException, SQLException;
	abstract public void Select() throws SQLException;
	abstract public void Process() throws SQLException;
	abstract public void Disconnected() throws SQLException;
	//����ģ�巽��
	public void run() throws ClassNotFoundException, SQLException{
		Connect();
		Select();
		Process();
		Disconnected();
	}
}
