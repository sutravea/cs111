/*
 *Females(gender == 1):
 *Alice likes numbers greater than 8 (number>8)
 *Samantha likes positive numbers less than or equal to 8 [assume 0 is positive] (number <= 8 && number >=0)
 *Cathy likes negative numbers (number<0)
 *Males(gender == 0):
 *Bob likes even numbers (number%2==0)
 *Sam likes numbers divisible by 3, but not even numbers (!(number%2==0) && number%3==0)
 *Richard doesn't have a favorite number(true)
 *Assume no gender preferences
 */

	

public class NumberMatch{
    public static void main(String [] args){
	System.out.println("What gender are you looking for? [0 is male, 1 is female]");
	int gender = IO.readInt();
	while(gender != 0 && gender != 1){
	    System.out.println("invalid gender entered");
	    gender = IO.readInt();
	}
	System.out.println("What is your favorite number?");
	int number = IO.readInt();

	if(gender == 0){ //males
	    if(number%2==0)
		System.out.println("Your soulmate is Bob");
	    else if(number%3==0) //evens already filtered out, so number%2!=0 is unnecessary
		System.out.println("Your soulmate is Sam");
	    else
		System.out.println("Your soulmate is Richard");
	}
	    
	else{ //females
	    if(number>8)
		System.out.println("Your soulmate is Alice");
	    else if(number>=0) //greater than 8 already filtered
		System.out.println("Your soulmate is Samantha");
	    else //positives already filtered
		System.out.println("Your soulmate is Cathy");
	}
    }
}
