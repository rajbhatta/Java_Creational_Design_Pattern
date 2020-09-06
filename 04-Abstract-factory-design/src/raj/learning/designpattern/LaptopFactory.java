package raj.learning.designpattern;

public class LaptopFactory extends AbstractDeviceFactory {

	@Override
	Device getDeviceType(DeviceType deviceType) {
		switch(deviceType) {
		case MAC:
			return new Mac();
		case ASUS:
			return new Asus();
		}
		return null;
	}

}
