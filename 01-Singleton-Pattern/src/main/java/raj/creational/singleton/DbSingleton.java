package raj.creational.singleton;

public class DbSingleton {

    //Let's make it not lazily loaded and not thread safe by creating a instance of the class.
    private static DbSingleton singleton=new DbSingleton();

    // Let control creation of new instance by


    private DbSingleton() {
    }

    //getInstance is standard method for singleton.
    public static DbSingleton getInstance(){
        return singleton;
    }
}
