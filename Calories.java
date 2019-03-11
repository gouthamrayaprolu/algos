    import java.math.BigDecimal;
    import java.util.Scanner;
    
    class Calories {
        static BigDecimal TWO = new BigDecimal(2);
        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int testCases = sc.nextInt();
    
            for (int i = 0; i < testCases; i++) {
    
                int noofdays = sc.nextInt();
                if(noofdays == 1){
                    System.out.println(sc.nextInt());
                    continue;
                }
                int[] d = new int[noofdays];
                for (int j = 0; j < noofdays; j++) {
                    d[j] = sc.nextInt();
                }
                sort(d, 0, d.length-1);
                System.out.println(calculate(noofdays, d));
            }
        }
    
        private static BigDecimal calculate(int noofdays, int[] d) {
    
            BigDecimal temp = BigDecimal.ZERO;
            BigDecimal di = BigDecimal.ZERO;
            for (int i = d.length - 1; i >= 0; i--) {
                BigDecimal val = (TWO.multiply(di)).add(new BigDecimal(d[i]));
                di = val.subtract(di);
                temp = temp.add(val);
            }
    
            return temp;
        }
            
     static int partition(int arr[], int low, int high) 
     { 
         int pivot = arr[high];  
         int i = (low-1); 
         for (int j=low; j<high; j++) 
         { 
 
             if (arr[j] <= pivot) 
             { 
                 i++; 
                 int temp = arr[i]; 
                 arr[i] = arr[j]; 
                 arr[j] = temp; 
             } 
         } 
   
         int temp = arr[i+1]; 
         arr[i+1] = arr[high]; 
         arr[high] = temp; 
   
         return i+1; 
     } 

     static void sort(int arr[], int low, int high) 
     { 
         if (low < high) 
         { 

             int pi = partition(arr, low, high); 

             sort(arr, low, pi-1); 
             sort(arr, pi+1, high); 
         } 
     }    
}
