public class Box 
{

   int width;  
   int height ;
   double depth;
  
   Box(int width, int height,double depth )
   {  
       this.width = width;  
       this.height = height;  
       this.depth=depth;
   }  
   void volume(){
        double v = width*height*depth;
        System.out.println("volue of the box is :"+v);
   }  
	   
   public static void main(String args[]){  
	Box b= new Box(10,20,20);
	b.volume();
   }  
}