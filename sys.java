import java.util.*;
public class sys{
    static void prinnt(int[][] mat){
        System.out.print(Arrays.deepToString(mat)); 
    }
    static void printlist(int[][] mat){
        for(int[] row:mat){
            System.out.println(Arrays.toString(row));
        }
    }

    static void print2dforeach(int[][] mat){
        for(int[] row:mat){
            for(int value:row){
                System.out.print(value+" ");
            }
            System.out.println();
        }

    }
    static void print2d(int[][] mat){

        for(int i=0;i<mat.length;i++){
            // System.out.print("[ ");
            for(int j=0;j<mat[0].length;j++){
                System.out.print(mat[i][j]+" ");
            }
            // System.out.print(" ]");
            System.out.println();
        }
    }
    public static void main(String[] args){
        int[][] mat = {{1,2,3},{1,2,3},{3,2,1}};
        //printlist(mat);
        //print2d(mat);
        //prinnt(mat);
        // print2dforeach(mat);
        
    print2d(mat);

    }
}