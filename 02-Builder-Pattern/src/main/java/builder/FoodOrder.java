package builder;

public class FoodOrder {

    public static class Builder{
        private String bread;
        private String condiments;
        private String dressing;
        private String meat;

        public Builder() {
        }

        //This return same Builder
        public Builder bread(String bread){
            this.bread=bread;
            //return instance of the Builder Object
            return this;
        }

        //This return same Builder
        public Builder condiments(String condiments){
            this.bread=condiments;
            //return instance of the Builder Object
            return this;
        }

        //This return same Builder
        public Builder dressing(String dressing){
            this.bread=dressing;
            //return instance of the Builder Object
            return this;
        }

        //This return same Builder
        public Builder meat(String meat){
            this.bread=meat;
            //return instance of the Builder Object
            return this;
        }

        //Must have constructor inside FoodOrder that will take Builder as a parameter.
        public FoodOrder build(){
            return new FoodOrder(this);
        }
    }

    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public FoodOrder(Builder builder) {
        this.bread = bread;
        this.condiments = condiments;
        this.dressing = dressing;
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public String getMeat() {
        return meat;
    }
}
