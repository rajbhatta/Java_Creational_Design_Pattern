## What is Abstract Factory Design Pattern in Java ##

## Example ##
### Example 1 ###
 ```java
 package raj.learning.designpattern;

public abstract class AbstractDeviceFactory {

	 abstract Device getDeviceType(DeviceType deviceType);
}
```

```java
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
```
```java
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
```
