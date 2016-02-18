public class Example2{
    public static void main(String [] args){
	System.out.print("Number of rows: ");
	int rows = IO.readInt();

	System.out.print("Number of columns: ");
	int columns = IO.readInt();
	for(int i=1; i<=rows; i++){
	    for(int j=1; j <=columns; j++){
		System.out.print(i*j+" ");
	    }
	    System.out.println();
	}
    }
}
