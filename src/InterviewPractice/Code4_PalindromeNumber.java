package InterviewPractice;

public class Code4_PalindromeNumber {
    public static void main(String[] args) {
        int num = 12321;
        int orgNum = num;
        int rev = 0;

        System.out.println("Number is :- " +num);
        while (num != 0){
            rev = rev*10 + num%10;
            num = num/10;
        }

        if (orgNum == rev){
            System.out.println("it is palindrome number");
        }else {
            System.out.println("it is not palindrome number");
        }
    }
}
