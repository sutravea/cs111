public class Methods{

    public static int gcf(int num1, int num2){
	while(num1!=num2){
	    if(num1>num2)
		num1 -= num2;
	    else
		num2 -= num1;
	}
	return num1;
    }
    
    public static void main(String[] args){
	int num1 = IO.readInt();
	int num2 = IO.readInt();
	System.out.println(gcf(num1,num2));
    }
}
