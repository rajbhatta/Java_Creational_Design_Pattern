## Design Consideration ##
- Class is responsible for lifecycle
- Static in nature
- Needs to be thread safe
- Private instance
- Private Constructor
- No parameters are required for construction.
 If parameter is required then it may factory pattern and it violates the principle of singleton pattern
 
 ## Use of Singleton in Java (Runtime Env) ##
 ```java
Runtime singletonRuntime=Runtime.getRuntime();
singletonRuntime.gc();

System.out.println(singletonRuntime);

Runtime anotherRuntime=Runtime.getRuntime();
System.out.println(anotherRuntime);

if(singletonRuntime == anotherInstance){
  System.out.println("They are same instance");
}

 ```
 
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
 ```js
 package singleton.lazyloading;

public class DbSingletonLazy {

    //Let's make it lazily loaded by setting it null.
    private static DbSingletonLazy singleton=null;

    // Let control creation of new instance by
    private DbSingletonLazy() {
    }

    //Do null check here and create a new instance. This lazily loaded code will substantially increase the performance.
    public static DbSingletonLazy getInstance(){
        if(singleton==null) {
          singleton=new DbSingletonLazy();
        }
        return singleton;
    }
}
```

```js
package singleton.lazyloading;

public class DbSingletonLazyDemo {
    public static void main(String[] args){
        DbSingletonLazy dbSingletonLazy = DbSingletonLazy.getInstance();

        //Print address
        System.out.println(dbSingletonLazy);

        DbSingletonLazy dbSingletonLazy1 = DbSingletonLazy.getInstance();

        //print address again
        System.out.println(dbSingletonLazy1);

        //Verify that both addresses are same.
    }
}
```
 
 ### 3. Singleton pattern with lazyloading and threadsafe ###
 ```js
 package threadsafe.singleton;

public class DbSingletonThreadSafe {

    /**
     *  Let's make it lazily loaded and thread safe by setting it null.
     *  The volatile will ensure that instance will remain singleton through any change inside JVM.
     *
     */

    private static volatile DbSingletonThreadSafe singleton=null;

    /**
     * To ensure nobody usages reflection in our code
     */
    private DbSingletonThreadSafe() {
        if(singleton!=null){
            throw new RuntimeException("Use getInstance() method to create");
        }
    }


    /**
     * Do null check here and create a new instance. This lazily loaded code will substantially increase the performance.
     * Some people will make method synchronized but every time we invoke getInstance to synchronized and that will cause issue.
     * To prevent that, synchronized class and check null one more time.
     */

    public static DbSingletonThreadSafe getInstance(){
        if(singleton==null) {
            synchronized (DbSingletonThreadSafe.class){
                if(singleton==null){
                    singleton=new DbSingletonThreadSafe();
                }
            }
        }
        return singleton;
    }
}
```

```js
package threadsafe.singleton;

public class DbSingletonThreadSafeDemo {
    public static void main(String[] args){
        DbSingletonThreadSafe dbSingletonThreadSafe = DbSingletonThreadSafe.getInstance();

        //Print address
        System.out.println(dbSingletonThreadSafe);

        DbSingletonThreadSafe dbSingletonThreadSafe1 = DbSingletonThreadSafe.getInstance();

        //print address again
        System.out.println(dbSingletonThreadSafe1);

        //Verify that both addresses are same.
    }
}
```
