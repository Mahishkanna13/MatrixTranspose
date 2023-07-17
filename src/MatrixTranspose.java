import java.util.Scanner;

public class MatrixTranspose {
    public static void Transpose(int[][] Array,int Rowsize,int Columnsize)
    {
        int temp=0;
        int Result[][]=new int[Columnsize][Rowsize];
        for(int i=0;i<Columnsize;i++)
        {
            for (int j=0;j<Rowsize;j++)
            {
                Result[i][j]=Array[j][i];
            }
        }
        for(int i=0;i<Result.length;i++)
        {
            for(int j=0;j<Result[0].length;j++)
            {
                System.out.print(Result[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int Rowsize=scanner.nextInt();
        int Columnsize=scanner.nextInt();
        int Array[][]=new int[Rowsize][Columnsize];
        for(int i=0;i<Rowsize;i++)
        {
            for(int j=0;j<Columnsize;j++)
            {
                Array[i][j]=scanner.nextInt();
            }
        }
        Transpose(Array,Rowsize,Columnsize);

    }
}
