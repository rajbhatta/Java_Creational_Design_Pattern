package raj.learning.designpattern;

public class NexusRunner {

	public static void main(String[] args) {
		Device asus=FactoryGenerator.getFactory(FactoryType.LAPTOPFACTORY).getDeviceType(DeviceType.ASUS);
		
		System.out.println(asus.getDetails());
		
		 Device samsung=FactoryGenerator.getFactory(FactoryType.MOBILEFACTORY).getDeviceType(DeviceType.SAMSUNG);
		System.out.println(samsung.getDetails());
		
		
		
	}

}
