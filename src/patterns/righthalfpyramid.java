package patterns;

public class righthalfpyramid {
    public static void main(String[] args) {
        for (int row=0;row<5;row++){
            for (int col =0;col<5;col++){
                if(row<col+1){
                    System.out.print(" * ");
                }

            }
            System.out.print("\n");
        }
    }
}
