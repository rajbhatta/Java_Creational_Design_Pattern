package raj.design.delivery.service;

import java.awt.Component;

import javax.swing.JOptionPane;

import raj.design.pattern.model.Order;

public class LaptopDeliveryService implements ElectronicDeliveryServiceInterface {

	public void send(Component component,Order order) {
		// TODO implement here
		JOptionPane.showMessageDialog(component,"Delivery Order is created for Laptop");  
	}
}
