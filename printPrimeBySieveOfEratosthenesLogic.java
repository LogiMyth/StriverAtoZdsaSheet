class Solution {
        public ArrayList<Integer> primeTillN(int n) {
            int m = n + 1;

            int arr = new int[m];
            for(int i = 2; i <= m; i++){
                arr[i] = 1;
            }

            for(int i = 2; i * i <= m; i++){
                if(arr[i] == 1){

                    for(int j = i * i; j <= m; j += i){

                        arr[j] = 0;
                    }

                }
            }
            ArrayList<Integer> prim = new ArrayList<>();
            for(int i = 2; i <= m; i++){
                if(arr[i] == 1){
                    prim.add(i);
                }
            }

            return prim;
        }
}
