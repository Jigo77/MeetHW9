import java.util.ArrayList;

public class Qst9 {
    //9. Write program and add all group names in to array and iterates through for
    //each loop.
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        group.add("Java");
        group.add("Postman");
        group.add("Selenium");

        for (String n:group){
            System.out.println(n);
        }
    }
}
