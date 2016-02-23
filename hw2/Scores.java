import java.util.*;

public class Scores{
    public static void main(String [] args){
	
	int judgeCount = IO.readInt();
	
	while(judgeCount%1 != 0 || judgeCount < 0 ){
	    System.out.println("User entered bad input.");
	    judgeCount = IO.readInt();
	}
	
	double[] scoreArray = new double[judgeCount];
	
	int lowScoreIndex = 0;
	int highScoreIndex = 0;
	
	for(int index = 0; index < judgeCount; index++){
	    
	    scoreArray[index] = IO.readDouble();

	    if(scoreArray[index] < scoreArray[lowScoreIndex])
		lowScoreIndex = index;
	    if(scoreArray[index] > scoreArray[highScoreIndex])
		highScoreIndex = index;
	    
	    while(scoreArray[index] < 0 || scoreArray[index] > 10){
		System.out.println("User entered bad input.");
		scoreArray[index] = IO.readDouble();
	    }
	}

	scoreArray[lowScoreIndex] = 0;
	scoreArray[highScoreIndex] = 0;

	double rawScoreTotal = 0;
	
	for(int index = 0; index < scoreArray.length; index++){
	    rawScoreTotal += scoreArray[index];
	}

	double avgScore = rawScoreTotal/(scoreArray.length-2);

	IO.outputDoubleAnswer(avgScore);
    }
}
