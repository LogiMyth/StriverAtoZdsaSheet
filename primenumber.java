public class primenumber {

    public static boolean isPrime(int n) {
            if(n == 2){
                return true;
            }
            if(n == 1 || n == 0){
                return false;
            }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(53));
    }

}
