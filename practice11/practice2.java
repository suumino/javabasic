import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        // 4-7
        // Scanner sc = new Scanner(System.in);
        // int x;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // int i = 0;
        // while(i < x) {
        //     System.out.print("*");
        //     i++;
        // }
        // if (x<1) {
        //     System.out.println();
        // }

        // 4-8
        // Scanner sc = new Scanner(System.in);
        // int x;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // int i = 0;
        // while (i < x) {
        //     if (i % 2 == 0) System.out.print("*");
        //     else System.out.print("+");
        //     i++;
        // }
        // if (x<1) {
        //     System.out.println();
        // }

        // Scanner sc = new Scanner(System.in);
        // int x;
        // int y = 0;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // while (x > 0 ) {
        //     y++;
        //     x = x/10;   
        // }
        // System.out.println(y);

        // 4-10
        // Scanner sc = new Scanner(System.in);
        // int x;
        // int i = 1;
        // int re = 1;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // while (i<=x) {
        //     re *= i;
        //     i++;
        // }
        // System.out.println(re);

        // 4-11
        // Scanner sc = new Scanner(System.in);
        // int x;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // for (int i = 0; i < x; i++ ) {
        //     System.out.print("*");
        // }
        // if (x<1) {
        //     System.out.println();
        // }

        // 4-14
        // Scanner sc = new Scanner(System.in);
        // int x;
        // int s = 0;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // for (int i = 0; i <= x; i++) {
        //     s += i;
        // }
        // System.out.println(s);

        // 4-15
        // Scanner sc = new Scanner(System.in);
        // int x;
        // int s = 0;
        // String m = "1";
        // System.out.print("number : ");
        // x = sc.nextInt();
        // for (int i = 1; i <= x; i++) {
        //     s += i;
        //     if (i != 1) m += (" + "+i);
        // }
        // System.out.println(m+ " = "+s);

        // 4-16
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // int c;
        // System.out.print("number 1: ");
        // a = sc.nextInt();
        // System.out.print("number 2: ");
        // b = sc.nextInt();
        // System.out.print("interval : ");
        // c = sc.nextInt();
        // for (int i = a ; i <= b; i += c) {
        //     System.out.println(i+" "+((i-100)*0.9));

        // }

        // 4-20

        // Scanner sc = new Scanner(System.in);
        // System.out.println("season?");
        // int a;
        // int b = 1;
        // do {
            
            
        //     do {
                
        //         System.out.print("month: ");
        //         a = sc.nextInt();            
        //     } while (a < 1 || a >= 13);

        //     if (a >= 3 && a <= 5) System.out.println("String");
        //     else if (a >= 6 && a <= 8) System.out.println("Summer");
        //     else if (a >= 9 && a <= 11) System.out.println("Fall");
        //     else System.out.println("Winter");
        //     System.out.print("again? : ");
        //     b = sc.nextInt();

        // } while(b == 1);

        // 4-21
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int j = 0;
        // System.out.print("number : ");
        // a = sc.nextInt();
        // do {
        //     int i = 0;
        //     do {
        //         System.out.print("*");
        //         i++;
        //     } while (i < a);
        //     System.out.println();
        //     j++;
        // } while (j < a);

        // 4-22 -1
        // Scanner sc = new Scanner(System.in);
        // int a;
        // System.out.print("number : ");
        // a = sc.nextInt();
        // for (int j = 0; j < a; j++){
        //     String s = "";
        //     for (int i = 0; i <= j; i++) {
        //         s += "*";
        //     }
        //     System.out.println(s);
        // }

        // 4-22 -2
        // Scanner sc = new Scanner(System.in);
        // int a;
        // System.out.print("number : ");
        // a = sc.nextInt();
        // for (int j = a; j > 0; j--){
        //     String s = "";
        //     for (int i = 0; i < j; i++) {
        //         s += "*";
        //     }
        //     System.out.println(s);
        // }
        
        // 4-22 -3
        // Scanner sc = new Scanner(System.in);
        // int a;
        // System.out.print("number : ");
        // a = sc.nextInt();
        // for (int j = 0; j < a; j++){
        //     String s = "";
        //     for (int i = 0; i < a; i++) {
        //         if (i < j) s += " ";
        //         else s += "*";
        //     }
        //     System.out.println(s);
        // }

        // 4-23
        // Scanner sc = new Scanner(System.in);
        // System.out.print("number : ");
        // int a = sc.nextInt();
        // String s = "";
        // for (int i = a; i > 0 ; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if (j < i) System.out.print(" ");
        //         else if ( i == j) 
        //             for (int k = 1; k <=(2*(a-j+1)-1); k++) System.out.print("*"); 
        //     }
        //     System.out.println(s);
        // }

        // 4-24
        // Scanner sc = new Scanner(System.in);
        // System.out.print("number : ");
        // int a = sc.nextInt();
        // String s = "";
        // for (int i = a; i > 0 ; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         if (j < i) System.out.print(" ");
        //         else if ( i == j) 
        //             for (int k = 1; k <=(2*(a-j+1)-1); k++) 
        //                 if ((a-i+1) < 10) System.out.print((a-i+1)); 
        //                 else if ((a-i+1) >= 10) System.out.print((a-i+1)%10);
        //     }
        //     System.out.println(s);
        // }

        // 4-25
        // Scanner sc = new Scanner(System.in);
        // System.out.print("number : ");
        // int a = sc.nextInt();
        // String s = "Yes";
        // for (int i = 2; i < a; i++) {
        //     if (a % i == 0) s = "No";
        // }
        // System.out.println(s);

        // 4-26
        Scanner sc = new Scanner(System.in);
        System.out.print("number : ");
        int a = sc.nextInt();
        int x = 1;
        int sum = 0;
        int c = 0;
        while (a > c && x > 0 ) {
            System.out.print((c+1)+" number : ");
            x = sc.nextInt();
            sum += x;
            c++;
        }
        double av = 0;
        if (a == c) av = sum / c;
        else av = sum / (c-1);
        System.out.println("sum : " + sum + "\naverage : " + av);
        



    }
}