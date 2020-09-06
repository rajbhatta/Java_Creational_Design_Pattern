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
