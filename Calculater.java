import java.lang.Math; 
public class Calculater 
{
    

public static double po(int i, int j) 
{
 return Math.pow(i, j);      
}


public static double powerdouble(double o, int m)
{
 return Math.pow(o, m);   
}


 public static void main(String args[])
 {  
    double  b=	Calculater.po(2, 3);
   double a= Calculater.powerdouble(4.0, 2);
   System.out.println(b);
    System.out.println(a);
   }  


}