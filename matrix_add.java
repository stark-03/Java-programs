public class matrix_add {
    public static void main(String[] args){
        int matrix1[][] = { {1, 2, 3},
                            {4, 5, 6},
                            {7, 8, 9}
                        };
        int matrix2[][] = { {11, 12, 13},
                            {24, 25, 26},
                            {37, 38, 39}
                        };
        int matrix3[][] = new int[3][3];
        System.out.println("---->Program Matrix Addition<----");
        for(int i = 0; i <= 2; ++i){
            for (int j = 0; j <= 2; ++j){
                matrix3[i][j] = (matrix1[i][j] + matrix2[i][j]);
            }
        }

        System.out.println("Matrix1");
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print("\t"+matrix1[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Matrix2");
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                    System.out.print("\t"+matrix2[i][j]);
            }
            System.out.println(" ");
        }

        System.out.println("Matrix3");
        for(int i = 0; i <= 2; i++){
            for(int j = 0; j <= 2; j++){
                System.out.print("\t"+matrix3[i][j]);
            }
            System.out.println("");
        }

    }
}
