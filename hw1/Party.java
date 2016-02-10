public class Party{
    
    public static void main(String[]args){
	int numPerson, slicesPerPerson, cansPerPerson, slicesPerPie, cansPerCase;
	double costPerPie, costPerCase;
	numPerson = IO.readInt();
	slicesPerPerson = IO.readInt();
	cansPerPerson = IO.readInt();
	costPerPie = IO.readDouble();
	slicesPerPie = IO.readInt();
	costPerCase = IO.readDouble();
	cansPerCase = IO.readInt();

	int totalSlices, totalCans, totalPies, totalCases;
	double totalPrice;
	
	totalSlices = numPerson*slicesPerPerson;
	totalCans = numPerson*cansPerPerson;
	totalPies = totalSlices/slicesPerPie;
	if(totalSlices%slicesPerPie != 0)
	    totalPies++;
	totalCases = totalCans/cansPerCase;
	if(totalCans%cansPerCase != 0)
	    totalCases++;
	
	totalPrice = totalPies*costPerPie + totalCases*costPerCase;

	IO.outputDoubleAnswer(totalPrice);
    }
    
}
