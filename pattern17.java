package striver;

public class pattern17 {
    public static void main(String[] args) {
        int n = 4;
        for (int i = 0; i < n; i++){
            for(int j = n - 1; j > i; j--){
                System.out.print(" ");
            }

            for(char j = 'A'; j <= 'A' + i; j++){
                System.out.print(j);
            }

            for(int j = i-1; j >= 0; j--){
                System.out.print((char) ('A' + j));
            }

            System.out.println();
        }
    }
}
