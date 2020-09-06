## Design consideration ##
- Handle complex constructor
-  Large number of parameters
- Enforce immutability once object is created.


## Problem building object with JavaBean POJO ##
```js
package java.example.telescoping;

public class CustomerBean {
    private String bread;
    private String condiments;
    private String dressing;
    private String meat;

    public CustomerBean() {
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
package java.example.telescoping;

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
```
- The major problem of building object using above method is that object can be modified at anytime using setting. So,
it is not immutable. 

- Since object created with 
```js
 CustomerBean customerBean=new CustomerBean();
        
        customerBean.setBread("Wheat");
        customerBean.setCondiments("Lettuce");
        customerBean.setDressing("Mustard");
        customerBean.setMeat("Ham");
```
can cause the issue because we can have 
```js
CustomerBean customerBean=new CustomerBean();
        
        customerBean.setBread("Wheat");
        customerBean.setDressing("Mustard");
        customerBean.setMeat("Ham");
```

or 

```js
CustomerBean customerBean=new CustomerBean();
        
        customerBean.setBread("Wheat");
        customerBean.setDressing("Mustard");
```

Thus, it can work from the complier prospective but it is not a good design.

## Let's take help from telescoping constructor to solve it ##
Often time people become create multiple constructors and it will be difficult to manage. For example,
 
