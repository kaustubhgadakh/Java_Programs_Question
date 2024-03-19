package InterviewPractice;

public class Code13_SumOfElementsArray {
    public static void main(String[] args) {
        int a[] = {4, 5, 8, 2, 3};
        int sum = 0;

        for (int i=0; i<=a.length-1; i++){
            sum = sum + a[i];
        }

        System.out.println("Sum of Elements in Array: "+ sum);
    }
}
