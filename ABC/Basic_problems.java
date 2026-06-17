public class Basic_Problems{

    public static boolean checkPrime(int x){
        boolean isprime = true;
    
        for(int i = 2; i<x; i++){
            if(x%i==0){
                System.out.print("Not a prime number");
                return false;
            }
        }
        return isprime;
    }
    public static void main(String[]args){
        System.out.print(checkPrime(13));
    }
}