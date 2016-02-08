public class Sum{

    private static int queryInput(){
	System.out.print("Enter number: ");
	return IO.readInt();
    }

    private static int add(int n1,int n2){
	return (n1+n2);
    }

    private static void dispOutput(int output){
	IO.outputIntAnswer(output);
    }
    public static void main(String[]args){
	int num1,num2,ans;
	num1 = queryInput();
	num2 = queryInput();
	ans = add(num1,num2);
	dispOutput(ans);
    }
}
