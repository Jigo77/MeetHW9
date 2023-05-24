import java.util.ArrayList;

public class Qst10 {
    //10. Write program and add all group members names in to array and iterates
    //through for each loop and print your name.
    public static void main(String[] args) {
        ArrayList<String> group = new ArrayList<>();
        group.add("Meet");
        group.add("Vidhi");
        group.add("Situ");

        for (String n:group){
            System.out.println(n);
        }
    }
}
