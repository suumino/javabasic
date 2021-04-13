public class VariableScopeExam {
    int globalScope = 10;
    static int staticVal= 8;

    public void scopeTest(int value) {
        int localScope = 20;

        System.out.println(globalScope);
        System.out.println(localScope);
        System.out.println(value);
    }
    public void scopeTest2(int value2) {
        System.out.println(globalScope);
    }

    public static void main(String[] args) {
        System.out.println(staticVal);

        VariableScopeExam v1 = new VariableScopeExam();
        System.out.println(v1.globalScope);
        v1.globalScope = 10;
        v2.globalScope = 20;
        System.out.println(v1.globalScope);
        System.out.println(v2.globalScope);
        v2.staticVal = 100;

    }
    
}
