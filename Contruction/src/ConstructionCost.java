import java.util .*;
public class ConstructionCost {	
	
	public static void CostEstimation ()
	{
	    double area,cost;
	    int s;
	    Scanner sc=new Scanner (System.in);
	    System.out.println("Enter the area of house :");
	    area=sc.nextDouble();
	    System. out. println("Enter the material standard:");
	    System. out. println("1.Standard");
	    System. out. println("2.Above Standard");
	    System. out. println("3.High Standard");
	    System. out. println("4.High Standard Fully Automated Home : ");
	    s=sc.nextInt();
	    switch(s)
	        {
	            case 1:
	            	 cost=area*1200;
	            	 System.out.println("Cost for standard Material : "+cost);
	                break;
	            case 2:
	            	cost=1500*area;
	            	System.out.println("Cost for Above Standard Material : "+cost);
	                break;
	            case 3:
	            	cost=1800*area;
	            	System.out.println("Cost for High Standard Material : "+cost);
	                break;
	            case 4:
	            	cost=2500*area;
	            	System.out.println("Cost for High Standard Fully Automated Home Material : "+cost);
	                break;
	            default:
	                System.out.printf("Enter the Correct Choice:");
	                return;
	        }
	    
	   }
	}


