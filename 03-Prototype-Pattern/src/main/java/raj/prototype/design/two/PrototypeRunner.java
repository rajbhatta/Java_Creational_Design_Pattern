package raj.prototype.design.two;

public class PrototypeRunner {
    public static void main(String [] args){
        Customer customer=PrototypeFactory.getPrototype(CustomerType.CUSTOMER_B);

    }
}
