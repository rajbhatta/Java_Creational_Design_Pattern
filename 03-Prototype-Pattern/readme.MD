## Design consideration ##
- It avoids costly creation operation: 
- Avoid subclassing:  we create an instance of the actual prototype that we are trying to work with.
- Typically doesn't use new keyword: the first instance created might use keyword new after that it is cloned.
- Often utilize an interface
- Usually implemented with a registery.

Example:
java.lang.object#clone()


## Prototype design pattern example 1: ##
```js
package raj.learn.prototype;

public abstract class Item implements Cloneable {

    private String title;
    private double price;
    private String url;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

```

```js
package raj.learn.prototype;

public class Book extends Item {

    private int pageNumber;

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }
}

```

```js
package raj.learn.prototype;

public class Movie extends Item {

    private int runTime;

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
}

```

```js
package raj.learn.prototype;

import java.util.HashMap;
import java.util.Map;

public class Registry {

    private Map<String, Item> items=new HashMap<String,Item>();

    public Registry() {
    }

    public Item createItem(String type){
        Item item=null;
        try {
            item=(Item)items.get(type).clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return item;
    }

    private void loadItem(){
        Movie m=new Movie();
        m.setRunTime(1);

        items.put("Movie",m);

        Book b=new Book();
        b.setPageNumber(1);
        items.put("Book",b);
    }

}

```

```js
package raj.learn.prototype;

public class ProtypeRunner {
    public static void main(String [] args){

        Registry registry=new Registry();

        Movie movie=(Movie)registry.createItem("Movie");
        movie.setTitle("Hello user");

        System.out.println(movie.getRunTime());



    }
}

```