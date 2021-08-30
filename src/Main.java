import java.security.DrbgParameters;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        doesArraylistContainString(list, "bob");
        doesArraylistContainString(list,"Charles");
        doesArraylistContainString(list,"bob");
    }

    public static boolean doesArraylistContainString(ArrayList list, String word){

            if (list.contains(word)){
                System.out.println("The String has been found.");
                return false;
            }
            else {
                list.add(word);
                System.out.println("Nope, " + word + " is not on the list. It is now!");
                return true;
            }

            //TODO: Make program loop so you can actually look through an expanding list.
            //TODO: Create scanner to take keyboard input as parameter 'word'
        }
}
