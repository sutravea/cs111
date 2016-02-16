public class MenuExample{
    
    public static void main(String[] args){

	double first, second;
	int operIndex;
	
	System.out.print("First number: ");
	first = IO.readInt();
	System.out.print("Second number: ");
	second = IO.readInt();

	
	System.out.println("1. Add");
	System.out.println("2. Subtract");
	System.out.println("3. Multiply");
	System.out.println("4. Divide");
	
	System.out.print("What is the desired operation (1,2,3,4): ");
	
	operIndex = IO.readInt();

	switch(operIndex){
	case 1:
	    System.out.println(first+second);
	    break;
	case 2:
	    System.out.println(first-second);
	    break;
	case 3:
	    System.out.println(first*second);
	    break;
	case 4:
	    if(second == 0)
		System.outprintln("DIVIDE BY 0 ERROR");
	    else
		System.out.println(first/second);
	    break;
	default:
	    System.out.println("INVALID OPERATION SELECTED");
	    break;
	}
	
    }
}
