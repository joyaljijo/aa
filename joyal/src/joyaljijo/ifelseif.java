package joyaljijo;
import java.util.*;

public class ifelseif {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter any city from the list");
		//System.out.println("india,america,germany,dubai");
	    String a=sc.nextLine();
		//String a="india";
	    if(a=="india") {
	    	System.out.println("currency in india is 'rupees'");
	    }
	    else if(a=="america"){
	    	System.out.println("currency in america is 'dollar'");

	    }
	    else if(a=="germany"){
	    	System.out.println("currency in germany is 'euro'");

	    }
	    else if(a=="dubai"){
	    	System.out.println("currency in dubai is 'dirham'");

	    }
	    else {
	    	System.out.println("please enter the country from the list");
	    }
	}

}
