class Solution_583 {
    public int minDistance(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        int[][] a = new int[len1+1][len2+1] ;
        for (int i = 0;i <= len1;i ++){
            a[i][0] = 0;
        }
        for (int j = 0;j <= len2;j ++){
            a[0][j] = 0;
        }
        for (int i = 1;i <= len1;i ++){
            for (int j = 1;j <= len2;j ++){
                a[i][j] = Math.max(a[i-1][j],a[i][j-1]);
                if(word1.charAt(i-1) == word2.charAt(j-1)) a[i][j] = Math.max(a[i-1][j-1]+1, a[i][j]);
            }
        }
        return len1+len2-2*a[len1][len2];
    }
}