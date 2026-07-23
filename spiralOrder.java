class spiralOrder {
    public List<Integer> spiralOrders(int[][] matrix) {
        ArrayList <Integer> list = new ArrayList<>();

        int m = matrix.length, n = matrix[0].length;
        int srow = 0, erow = m-1, ecol = n-1, scol = 0;
        while(srow <= erow && scol <= ecol){
        for(int i = scol; i <= ecol; i++){
            list.add(matrix[srow][i]);
        }
        for(int i = srow + 1; i <= erow; i++){
            list.add(matrix[i][ecol]);
        }
        for(int i = ecol-1; i >= scol; i--){
            if(srow == erow){break;}
            list.add(matrix[erow][i]);
        }
        for(int i = erow-1; i >= srow+1; i--){
            if(scol == ecol){break;}
            list.add(matrix[i][scol]);
        }
        srow++; scol++; erow--; ecol--;}
        return list;
    }
}
