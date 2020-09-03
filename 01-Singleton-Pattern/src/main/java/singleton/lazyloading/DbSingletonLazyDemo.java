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
