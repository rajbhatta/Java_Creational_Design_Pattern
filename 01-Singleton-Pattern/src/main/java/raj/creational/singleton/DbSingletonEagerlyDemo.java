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
