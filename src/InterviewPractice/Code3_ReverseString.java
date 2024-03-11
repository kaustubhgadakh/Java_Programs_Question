package InterviewPractice;

public class Code3_ReverseString {
    public static void main(String[] args) {
        String str = "ABCD";
//        String rev = "";

        System.out.println("String:- " + str);

        //logic1:- using + ( string concatenation ) operator
//        int length = str.length();    // 4
//        for (int i = length-1; i>=0; i--){  // 3  2  1  0  -1
//            rev = rev + str.charAt(i);   //  DCBA

        //logic2:- Using Character Array
//        char a[] = str.toCharArray();
//        int len = a.length;  //4
//        for (int i = len-1; i>=0; i--){   // 3 2 1 0 -1
//            rev = rev + a[i];  //DCBA
//        }

        //logic3:- Using StringBuffer class
        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();

        System.out.println("Reverse String is:- " + rev);
    }
}
