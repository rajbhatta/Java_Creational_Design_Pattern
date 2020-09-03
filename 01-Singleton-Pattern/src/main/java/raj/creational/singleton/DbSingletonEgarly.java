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
