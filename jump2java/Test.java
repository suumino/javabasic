public class Test {
    public void sayNick(String nick) throws FoolException {
        if("fool".equals(nick)) {
            throw new FoolException();
        }
        System.out.println("your nickname is "+nick);
    }

    public static void main(String[] args) {
        Test test = new Test();
        try {
            test.sayNick("fool");
            test.sayNick("genious");
        }catch(FoolException e) {
            System.err.println("FoolException");
        }
    }
}
    // public void shouldBeRun() {
    //     System.out.println("ok, thanks.");
    // }
    // public static void main(String[] args) {
    //     Test test = new Test();
    //     int c;
    //     try {
    //         c = 4/0;
    //         test.shouldBeRun();
    //     } catch (ArithmeticException e) {
    //         c = -1;
    //     } finally {
    //         test.shouldBeRun();
    //     }
    // }
// }
