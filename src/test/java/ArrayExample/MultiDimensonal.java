package ArrayExample;

public class MultiDimensonal {
    public static void main(String[] args) {
        int [][] studentsMarks = new int[3][4];

        //Assigning the values in 2D
        for (int i  =0; i <3; i++){
            for (int j =0; j<4;j++){
                studentsMarks[i][j]= j+i;
            }
        }

        //Accessing the 2D array Element
        for (int i  =0; i <3; i++){
            for (int j =0; j<4;j++){
                System.out.print(studentsMarks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
