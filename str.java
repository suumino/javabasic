public class str {
    public static void main(String args[]) {
        String a = "Happy Java";
        String b = new String("Heppy Java");
        String c = "Happy Java";

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        // 파이썬이랑 다르게 같으면 주소값이 같아져버려
        // new 를 붙여야 주소값이 다르다.
        // 이 equalls는 주소값이 같은지 보는것임

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));
        System.out.println(System.identityHashCode(c));
        // a랑 c랑은 주소값이 같다. 변수명만 다르다.

        System.out.println(a.indexOf("Java"));
        // indexOf: Java가 시작되는 index값을 알려줌
        System.out.println(a.replaceAll("Java", "World"));
        // replaceAll: Java를 World로 교체
        System.out.println(a.substring(0, 4));
        // substring: 특정 문자열만 뽑아냄, 0이상 4미만
        System.out.println(a.toUpperCase());
        // toUpperCase: 모두 대문자로 바꿈

        System.out.println(a);
        // 위의 4개는 a를 직접적으로 바꾸지는 않음
        // replaceAll 과 toUpperCase를 특히 기억해라
    }    
}
