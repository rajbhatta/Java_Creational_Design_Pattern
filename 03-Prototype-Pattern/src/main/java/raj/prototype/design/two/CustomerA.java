package raj.prototype.design.two;

public class CustomerA implements Customer {
    public Customer clone() {
        return new CustomerA();
    }

    public void executeA(){
        System.out.println("Hello A");
    }
}
