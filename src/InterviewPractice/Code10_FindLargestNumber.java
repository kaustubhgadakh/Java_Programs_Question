package InterviewPractice;

public class Code10_FindLargestNumber {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;
        int c = 3000;

        //logic1:-
//        if (a>b && a>c){
//            System.out.println(a +" is largest number.");
//        } else if (b>a && b>c) {
//            System.out.println(b +" is largest number.");
//        } else{
//            System.out.println(c +" is largest number.");
//        }

        //logic2:- Using ternary operator  -> a>b ? a : b  <-syntax
//        int largest = a>b ? a:b;
//        largest = c>largest ? c:largest;

        int largest = c > (a>b ? a:b) ? c : (a>b ? a:b);

        System.out.println("largest Number is:- "+largest);

    }
}
