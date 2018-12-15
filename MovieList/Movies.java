import java.util.ArrayList;
import java.util.List;

public class Movies
{
	private ArrayList<Movie> movies;
	
	public Movies(ArrayList<Movie> theMovies)
	{
		movies = theMovies;
	}
	
	public void sortAlphabetically()
	{
		for (int j = 0; j < movies.size() - 1; j++)
		{
			int minIndex = j;
			for (int k = j + 1; k < movies.size(); k++)
			{
				if (movies.get(k).compareTo(
					movies.get(minIndex)) < 0)
				{
					minIndex = k;	
				}
			}
			swap (j, minIndex);
		}
	}
	
	private void swap(int a, int b)
	{
		Movie temp = movies.get(a);
		movies.set(a, movies.get(b));
		movies.set(b, temp);
	}
	
	public void sortByRating()
	{
		for (int j = 0; j < movies.size() - 1; j++)
		{
			int maxIndex = j;
			for (int k = j + 1; k < movies.size(); k++)
			{
				if (movies.get(k).getRating() >
						movies.get(maxIndex).getRating()) 
				{
					maxIndex = k;	
				}
			}
			swap (j, maxIndex);
		}
	}
	
	public void sortByGenreRating()
	{
		for (int j = 0; j < movies.size() - 1; j++)
		{
			int minIndex = j;
			for (int k = j + 1; k < movies.size(); k++)
			{
				if (movies.get(k).genreRatingCompareTo(
					movies.get(minIndex)) < 0) 
				{
					minIndex = k;	
				}
			}
			swap (j, minIndex);
		}
	}

	public ArrayList<Movie> getMoviesByGenre(
								String genre)
	{
		ArrayList<Movie> genreList = 
			new ArrayList<Movie>();
			
		for (Movie m : movies)
			if (m.getGenre().equals(genre))
				genreList.add(m);				
		return genreList;
		
		
		/*
		int count = 0;
	
		for (Movie s : movies)
			if (s.getBorough().equals(boro))
				count++;
				
		Movie[] boroList = new Movie[count];
		count = 0;
		for (Movie s : movies)
			if (s.getBorough().equals(boro))
			{
				boroList[count] = s;
				count++;
			}
				
		return boroList;
*/
	}
	
	public String toString()
	{
		String output = "";
		for (Movie m : movies)
			output += m.toString() + "\n";
		output += "\n";
		
		return output;	
		
	}
}