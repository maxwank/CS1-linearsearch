public class LinearSearch {
    public static void main(String[] args) {
                    // 0 1 2 3 4 5
        int[] numbers={2,9,5,6,7,2};
        int searchValue = 7;
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
