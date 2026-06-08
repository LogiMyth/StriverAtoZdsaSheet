package striver;

public class pattern20 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            for(int j = n-1; j > i; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
        for(int i = 1; i < n; i++){
            for(int j = n-1; j >= i; j--){
                System.out.print("*");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = n-1; j >= i; j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}


// class Solution {
//     public void pattern20(int n) {
//         for(int i = 0; i < n; i++){
//             for(int j = 0; j <= i; j++){
//                 System.out.print("*");
//             }
//             for(int j = n-1; j > i; j--){
//                 System.out.print(" ");
//             }
//             for(int j = n-1; j > i; j--){
//                 System.out.print(" ");
//             }
//             for(int j = 0; j <= i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();

//         }
//         for(int i = 0; i < n; i++){
//             for(int j = n-1; j > i; j--){
//                 System.out.print("*");
//             }
//             for(int j = 0; j <= i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = 0; j <= i; j++){
//                 System.out.print(" ");
//             }
//             for(int j = n-1; j > i; j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }


