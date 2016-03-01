public class SimplifyFraction{
    public static void main(String [] args){
	int numerator = IO.readInt();
	int denominator = IO.readInt();
	int gcf = Methods.gcf(numerator,denominator);
	System.out.println(numerator/gcf+"/"+denominator/gcf);
    }
}
