public class LinearEquation
{
	public double a, b, c; 
		
	public LinearEquation(double a, double b, double c)
	{
		this.a = a; 
		this.b = b; 
		this.c = c; 
	}
	
	public LinearEquation(LinearEquation other)
	{
		a = other.a; 
		b = other.b; 
		c = other.c; 
	} 
		
	public LinearEquation(double slope, Coords point)
	{
		a = -slope; 
		b = 1; 
		c = (slope*point.getX() - point.getY()); 
	}
	
	public LinearEquation parallelLine(Coords point)
	{
		if (this.isVertical())
			return new LinearEquation(1, 0, -point.getX());
			
		return new LinearEquation(this.slope(), point); 
	}
	
	public LinearEquation perpendicularLine(Coords point)
	{
		if (this.isHorizontal())
			return new LinearEquation(1, 0, -point.getX());
			
		return new LinearEquation(this.slopeOfPerpendicularLine(), point);
	}
	
	public double shortestDistanceFrom(Coords point)
	{
		return point.distanceFrom(pointOfIntersection(perpendicularLine(point)));
	}
	
	//accessor	
	public double getA()
	{
		return this.a; 
	}
	
	public double getB()
	{
		return this.b;
	}
	
	public double getC()
	{
		return this.c; 
	}
	
	public String toString()
	{
		return a + "x + " + b + "y + " + c + " = 0"; 
	}
	
	public boolean slopeDefined()
	{
		return b != 0; 
	}
	
	public boolean hasYIntercept()
	{
		return slopeDefined(); 
	}
	
	public boolean hasXIntercept()
	{
		return !isHorizontal(); 
	}
	
	public double slope()
	{
		return -a/b; 
	}
	
	public boolean isHorizontal()
	{
		return a == 0; 
	}
	
	public boolean isVertical()
	{
		return b == 0; 
	}
	
	public double yIntercept()
	{
		return -c/b; 
	}
	
	public double xIntercept()
	{ 
		return -c/a; 
	}
	
	public boolean isIncreasing()
	{
		return slope() > 0; 
	}
	
	public boolean isDecreasing()
	{
		return slope() < 0; 
	}
	
	public boolean isAFunction()
	{
		return !isVertical(); 
	}
	
	public boolean isValidLinearEquation()
	{
		return a != 0 || b !=0;
	}
	
	public boolean isDirectVariable()
	{
		return c == 0; 
	}
	
	public double slopeOfPerpendicularLine()
	{
		if (isVertical())
			return 0; 
		return -1 * (1/ slope());
	}
	
	public boolean equals(LinearEquation other)
	{
		if (this.isVertical() && other.isVertical())
			return this.xIntercept() == other.xIntercept(); 
		
		return this.slope() == other.slope() && this.yIntercept() == other.yIntercept(); 
	}
	
	 public boolean isParallel(LinearEquation other)
	 {
	 	if (this.isVertical() && other.isVertical())
	 		return this.xIntercept() != other.xIntercept(); 
	 			
	 	if (this.equals(other))
	 		return false; 
	 			
	 	return this.slope() == other.slope(); 
	 }
	 
	 public Coords pointOfIntersection(LinearEquation other)
	 {
	 	if (this.equals(other) || this.isParallel(other))
	 		return null; 
	 	
	 	double d = other.a; 
	 	double e = other.b;
	 	double f = other.c; 
	 		
	 	double x = (b * f - c * e) / (a * e - b * d); 
	 	double y;
	 	if (this.isVertical())
	 		y = (-d * x - f) / e; 
	 	else  
	 		y = (-a * x - c) / b; 
	 	return new Coords(x, y); 
	 }
} 
