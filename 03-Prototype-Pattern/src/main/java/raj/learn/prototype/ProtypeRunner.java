package raj.learn.prototype;

public class ProtypeRunner {
    public static void main(String [] args){

        Registry registry=new Registry();

        Movie movie=(Movie)registry.createItem("Movie");
        movie.setTitle("Hello user");

        System.out.println(movie.getRunTime());



    }
}
