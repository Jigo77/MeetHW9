import java.util.ArrayList;
import java.util.Iterator;

public class Qst4 {
    public static void main(String[] args) {
        name();
    }
    public static void name(){
        ArrayList<String> lan = new ArrayList<>();


        lan.add("Java");
        lan.add("Python");
        lan.add("JavaScript");
        lan.add("Swift");

        Iterator<String> iterate = lan.iterator();
        System.out.println("ArrayList: ");


        while(iterate.hasNext()){
            System.out.println(iterate.next());

    }
}

}
