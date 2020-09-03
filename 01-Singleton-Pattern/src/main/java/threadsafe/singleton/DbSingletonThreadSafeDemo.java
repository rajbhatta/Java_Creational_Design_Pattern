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
