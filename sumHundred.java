class sumHundred {

    public static void main (String[] args) {
        int a = 0;
        int b = 0;
        int total = 0;
        int diff = 0;
        for (a = 0; a <= 100; a++) {
            b += a * a;
            total += a;
            diff = total*total - b;
            // assignment operator +=
            
            //total += b;
            //diff = total - Math.sqrt(total);
            
            //trouble with adding total 
            //total it first, then find Math.sqrt(total);
              
            
           
         
        }
        System.out.println(diff);
       //System.out.println(diff);
    }
}
