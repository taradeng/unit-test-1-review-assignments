class fibonacciSum {

    public static void main (String[] args) {
        int a = 0;
        int b = 1;
        int c = 0;
        int total = 0;

        while (c < 4000000) {
            c = a + b; 
            a = b; 
            b = c;
            if (a % 2 == 0) {
                total = a + total;

            }
        }  
        System.out.println(total);
    }
}

