package InterviewPractice;

/**
 * Code11_Check Given Number Is Prime Or Not
 * 
 * 1. Natural number > 1
 * 2. which has only 2 factors 1 and itself
 * 
 * eg.  19 :-  1 and 19 <- Prime Number
 *      28 :-  1,2,4,7,14,28 <- Not a  Prime Number
 */
public class Code11_PrimeOrNot {

    public static void main(String[] args) {
        int num = 19;
        if(isPrime(num)){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }

    public static boolean isPrime(int num) {
        if(num <= 1){
            return false;
        }
        for(int i=2; i<=num/2; i++){
            if(num%i == 0){
                return true;
            }
        }
        return true;
    }
}