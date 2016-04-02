public class WordCount{
    public static void main(String [] args){
	System.out.print("Enter sentence: ");
	String original = IO.readString();
	System.out.print("Enter min word length: ");
	int minLength = IO.readInt();
        IO.outputIntAnswer(countWords(original, minLength));
    }
    public static int countWords(String original, int minLength){
	if(countLetters(original)>=minLength)
	    return 1;
	else
	    return 0;
    }
    public static int countLetters(String original){
	original = original.replace("&","");
	System.out.println(original);
	return original.length();
    }
}
