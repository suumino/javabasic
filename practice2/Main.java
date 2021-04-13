import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.print("data input gogo : ");
        Scanner sc = new Scanner(System.in);
        int search = sc.nextInt();
        int[] arr = {11, 13, 17, 19, 23, 29, 31};
        Bsearch(arr, search);
    }

    public static void Bsearch(int[] arr, int search) {
        int head = 0;
        int tail = arr.length - 1;
        int center;

        while (head <= tail) {
            center = (head + tail)/2;
            if (search < arr[center]) {
                tail = center;
            }
            else if (search > arr[center]) {
                head = center;
            }
            else if (search == arr[center]) {
                System.out.println(center);
            }
        }
    }
        
}