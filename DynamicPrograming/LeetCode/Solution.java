package Java.DynamicPrograming.LeetCode;

public class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] text1CharArr = text1.toCharArray();
        char[] text2CharArr = text2.toCharArray();
        int[][] resultMatrix = new int[text1CharArr.length+1][text2CharArr.length+1];
        for(int i=1;i<=text1CharArr.length;i++) {
            for(int j=1;j<=text2CharArr.length;j++) {
                if(text1CharArr[i-1] == text2CharArr[j-1])
                    resultMatrix[i][j] = resultMatrix[i-1][j-1] + 1;
                else
                    resultMatrix[i][j] = Math.max(resultMatrix[i][j-1], resultMatrix[i-1][j]);
            }
        }
        return resultMatrix[text1CharArr.length][text2CharArr.length];
    }
}
