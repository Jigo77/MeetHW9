import java.util.ArrayList;

public class Qst5 {
    public static void main(String[] args) {
        station();
    }
    public static void station(){
        ArrayList<String> und = new ArrayList<>();
        und.add("Victoria");
        und.add("Bank");
        und.add("London Bridge");
        und.add("South Harrow");
        und.add("North Harrow");
        System.out.println(und);
        und.removeAll(und);

        //System.out.println(und);

            System.out.println("The ArrayList is Empty :"+und.isEmpty());




    }
}
