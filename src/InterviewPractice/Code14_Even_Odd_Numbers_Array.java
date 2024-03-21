package InterviewPractice;

// Print Even & Odd Numbers from an Array
public class Code14_Even_Odd_Numbers_Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};

        System.out.print("Even Numbers:- ");
        for (int even : arr) {
            if (even % 2 == 0){
                System.out.print(even+ " ");
            }
        }

        System.out.println();

        System.out.print("Odd Numbers:- ");
        for (int even : arr) {
            if (even % 2 != 0){
                System.out.print(even+ " ");
            }
        }
    }
}
