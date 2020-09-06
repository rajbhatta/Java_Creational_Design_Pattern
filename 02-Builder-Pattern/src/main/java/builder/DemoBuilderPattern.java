package builder;

public class DemoBuilderPattern {
    public static void main(String [] args){
        FoodOrder.Builder builder= new FoodOrder.Builder();

        builder.bread("Wheat").condiments("Lettuce").dressing("Mayo").meat("Turkey");

        FoodOrder foodOrder=builder.build();

        System.out.println(foodOrder.getBread());

    }
}
