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
