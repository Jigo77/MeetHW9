import java.util.HashSet;

public class Qst6 {
    //6. Use a HashSet that stores Integer Objects. Store the number 4, 7 and 8 to Sets.
    //Show which numbers are between 1 and 10 are in the set. (Hint: use for loop
    //and if else)
    public static void main(String[] args) {
        in();
    }

    public static void in(){
        HashSet <Integer> number = new HashSet<>();
        number.add(4);
        number.add(5);
        number.add(9);

        //int n = number.size();
        //System.out.println(n);
        for(int i=0;i<=10;i++){
            if(number.contains(i)){
                System.out.println(i);
            }
        }

    }
}
