package raj.design.pattern.service;

import raj.design.pattern.db.DBConnection;
import raj.design.pattern.util.ElectronicDelivery;

public class ElectronicDeliveryFactory 
{
	public static ElectronicDeliveryServiceInterface getElectronicDelivery(ElectronicDelivery electronicDelivery)
	{
		switch(electronicDelivery)
		{
		case MOBILE:
			return new MobileDeliveryService(new DBConnection());
		
	
		default:
			return new LaptopDeliveryService(new DBConnection());
 		}
	}

}
