package ArrayExample;

public class ArrayExample {
    public static void main(String[] args) {
        int marks;
        int[] studentMarks = new int[4];

        int[] Marks = {100,102};

        for (int i =0; i<studentMarks.length;i++){
            studentMarks[i]   = i+100;
        }

        for (int i =0; i<studentMarks.length;i++){
            System.out.println(studentMarks[i]);
        }

    }
}
