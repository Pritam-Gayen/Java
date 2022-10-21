package Java.Greedy.NewtonSchool;

import java.util.Scanner;

public class GoodNumbers {
    public static void main (String[] args) {
        boolean log = false;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long num = 1;
        long count = 0;
        String[] numStr = {"1","2","3","4","5","6","7","8","9"};
        boolean limitCross = false;
        for(long i=1;i<n;i++) {
            for(int j=0;j<9;j++) {
                String temp = numStr[j];
                for(long k=1;k<i;k++) {
                    temp += numStr[j];
                }
                num = Long.parseLong(temp);
                if(log) System.out.println(num);
                if(num > n)
                    limitCross = true;
                else
                    count++;
                if(limitCross)
                    break;
            }
            if(limitCross)
                break;
        }
        System.out.print(count);
    }
}
