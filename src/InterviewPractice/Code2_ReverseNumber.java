package InterviewPractice;

public class Code2_ReverseNumber {
    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Before Reverse a number:-" + num);
        //logic1:-
//        int rev = 0;
//        while (num != 0){
//            rev = rev*10 + num%10;
//            num = num/10;
//        }

        //logic2:-
//        StringBuffer sb = new StringBuffer(String.valueOf(num));
//        StringBuffer rev = sb.reverse();

        //logic3:-
        StringBuilder sb = new StringBuilder();
        sb.append(num);
        StringBuilder rev = sb.reverse();
        System.out.println("After Reverse a number:-" + rev);
    }
}
