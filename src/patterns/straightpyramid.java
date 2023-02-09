package patterns;
//        *
//       ***
//      *****
//     *******
public class straightpyramid {
    public static void main(String[] args) {
        for (int row=0;row<6;row++){
            for (int col=0;col<6;col++) {
                if ( col<row-1 || row==col-1  ) {
                    System.out.print(" * ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }
    }
}
