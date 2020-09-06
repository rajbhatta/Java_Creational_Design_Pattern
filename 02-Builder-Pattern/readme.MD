## Design consideration ##
- Handle complex constructor
-  Large number of parameters
- Enforce immutability once object is created.


## Problem building object with JavaBean POJO ##
```js
package beandemo;

public class FoodOrder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public FoodOrder() {
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getCondiments() {
        return condiments;
    }

    public void setCondiments(String condiments) {
        this.condiments = condiments;
    }

    public String getDressing() {
        return dressing;
    }

    public void setDressing(String dressing) {
        this.dressing = dressing;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }
}

```

```js
package beandemo;

public class BeanLimitationDemo {
    private static void main(String [] args){

        FoodOrder customerBean=new FoodOrder();

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

```
- The major problem of building object using above method is that object can be modified at anytime using setting. So,
it is not immutable. 

- Since object created with 
```js
 FoodOrder customerBean=new FoodOrder();

        customerBean.setBread("Wheat");
        customerBean.setCondiments("Lettuce");
        customerBean.setDressing("Mustard");
        customerBean.setMeat("Ham");
```
can cause the issue because we can have 
```js
FoodOrder customerBean=new FoodOrder();

        customerBean.setBread("Wheat");
        customerBean.setCondiments("Lettuce");
        customerBean.setDressing("Mustard");
```

or 

```js
FoodOrder customerBean=new FoodOrder();

        customerBean.setBread("Wheat");
        customerBean.setCondiments("Lettuce");
```

Thus, it can work from the complier prospective but it is not a good design.

## Let's take help from telescoping constructor to solve it ##
Often time people become create multiple constructors and it will be difficult to manage. For example,
 ```js
package telescoping;

public class FoodOrder {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public FoodOrder(String bread) {
        this.bread = bread;
    }

    public FoodOrder(String bread, String condiments) {
        this(bread);
        this.condiments = condiments;
    }

    public FoodOrder(String bread, String condiments, String dressing) {
       this(bread,condiments);
        this.dressing = dressing;
    }

    public FoodOrder(String bread, String condiments, String dressing, String meat) {
        this(bread,condiments,dressing);
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

```

```js
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

```

Major problems
- What if we want to do FoodOrder with bread and meat only. 
In that case, we need to add another constructor. 
Which is not a good design

## Solving above problems using Builder Pattern ##