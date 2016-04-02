public class WordCount{
    public static void main(String [] args){
	System.out.print("enter sentence: ");
	String original = IO.readString();
	System.out.print("enter minlength: ");
	int minLength = IO.readInt();
	System.out.println("words in sentence at least minlength long: "+countWords(original,minLength));
    }
    public static int countWords(String original, int minLength){
	return 1;
    }
}
