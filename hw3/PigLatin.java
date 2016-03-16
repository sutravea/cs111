public class PigLatin{
    public static void main(String [] args){
	System.out.print("Enter word: ");
	String original = new String();
        original = IO.readString();
        System.out.println("Translation: "+translate(original));
    }
    
    public static String translate(String original){
	if(original.startsWith("a")||original.startsWith("e")||original.startsWith("i")||original.startsWith("o")||original.startsWith("u")||original.startsWith("A")||original.startsWith("E")||original.startsWith("I")||original.startsWith("O")||original.startsWith("U"))
	    return original+"way";
	else
	    return original.substring(1,original.length())+original.charAt(0)+"ay";
    }
}
