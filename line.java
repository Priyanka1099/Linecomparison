
public class line {
	public static void main(String arg[])	
	{
        int x1,x2,y1,y2;
	    double length;
	    x1=5;y1=2;x2=4;y2=4;
	    length = Math.sqrt((x2 - x1) ^ 2 + (y2- y1) ^ 2);	 	    
        System.out.println("length of lines"+"("+x1+","+y1+"),"+"("+x2+","+y2+")===>"+length);
         
        
        if (((x1 / y1)) == ((x2 / y2))) {
        	System.out.println("lines are euqal");
        }
        else {
        	System.out.println("lines are not euqal");
        	
        }
    }
	}



