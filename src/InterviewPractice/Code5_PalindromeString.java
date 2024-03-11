package InterviewPractice;

public class Code5_PalindromeString {
    public static void main(String[] args) {
        String str = "MADAM";
        String org_str = str;
        String  rev = "";

        System.out.println("String is:- " +str);
        int len = str.length();
        for (int i = len-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if (org_str.equals(rev)){
            System.out.println("it is a palindrome String");
        }else {
            System.out.println("it is a not palindrome String");
        }
    }
}
