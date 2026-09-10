public class Voting {

    public static void main(String[] args) {

        int[] array = {1,2,2,2,3,3,3,3,1,1,1,1};

        int candidate = array[0];
        int count = 1;

        for (int i = 1; i < array.length; i++) {

            if (array[i] == candidate) {
                count++;
            }
            else {
                count--;
            }

            if (count == 0) {
                candidate = array[i];
                count = 1;
            }
        }

        System.out.println("Candidate who won election is " + candidate);
        if ( count == 0 ) {
            System.out.println("No won");
        }
    }
}