public class Loops{
    public static void main(String[] args){
	double loopCount;

	//	System.out.print("Enter a positive number: ");
	//	loopCount = IO.readDouble();

	do{
	    System.out.print("Enter a positive number: ");
	    loopCount = IO.readDouble();
	}
	while(loopCount<= 0);
	    
	System.out.println("The number is " + loopCount);
    }
}
