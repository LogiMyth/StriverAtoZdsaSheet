class fibona {
    public int fib(int n) {
        if(n == 1){
            return 0;
        }
        if(n == 2){
            return 1;
        }
        //your code goes here
        int a = 0;
        int b = 1;
        int c = 0;
        for(int i = 1; i < n; i++){
            c = b + a;
            a = b;
            b = c;
        }
        return c;
    }
}
