package InterviewPractice;

public class Code1_SwappingTwoNumbers {

    public static void main(String[] args) {
        // swap two numbers
        int a = 10;
        int b = 20;
        
        System.out.println("Before Swappig A and B:- "+ a +" "+ b);
        //logic1:- use third variable
//        int t = a;
//        a=b;
//        b=t;

        //logic2:- use (+ and -)  <- Without using third variable
//        a = a+b;  // 10+20=30
//        b = a-b;  // 30-20=10
//        a = a-b;  // 30-10=20

        //logic3:- use (* and /)  <- Without using third variable
        //here a and b value should not be zero
        a = a*b;    // 10*20=200
        b = a/b;    // 200/20=10
        a = a/b;    // 200/10=20

        System.out.println("Before Swappig A and B:- "+ a +" "+ b);
    }
}
