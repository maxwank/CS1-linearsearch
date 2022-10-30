import java.util.Scanner;
public class LinearSearch {
    public static Scanner sc = new Scanner(System.in);
    public static int find;
    public static void main(String[] args) {
        select();
        search();

    }
    public static void search(){
        {
            // 0 1 2 3 4 5
            int[] numbers={2,9,5,6,7,2};
            int searchValue = find;
            boolean found=false;

            //loop counter from 0 to 5, up to and including 5
            for(int counter=0; counter <= 5; counter++) {
                if (numbers[counter]==searchValue)
                {
                    found=true;
                    System.out.println(searchValue + " was found at " + counter);
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
}
