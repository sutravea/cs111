public class VoterVerify{
    public static void main(String[]args){
	IO.outputStringAnswer("What is your name?");
	String name = IO.readString();
	IO.outputStringAnswer("What is your age, "+name+"?");
	int age = IO.readInt();
	if(age<0){
	    IO.outputStringAnswer("Invalid age");
	else if(age>=18)
	    IO.outputStringAnswer("You can vote "+name+"!");
	else
	    IO.outputStringAnswer("You cannot vote "+name+".");
    }
}
	
