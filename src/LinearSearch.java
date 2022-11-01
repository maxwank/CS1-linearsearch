import java.util.Scanner;
public class LinearSearch {
    public static Scanner sc = new Scanner(System.in); //scanner for letter
   // Scanner scl = new Scanner (System.in); //scanner for character
    public static int find; // find value
    public static float valueAmt = 0;
    public static int arrayLength;
    public static int[] values = new int[arrayLength];


    public static void main(String[] args) {
        collectValues();
        select();
        search();
    }
    public static void clear() {

        System.out.print("\033[H\033[2J");
    }
    public static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
    public static void search(){
        {

            //int[] numbers;
            int searchValue = find;
            boolean found=false;

            //loop counter from 0 to 5, up to and including 5
            for(int counter=0; counter <= (valueAmt-1); counter++) {
                if (values[counter]==searchValue)
                {
                    found=true;
                    System.out.println(searchValue + " was found at position " + counter + ".");
                }
            }
            if (!found){
                System.out.println(searchValue + " not found!");
            }
        }
    }
    public static void select(){
        System.out.println("Type # to find");
         find = sc.nextInt();
    }
    public static void collectValues(){
        System.out.println("How many values required?");
        arrayLength=sc.nextInt();
        values=new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.println("Type in values. Press enter after each value. #'s entered: " + (valueAmt));
            valueAmt++;
            values[i] = sc.nextInt();
            wait(100);
            clear();

        }
    }

}
