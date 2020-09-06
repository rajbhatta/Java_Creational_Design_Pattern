package raj.prototype.design.two;

import java.util.HashMap;
import java.util.Map;

public class PrototypeFactory {
    private static final Map<CustomerType, Customer> prototypes = new HashMap<>();

    static {
        prototypes.put(CustomerType.CUSTOMER_A, new CustomerA());
        prototypes.put(CustomerType.CUSTOMER_A, new CustomerA());
        prototypes.put(CustomerType.CUSTOMER_A, new CustomerA());
    }

    public static Customer getPrototype(CustomerType customerType) {
        try {
            return prototypes.get(customerType).clone();
        } catch (NullPointerException ex) {
            System.out.println("Prototype with name: " + customerType + ", doesn't exist");
            return null;
        }
    }
}
