import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0; i<3; i++){
            String s1 = sc.next();
            int x = sc.nextInt();
            
            int spaces = 15 - s1.length();
            String num = "";
            
            int j=0;
            while(j<spaces) {
                s1 += " ";
                j++;
            }
            
            if(x>=0 && x<=9) {
                num = "00"+x;
            } else if(x>=10 && x<=99) {
                num = "0"+x;
            } else if(x>=100 && x<=999) {
                num = String.valueOf(x);
            }
            
            System.out.println(s1+num);
        }
        sc.close();
        System.out.println("================================");

    }
}