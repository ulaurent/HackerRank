import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        list.add(9);
        list.add(3);

        System.out.println("Type a number: ");
        int numChoice = Integer.parseInt(read.nextLine());


        if (moreThanOnce(list, numChoice) == false){
            System.out.println("Your number does not appear more than once");
        }
        else if (moreThanOnce(list, numChoice) == true){
            System.out.println("Your number appears more than once in the list");
        }


    }

    public static boolean moreThanOnce (ArrayList<Integer> numList, int number ) {

        int count = 0;

        for(int times: numList){
            if (times == number){
                count++;
            }
        }

        if (count >= 2){
            return true;
        }
        else {
            return false;
        }
    }
}
