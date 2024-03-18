package InterviewPractice;

//     A factorial is a function that multiplies a number by every number below it.
//        For example

//            5!=1^ * 2^ * 3^ * 4^ * 5 = 120

public class Code12_FactorialNumber {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of a Number:- " + fact);
    }
}
