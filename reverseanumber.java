package striver;

public class reverseanumber {
    public static void main(String[] args) {
    int n = 25;
    int reverse = 0;
    while(n > 0){
        int lst = n % 10;
        reverse = reverse*10 + lst;
        n /= 10;
    }
    System.out.println(reverse);
    }
}
