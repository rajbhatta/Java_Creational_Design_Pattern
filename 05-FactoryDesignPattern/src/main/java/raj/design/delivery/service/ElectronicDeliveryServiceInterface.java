package raj.design.delivery.service;

import java.awt.Component;

import raj.design.pattern.model.Order;

public interface ElectronicDeliveryServiceInterface 
{
	public void send(Component component,Order order);
}
