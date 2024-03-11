package InterviewPractice;

public class Code8_CountNumberOfEven_Odd {
    public static void main(String[] args) {
        int num = 12345;
        System.out.println("Number:- " +num);
        int evenCount= 0;
        int oddCount= 0;
        while (num > 0){
            int rem = num % 10;

            if (rem%2 == 0){
                evenCount++;
            }else {
                oddCount++;
            }
            num = num/10;
        }
        System.out.println("even number:- " +evenCount);
        System.out.println("odd number:- " +oddCount);

    }
}
