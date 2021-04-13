public class practice {
    public static void main(String[] args) {
        int a[] = {4, 2, 3, 5, 1};
        int c = 0;
    
        for (int i = 0; i < a.length ; i++) {
            if (a[i] == 5) {
                c = i;
            }
        }
        if (c != 0) {
            System.out.println(c+"번째의 요소가 일치");
        }
        else {
            System.out.println("찾지 못했습니다.");
        }
    }
}
