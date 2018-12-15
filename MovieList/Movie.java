public class Movie
{
	private String movieName;
	private String genre;
	private int year;
	private double rating;
	
	public Movie(String mName, String genre, int year, double rating)
	{
		movieName = mName; 
		this.genre = genre; 
		this.year = year; 
		this.rating = rating; 
	}
	
	public int compareTo(Movie other)
	{
		int nameCompare = 
			this.movieName.compareTo(other.movieName);
			
		return nameCompare;
	}
	
		public int genreRatingCompareTo(Movie other)
	{
		int genreCompare = this.genre.compareTo(other.genre);
		if(genreCompare != 0)
			return genreCompare;
			
		if (this.getRating() > other.getRating())
			return -1;
			
		if (this.getRating() < other.getRating())
			return 1;
		
		return 0;
	}
	
	public String toString()
	{
		return movieName + ", " + genre + 
			", " + year + ", " + rating;
	}
	
	public String getGenre()
	{
		return genre;
	}
	
	public double getRating()
	{
		return rating;
	}
}