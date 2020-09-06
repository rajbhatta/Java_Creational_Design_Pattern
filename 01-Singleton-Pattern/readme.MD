## Design Consideration ##
- Class is responsible for lifecycle
- Static in nature
- Needs to be thread safe
- Private instance
- Private Constructor
- No parameters are required for construction.
 If parameter is required then it may factory pattern and it violates the principle of singleton pattern
 
 ## How we can utilize singleton? ##
 
 ### 1. Singleton pattern without lazyloading ##
 ```js
 package raj.creational.singleton;

public class DbSingletonEgarly {

    //Let's make it not lazily loaded and not thread safe by creating a instance of the class.
    private static DbSingletonEgarly singleton=new DbSingletonEgarly();

    // Let control creation of new instance by


    private DbSingletonEgarly() {
    }

    //getInstance is standard method for singleton.
    public static DbSingletonEgarly getInstance(){
        return singleton;
    }
}
```

```js
package raj.creational.singleton;

public class DbSingletonEagerlyDemo {
    public static void main(String[] args){
        DbSingletonEgarly dbSingletonEgarly = DbSingletonEgarly.getInstance();

        //Print address
        System.out.println(dbSingletonEgarly);

        DbSingletonEgarly dbSingletonEgarly1 = DbSingletonEgarly.getInstance();

        //print address again
        System.out.println(dbSingletonEgarly1);

        //Verify that both addresses are same.
    }
}
```
 
 ### 2. Singleton pattern with lazyloading ###
 
 
 ### 3. Singleton pattern with lazyloading and threadsafe ###
