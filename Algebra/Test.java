public class Test
{
	public static void main(String[] args)
	{
		Coords point1 = new Coords(4, 4); 
		Coords point2 = new Coords(11); 
		Coords point3 = new Coords();
		Coords point4 = new Coords(point1);
		
		System.out.println(point1);
		System.out.println(point2);
		System.out.println(point3);
		System.out.println(point4);  
	
	//	System.out.println(point1.x); 
		System.out.println(point1.getX());
		System.out.println(point1.getY()); 	
			
		point4.setX(-7);
		System.out.println(point4);  //set X mutator
		
		point1.reflectOnXAxis();
		System.out.println(point1); // reflect x mutator
		
		point4.translate(1, 1); 
		System.out.println(point4); // translate point mutator 
		 
		point1.dilate(4); 
		System.out.println(point1); //dilation mutator 
		System.out.println(point1.distancefromOrigin());
		
		LinearEquation line1 = new LinearEquation(7, 4, 2);
		LinearEquation line1 = new LinearEquation(8, 5, -77);
	}
}