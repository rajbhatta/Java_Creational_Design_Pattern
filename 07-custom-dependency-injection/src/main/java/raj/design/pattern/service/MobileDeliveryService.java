package raj.design.pattern.service;

import java.awt.Component;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import raj.design.pattern.db.DBConnection;
import raj.design.pattern.model.Order;

public class MobileDeliveryService implements ElectronicDeliveryServiceInterface{

   private DBConnection dbconnection;
	
	public MobileDeliveryService(DBConnection dbconnection)
	{
		this.dbconnection=dbconnection;
	}
	
	public void send(Component component,Order order) throws SQLException{
		DBConnection.createOrder(order);
		JOptionPane.showMessageDialog(component,"Delivery Order is created for Mobile");  
	}
}
