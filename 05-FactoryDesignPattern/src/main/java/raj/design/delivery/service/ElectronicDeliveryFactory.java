package raj.design.delivery.service;

import raj.design.pattern.util.ElectronicDelivery;

public class ElectronicDeliveryFactory 
{
	public static ElectronicDeliveryServiceInterface getElectronicDelivery(ElectronicDelivery electronicDelivery)
	{
		switch(electronicDelivery)
		{
		case MOBILE:
			return new MobileDeliveryService();
		
	
		default:
			return new LaptopDeliveryService();
 		}
	}

}
