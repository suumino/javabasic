import java.util.*;

public class practice1 {
    public static void main(String[] args) {
        // 1-3
        // System.out.print("program");
        // System.out.println("first");

        // // 1-4
        // System.out.println("hong\ngil\ndong");

        // // 1-5
        // System.out.println("hong\n\ngil\ndong");

        // // 2-1
        // int a = 82;
        // int b = 17;
        // System.out.println("add : "+(a+b)+", sub : "+ (a-b));
        
        // // 2-2
        // int x = 63;
        // int y = 18;
        // System.out.println("sum : "+ (x + y) + ", average : " + ((x + y) / 2));
        
        // // 2-3
        // double c = 63.4;
        // double d = 18.3;
        // System.out.println("sum : "+ (c + d) + ", average : " + ((c + d) / 2));
        
        // // 2-4
        // System.out.println("x : "+63+"\ny : "+18+"\nz : "+52);
        // System.out.println("sum : "+(63+18+52)+"\naverage : "+ ((62+28+52)/3));

        // 2-5
        // Scanner scan = new Scanner(System.in);
        // int num;
        // System.out.print("number : ");
        // num = scan.nextInt();
        // System.out.println(num + );
        
        //2-6
        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.print("num : ");
        // n = sc.nextInt();
        // System.out.println("10+ : " + (n + 10));
        // System.out.println("10- : " + (n - 10));

        //2-7
        // Scanner sc = new Scanner(System.in);
        // String n;
        // System.out.print("num : ");
        // n = sc.next();
        // System.out.println(n.substring(0, n.length()-1));
        // System.out.println(n.substring(n.length()-1, n.length()));

        // Scanner sc = new Scanner(System.in);
        // int n;
        // System.out.print("num : ");
        // n = sc.nextInt();
        // System.out.println((n/10));
        // System.out.println(n%10);

        // 2-9
        // Scanner sc = new Scanner(System.in);
        // double base;
        // double height;
        // System.out.print("base : ");
        // base = sc.nextDouble();
        // System.out.print("height : ");
        // height = sc.nextDouble();
        // System.out.println("area : " + (base*height/2));

        // 2-10
        // Scanner sc = new Scanner(System.in);
        // double r;
        // double pi = 3.141592;
        // System.out.print("r : ");
        // r = sc.nextDouble();
        // System.out.println("surface area : " + ((4*pi*r*r)));
        // System.out.println("volume : "+ (4*pi*r*r*r/3));

        // 2-11
        // Random rand = new Random();
        // int x = 1 + rand.nextInt(9);
        // int y = -1 - rand.nextInt(9);
        // int z = 10 + rand.nextInt(90);

        // System.out.println("3 random number~");
        // System.out.println("0 ~ 9 : " + x);
        // System.out.println("-0 ~ -1 : " + y);
        // System.out.println("10 ~ 99 : " + z);

        // 2-12
        // Scanner sc = new Scanner(System.in);
        // Random rand = new Random();
        // int x;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // int y = (x - 5) + rand.nextInt(10);
        // System.out.println(y);

        // 2-14
        // Scanner sc = new Scanner(System.in);
        // String f;
        // String name;
        // System.out.print("family name : ");
        // f = sc.next();
        // System.out.print("name : ");
        // name = sc.next();
        // System.out.println("hi, "+f+name);

        // 2-16
        // String s1 = "ABC";
        // String s2 = "XYZ";
        // System.out.println(s1);
        // System.out.println(s2);
        // s1 = "FBI";
        // System.out.println(s1);
        // System.out.println(s2);
        

        // 3-1
        // Scanner sc = new Scanner(System.in);
        // int x;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // if (x < 0) {
        //     System.out.println("this number is negative number");
        // }

        // 3-2
        // Scanner sc = new Scanner(System.in);
        // int x;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // if (x < 0) {
        //     x = -x;
        // }
        // System.out.println(x);

        // 3-3, 3-4
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // System.out.print("a : ");
        // a = sc.nextInt();
        // System.out.print("b : ");
        // b = sc.nextInt();
        // if (a%b != 0) {
        //     System.out.println("no");
        // } else {
        //     System.out.println("yes");
        // }

        // 3-5
        // Scanner sc = new Scanner(System.in);
        // int x;
        // System.out.print("number : ");
        // x = sc.nextInt();
        // if (x > 0) {
        //     System.out.println("positive number");
        // } else if (x == 0) {
        //     System.out.println("this is zero");
        // } else {
        //     System.out.println("negative number");
        // }

        // 3-7
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // String c;
        // System.out.print("number A : ");
        // a = sc.nextInt();
        // System.out.print("number B : ");
        // b = sc.nextInt();
        // if (a > b) {
        //     c = "A";
        // } else if (a < b) {
        //     c = "B";
        // } else {
        //     c = "A = B";
        // }
        // System.out.println(c);

        // 3-9
        // Scanner sc = new Scanner(System.in);
        // int a;
        // System.out.print("number : ");
        // a = sc.nextInt();
        // if (a < 0) {
        //     System.out.println("negative number..");
        // } else if (a % 10 == 0) {
        //     System.out.println("yes");
        // } else {
        //     System.out.println("no");
        // }

        // 3-11
        // Scanner sc = new Scanner(System.in);
        // int a;
        // String grade;
        // System.out.print("score : ");
        // a = sc.nextInt();
        // if (a <= 100) {
        //     if (a >= 90) {
        //         grade = "su";
        //     } else if (a >= 80) {
        //         grade = "woo";
        //     } else if (a >= 70) {
        //         grade = "mi";
        //     } else if (a >= 60) {
        //         grade = "yang";
        //     } else {
        //         grade = "ga";
        //     }
        // } else {
        //     grade = "wrong value";
        // }
        // System.out.println(grade);

        // 3 - 13
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // int c;
        // System.out.print("number 1 : ");
        // a = sc.nextInt();
        // System.out.print("number 2 : ");
        // b = sc.nextInt();
        // if (a > b) {
        //     c = a - b;
        // } else if (a < b) {
        //     c = b - a;
        // } else {
        //     c = 0;
        // }
        // System.out.println(c);

        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // int c;
        // System.out.print("number 1 : ");
        // a = sc.nextInt();
        // System.out.print("number 2 : ");
        // b = sc.nextInt();
        // c = Math.abs(a - b);
        // System.out.println(c);

        // 3-14
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // int c;
        // int d;
        // System.out.print("A : ");
        // a = sc.nextInt();
        // System.out.print("B : ");
        // b = sc.nextInt();
        // System.out.print("C : ");
        // c = sc.nextInt();

        // d = a;
        // if (b < d) d = b;
        // if (c < d) d = c;
        // System.out.println(d);

        // 3-16
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // int c;
        // System.out.print("A : ");
        // a = sc.nextInt();
        // System.out.print("B : ");
        // b = sc.nextInt();
        // System.out.print("C : ");
        // c = sc.nextInt();

        // int m = 0;

        // if (( b >= a && c <=  a) || ( b <= a && c >= a)) m = a;
        // else if (( a >= b && c <=  b) || ( a <= b && c >= b)) m = b;
        // else if (( b >= c && a <=  c) || ( b <= c && a >= c)) m = c;
        // System.out.println("middle number is " + m);

        // 3-18
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // int x = 0, y = 0;
        // System.out.print("A : ");
        // a = sc.nextInt();
        // System.out.print("B : ");
        // b = sc.nextInt();
        // x = (a > b) ? a : b;
        // y = (a > b) ? b : a;
        
        // System.out.println("A >= B");
        // System.out.println("A : "+ x +"\nB : " + y);
        
        // 3-19
        // Scanner sc = new Scanner(System.in);
        // int a;
        // int b;
        // int c;
        // int x = 0, y = 0, z = 0;
        // System.out.print("A : ");
        // a = sc.nextInt();
        // System.out.print("B : ");
        // b = sc.nextInt();
        // System.out.print("C : ");
        // c = sc.nextInt();
        // System.out.println("sort!");
        // x = (a <= b && a <= c) ? a : (b <= a && b <= c) ? b : c;
        // z = (a >= b && a >= c) ? a : (b >= a && b >= c) ? b : c;
        // y = (a != x && a != z) ? a : (b != x && b != z) ? b : c;
        // System.out.println("A : "+x+"\nB : "+y+"\nC : "+z);
        



    
    } 
}
