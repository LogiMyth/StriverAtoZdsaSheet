package striver;

public class pattern10 {
    public static void main(String[] args) {
        int n = 4;
        for(int i = 1; i <= n; i++){
            for(int k = 1; k <= i; k++){
                if(i % 2 == 0 && k % 2 != 0){
                    System.out.print("0");
                }
                if(i % 2 != 0 && k % 2 == 0){
                    System.out.print("0");
                }
                if(i % 2 != 0 && k % 2 != 0){
                    System.out.print("1");
                }
                if(i % 2 == 0 && k % 2 == 0){
                    System.out.print("1");
                }
            }
            System.out.println();
        }


    




    }
}
//    * 
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
