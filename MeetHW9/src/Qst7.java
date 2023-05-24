import java.util.HashMap;

public class Qst7 {
    //Create a HashMap object called people that will store String keys and Integer
    //values: And use for each loop to iterate the value from Map.

    public static void main(String[] args) {
        peo();
    }
    public static void peo(){
        HashMap <String,Integer> people = new HashMap<>();

        people.put("Meet",1);
        people.put("Avani",2);
        people.put("Urvi",3);

        for (String i : people.keySet()) {
            System.out.println("The Keys :"+i);
        }
        System.out.println(" ");
        for (int j : people.values()) {
            System.out.println("The Values :"+j);
        }


    }
    }

