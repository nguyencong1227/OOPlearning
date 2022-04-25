import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class matrices {
    public static void main(String[] args) throws IOException {
	Scanner in = new Scanner(System.in);
        BufferedReader reader;
        reader = new BufferedReader(new FileReader("matrix2.txt"));

        String firstDimension = reader.readLine();
        String[] split = firstDimension.split(" ");
        int firstX = Integer.parseInt(split[0]);
        int firstY = Integer.parseInt(split[0]);

        int[][] first = new int[firstX][firstY];

        for (int i = 0; i < firstX; i++) {
            String[] line;
            line = reader.readLine().split(" ");

            for (int j = 0; j < firstY; j++) {
                first[i][j] = Integer.parseInt(line[j]);
            }

        }

        // Read "@"
        reader.readLine();
        System.out.println("ma tran thu nhat:"+ Arrays.deepToString(first));

        String secondDimension = reader.readLine();
        String[] split2 = secondDimension.split("");
        int secX = Integer.parseInt(split2[0]);
        int secY = Integer.parseInt(split2[0]);

        int[][] second = new int[secX][secY];

        for (int i = 0; i < secX; i++) {
            String[] line;
            line = reader.readLine().split(" ");

            for (int j = 0; j < secY; j++) {
                second[i][j] = Integer.parseInt(line[j]);
            }

        }

        System.out.println("Ma tran thu hai: "+ Arrays.deepToString(second));
	boolean stat = true;
	while(stat) {

		System.out.println("Hello this is a simple matrix calculator \n "
			+ "Select matrix opertion: \n1 for addition, \n2 for subtraction, \n3 for multiplication, \n4 for transpose first matrices, \n5 for transpose second matrices, \n6 for exit");
		int option;
		option = in.nextInt();
		switch(option) {
			case 1:
				System.out.println();
				AddMatrices(first, second);
				System.out.println();
				break;
			case 2:
				System.out.println();
				SubMatrices(first, second);
				System.out.println();
				break;
			case 3:
				System.out.println();
				MultMatrices(first, second, firstX, firstY, secX);
				System.out.println();
				break;
			case 4:
				System.out.println();
				Transpose(first);
				System.out.println();
				break;
			case 5:
				System.out.println();
				Transpose(second);
				System.out.println();
				break;
			case 6:
				stat = false;
				break;
		}
	}

        reader.close();
    }


    // All methos below this line perform operations
    // The methos below this line will check if operations can e performed on matrices
    // Check Add && Sub
    public static boolean CheckIfValidAddSub(int[][] first, int[][] second) {
	    boolean status;
	    int numRow1 = first.length;
	    int numCol1 = first[0].length;
	    int numRow2 = first.length;
	    int numCol2 = first[0].length;

	    if(numRow1 == numRow2 && numCol1 == numCol2) {
		    status = true;
	    }else{
		    status = false;
	    }
	    return status;
    }

    
    // Check Mul
    public static boolean CheckIfValidMult(int[][] first, int[][] second) {
	    boolean status;
	    int numCol1 = first[0].length;
	    int numRow2 = second.length;
	    if(numCol1 == numRow2) {
		    status = true;
	    }else{
		    status = false;
	    }
	    return status;
    }



    // All methos below this line perform operations
    // Add matrices
    public static void AddMatrices(int[][] first, int[][] second) {
	    boolean status = CheckIfValidAddSub(first, second);
	    if (status == true ) {
		    for (int i = 0; i < first.length; i++) {
			    for (int j = 0; j < first[0].length; j++) {
				    int charM1 = first[i][j];
				    int charM2 = second[i][j];
				    int resultant = charM1 + charM2;
				    System.out.print(resultant+ " ");
			    }
			    System.out.print("\n");
		    }
	    }else{
		    System.out.println("In order to add or subtract matrices they both must have the same number of rows \n and the same number of columns");
	    }
    }


    // Sub  matrices
    public static void SubMatrices(int[][] first, int[][] second) {
            boolean status = CheckIfValidAddSub(first, second);
            if (status == true ) {
                    for (int i = 0; i < first.length; i++) {
                            for (int j = 0; j < first[0].length; j++) {
                                    int charM1 = first[i][j];
                                    int charM2 = second[i][j];
                                    int resultant = charM1 - charM2;
                                    System.out.print(resultant+ " ");
                            }
                            System.out.print("\n");
                    }
            }else{
                    System.out.println("In order to add or subtract matrices they both must have the same number of rows \n and the same number of columns");
            }
    }

    // Multuply Matrices
    public static void MultMatrices(int[][] first, int[][] second, int Row1, int Col1, int Col2) {
	    boolean status = CheckIfValidMult(first, second);
	    int result[][] = new int[Row1][Col2];
	    if(status == true) {

		    for(int i = 0; i < first.length; i++){
			    for(int j = 0; j < second[0].length; j++) {
				    result[i][j] = 0;
				    for(int k = 0; k < Col1; k++) {
					    result[i][j] += first[i][j] * second[j][i];
				    }
				    System.out.print(result[i][j] + " ");
			    }
			    System.out.println();
		    }
				   
	    }else{
		    System.out.println(" Invalid Input");
	    }
    }

    // Transpose matrices
    public static void Transpose (int[][] matrices)
    {
	    int result[][] = new int[matrices.length][matrices[0].length];
	    for(int i = 0; i < matrices.length; i++) 
	    {
		    for( int j = 0; j < matrices[0].length; j++)
		    {
			    result[i][j] = matrices[j][i];
			    System.out.print(result[i][j] + " ");
		    }
		    System.out.println();
	    }
    }





}
