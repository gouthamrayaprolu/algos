public class LCS {

    /**
     * @param args
     */

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        char[] str1 = {'s', 't', 'o', 'n', 'e'};
        char[] str2 = {'l','o', 'n', 'g', 'e', 's', 't'};

        lcsFor(str1, str2);

    }

    private static void lcsFor(char[] a, char[] b) {
        // TODO Auto-generated method stub
        int i=0;
        int j=0;
        int abc = lcs(i, j, a, b);
        System.out.println(abc);
        System.out.println(lcsMatrix(0, 0, a, b));
    }

    private static int lcs(int i, int j, char[] a, char[] b) {
        // TODO Auto-generated method stub
        if(i >= a.length || j >=b.length){
            return 0;
        }
        if(a[i] == b[j]){

            return 1 + lcs(i+1, j+1, a, b);
        }
        else {
            return Math.max(lcs(i+1, j , a ,b),  lcs(i, j+1, a, b));
        }
    }
    
    private static int lcsMatrix(int i, int j, char[] a, char[] b) {
        int m = a.length;
        int n = b.length;
        int L[][] = new int[m + 1][n + 1];
        for (int p = 0; p <=m; p++) {
            for (int q = 0; q <=n; q++) {
                if (p == 0 || q == 0) {
                    L[p][q] = 0;
                }
                else if (a[p - 1] == b[q - 1]) {
                    L[p][q] = L[p - 1][q - 1] + 1;
                }
                else {
                    L[p][q] = Math.max(L[p - 1][q], L[p][q - 1]);
                }
            }
        }
        return L[m][n];
    }
}
