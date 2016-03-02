public class LuckySevens
{
    public static void main(String [] args)
    {
        System.out.print("Please input the lower end of the range: ");
        int lowerEnd = IO.readInt();
        System.out.println(" ");
        
        System.out.print("Please input the higher end of the range: ");
        int higherEnd = IO.readInt();
        System.out.println(" ");
        
        if (higherEnd < lowerEnd)
        {
            IO.reportBadInput();
            return;
        }
        
        int counter = 0;
        String container = "";
        int stringLength = 0;

        for (int i = lowerEnd; i <= higherEnd; i++)
        {
            container = Integer.toString(i);
            stringLength = container.length();
            for (int j = 0; j < stringLength; j++)
            {
                if ((container.charAt(j)) == '7')
                {
                    counter = counter + 1;
                    //System.out.println(i);
                }
            }
            
            if (i == higherEnd)
            {
                IO.outputIntAnswer(counter);
            }
        }
    }
}
