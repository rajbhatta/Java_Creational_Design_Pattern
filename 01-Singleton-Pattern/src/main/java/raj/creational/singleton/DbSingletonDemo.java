package raj.creational.singleton;

public class DbSingletonDemo {
    public static void main(String[] args){
        DbSingleton dbSingleton=DbSingleton.getInstance();

        //Print address
        System.out.println(dbSingleton);

        DbSingleton dbSingleton1=DbSingleton.getInstance();

        //print address again
        System.out.println(dbSingleton1);

        //Verify that both addresses are same.
    }
}
