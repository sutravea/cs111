public class PayFriend{
    
    public static void main(String[] args){
	
	double pay, fees;
	pay = IO.readDouble();
	fees = 0;
	
	if(pay<=100){
	    fees += 5;
	}
	else{
	    if(pay<1000){
		if(pay*0.03>=6)
		    fees += pay*0.03;
		else
		    fees += 6;
	    }
	    else{
		if(pay<10000){
		    if(pay*0.01>=15)
			fees += pay*0.01;
		    else
			fees += 15;
		}
		else{
		    fees += 100;
		    if(pay<=15000)
			fees += (pay-10000)*0.02;
		    else{
			fees += 100;
			fees += (pay-15000)*0.03;
		    }
		}
	    }
	}

	IO.outputDoubleAnswer(fees);
    }
}
