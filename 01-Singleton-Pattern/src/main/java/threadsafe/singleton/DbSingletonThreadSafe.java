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
