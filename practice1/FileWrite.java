import java.io.PrintWriter;
import java.io.IOException;

public class FileWrite {
  public static void main(String[] args) throws IOException {
    PrintWriter odd = new PrintWriter("odd.txt");
    
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 1){
        odd.println(i);
      }
    }
    odd.close();
  }
}