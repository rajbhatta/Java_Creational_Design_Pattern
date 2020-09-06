package raj.prototype.design.two;

public class CustomerC implements Customer{
    public Customer clone() {
        return new CustomerC();
    }

    public void executeC(){
        System.out.println("Hello C");
    }
}
