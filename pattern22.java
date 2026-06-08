package striver;

public class pattern22 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < 2*n - 1; i++){
            for(int j = 0; j < 2*n - 1; j++){
                int top = i;
                int left = j;
                int right = (2*n-2) - j;
                int down =  (2*n-2) - i;
                int minDistance = Math.min(Math.min(top, down), Math.min(left, right));
                System.out.print((n - minDistance) + " ");

            }
            System.out.println();
        }
    }
}



/*

5 5 5 5 5 5 5 5 5 
5 4 4 4 4 4 4 4 5 
5 4 3 3 3 3 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 2 1 2 3 4 5 
5 4 3 2 2 2 3 4 5 
5 4 3 3 3 3 3 4 5 
5 4 4 4 4 4 4 4 5 
5 5 5 5 5 5 5 5 5




*/