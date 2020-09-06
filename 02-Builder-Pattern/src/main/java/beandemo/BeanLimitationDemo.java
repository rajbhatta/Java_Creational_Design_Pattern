package beandemo;

public class BeanLimitationDemo {
    private static void main(String [] args){

        CustomerBean customerBean=new CustomerBean();

        customerBean.setBread("Wheat");
        customerBean.setCondiments("Lettuce");
        customerBean.setDressing("Mustard");
        customerBean.setMeat("Ham");


        System.out.println(customerBean.getBread());
        System.out.println(customerBean.getCondiments());
        System.out.println(customerBean.getDressing());
        System.out.println(customerBean.getMeat());

    }
}
