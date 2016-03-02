/*Write your code in the file TwoSmallest.java. Write your test cases in assign2-testcases.txt.
 *
 *We wish to write a program that takes a set of numbers and determines which are the two smallest.
 *
 *Ask the user for the following information, in this order:
 *
 *A terminating value (real number). The user will enter this value again later, to indicate that he or she is finished providing input.
 *A sequence of real numbers. Keep asking for numbers until the terminating value is entered.
 *Compute and output the smallest and second-smallest real number, in that order. It is possible for the smallest and second-smallest numbers to be the same (if the sequence contains duplicate numbers).
 *
 *Example:
 *
 *java TwoSmallest
 *
 *123 [this is the terminating value, not part of the set of numbers]
 *17
 *23.5
 *10
 *15.2
 *30
 *8
 *16
 *123 [this is the terminating value again, indicating that the user is done]
 *
 *RESULT: 8.0
 *RESULT: 10.0
 *In ALL cases of error on input, RE-ASK the user for the input until it is correctly entered.
 */

public class TwoSmallest{
    public static void main(String [] args){

	int counter = 0; //valid input counter
	
	//first input
	double term = IO.readDouble();
	counter++; //valid input

	//second input
	
	double input = IO.readDouble();
	double s1, s2;
	if(input!=term){
	    s1 = input;
	    s2 = input;
	    counter++; //valid input
	}
	else{ //second input error case
	    do{
		IO.reportBadInput();
		input = IO.readDouble();
		}
	    while(input==term);
	    s1 = input;
	    s2 = input;
	    counter++; //valid input
	}

	//third input
	input = IO.readDouble();
	
	if(input==term){//third input error case
	    do{
		IO.reportBadInput();
		input = IO.readDouble();
	    }
	    while(input==term);
	    counter++; //valid input
	}
	else
	    counter++; //valid input

	if(input < s1){
	    double temp = s1;
	    s1 = input;
	    s2 = temp;
	}
	else
		s2 = input;

	//generic input loop begins
	
	if(counter == 3){
	    input = IO.readDouble();
	    while(input != term){
		if(input < s1){
		    double temp = s1;
		    s1 = input;
		    s2 = temp;
		}
		else{
		    if(input < s2)
			s2 = input;
		}
		input = IO.readDouble();
	    }
	}

	else
	    System.out.println("FATAL ERROR");

	IO.outputDoubleAnswer(s1);
	IO.outputDoubleAnswer(s2);
	
    }
}


/*
	while(input != term){
	    if(input<0)
		IO.reportBadInput();
	    else{
		if(input<s1){
		    s2 = s1;
		    s1 = input;
		}
		if(input<s2)
		    s2 = input;
	    }
	    input = IO.readDouble();
	}
*/
