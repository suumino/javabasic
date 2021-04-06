public class Test {
    // 입력과 출력 모두 있음 //
    public int sum(int a, int b) {
        return a + b;
    }
    // 입력이 없음 //
    public String say() {
        return "Hi";
    }
    // 리턴이 없음 //
    public void summ(int e, int f) {
        System.out.println(e+"과 "+f+"의 합은 " +(e+f)+"입니다.");
    }
    // 입력값도 리턴값도 없음 //
    public void sayy() {
        System.out.println("Hi");
    }
    

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        Test myTest = new Test();
        int c = myTest.sum(a, b);

        System.out.println(c);
        //////////////////////////////////////////
        Test myTest2 = new Test();
        String d = myTest2.say();
        System.out.println(d);
        //////////////////////////////////////////
        Test myTest3 = new Test();
        myTest3.summ(3, 4);
        //////////////////////////////////////////
        Test myTest4 = new Test();
        myTest4.sayy();
    }
}
