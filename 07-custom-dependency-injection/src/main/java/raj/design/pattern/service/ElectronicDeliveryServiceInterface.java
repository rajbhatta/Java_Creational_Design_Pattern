package raj.design.pattern.service;

import java.awt.Component;
import java.sql.SQLException;

import raj.design.pattern.model.Order;

public interface ElectronicDeliveryServiceInterface 
{
	public void send(Component component,Order order) throws SQLException;
}
