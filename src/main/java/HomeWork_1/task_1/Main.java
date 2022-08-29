package HomeWork_1.task_1;

public class Main {
    public static void main(String[] args) {
        int row = 5;
        int col = 5;
        int[][] matrix = new int[row][col];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        int max = matrix[0][0];
        int  min = matrix[0][0];
        double sum = 0;
        double average = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (max < matrix[i][j]) max = matrix[i][j];
                if (min > matrix[i][j]) min = matrix[i][j];
            }

        }
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sum +=  matrix[i][j];
                counter++;
            }
        }
        average =  sum /  counter;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Average = " +  average);
    }
}
