package raj.prototype.design.two;

public class CustomerB implements Customer {
    public Customer clone() {
        return new CustomerB();
    }

    public void executeB(){
        System.out.println("Hello B");
    }
}
