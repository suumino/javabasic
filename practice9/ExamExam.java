public class ExamExam {
    public static void main(String[] args) {
        ExceptionExam3 ex = new ExceptionExam();
        int num = ex.get50Item(new int[100]);
        System.out.println("array 50: "+ num);
    }

    // public static void main(String[] args) {
    //     ExceptionExam3 ex = new ExceptionExam();
    //     int num = ex.get50Item(new int[30]);
    //     System.out.println("array 50: "+ num);
    // }
}
