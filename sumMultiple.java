class sumMultiple {

    public static void main (String[] args) {

        //variables 
        int n = 0;
        int total = 0;
        int a = 3;
        int b = 5;

        for (n = 0; n < 1000; n++) {
            if (n % 3 == 0) {
                total = n + total;
            }   else if (n % 5 == 0) {
                total = n + total;

            }

        
        
        }
        System.out.print("Total: " + total);

        
    }
   
}