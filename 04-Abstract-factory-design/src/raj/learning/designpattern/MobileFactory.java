package raj.learning.designpattern;

public class MobileFactory extends AbstractDeviceFactory {

	@Override
	Device getDeviceType(DeviceType deviceType) {
		switch(deviceType)
		{
		case MAC:
			return new Iphone();
		
		case SAMSUNG:
			return new Samsung();
			
		}
		return null;
	}

}
