
class LongestIncreasingSequence {

    public static int lis(int[] arr, int length) {
        
        int[] temp = new int[length];
        int[] subseq = new int[length];
        for(int i=0; i<length; i++){
            temp[i] = 1;
        }
        int max = 0;
        for(int i=1; i<length; i++){
            for(int j=0; j<i; j++){
                if(arr[j]<arr[i] && temp[i]<=temp[j]+1){
                    temp[i] = temp[j]+1;
                    subseq[i] = j;
                    max = Math.max(max, temp[i]);
                }
            }
        }
        int counter = max;
        int a = subseq.length -1;
        while(counter>0){
            System.out.println(arr[a]);
            if(a==0){
                break;
            }
            a = subseq[a];
            counter--;
        }
        return max;
    }

}
