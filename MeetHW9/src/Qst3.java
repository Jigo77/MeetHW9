import java.util.ArrayList;

public class Qst3 {
    //3. Write a Java program to create a new array list, add some colours(string) and
    //printout the collection using for each loop.

    public static void main(String[] args) {
        col();
    }
    public static void col(){
        ArrayList<String> colour = new ArrayList<>();
        colour.add("Red");
        colour.add("Green");
        colour.add("Blue");


        for(String d:colour){
            System.out.println("The Colour"+d);

        }
    }
}
