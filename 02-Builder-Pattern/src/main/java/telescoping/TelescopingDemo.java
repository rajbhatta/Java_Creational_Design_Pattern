package telescoping;

public class TelescopingDemo {
    private static void main(String [] args){

        FoodOrder telescopingConstructor =new FoodOrder("wheat","lettuce");


        System.out.println(telescopingConstructor.getBread());
        System.out.println(telescopingConstructor.getCondiments());
        System.out.println(telescopingConstructor.getDressing());
        System.out.println(telescopingConstructor.getMeat());

    }
}
