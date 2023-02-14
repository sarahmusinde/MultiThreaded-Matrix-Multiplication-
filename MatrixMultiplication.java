

public class MatrixMultiplication {
    public static void Main(String[] args) {
        //creates 9 Worker threads. Each thread Calculates a Matrix Value and sets it to C matrix
        for (int i = 0; i<M; i++){
            for (int j=0; j<N; j++){
                Threads[i][j] = new WorkerThread(i,j,A,B,C);
                Threads[i][j].start();
            }
        }

        //Outputs the Values of Matrix C
        System.out.println("Elements of Matrix C:");
        for (int i = 0; i<M; i++){
            for (int j=0; j<N; j++){
                System.out.println("["+i+","+j+"] = "+C[i][j]);
            }
        }
    }
}
