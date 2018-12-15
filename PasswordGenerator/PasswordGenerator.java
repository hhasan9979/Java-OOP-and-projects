public class PasswordGenerator
{
	private char[] options; 
		
		public PasswordGenerator()
		{
			options = new char [68]; 
				int i = 0; 
				char ch = 'A'; 
				for (; ch <= 'Z'; i++, ch++)
				{
					options[i] = ch; 
				}		
				for (ch = 'a'; ch <= 'z'; i++, ch++)
				{
					options[i] = ch; 
				}
				for (ch = '0'; ch <= '9'; i++, ch++)
				{
					options[i] = ch; 
				}
				
				options[i] = '_';
				i++;  
				options[i] = '-';
				i++; 
				options[i] = '$';
				i++; 
				options[i] = '%';
				i++; 
				options[i] = '#';
				i++; 
				options[i] = '@';
				i++; 
		}
		
		public int getAlpha()
		{
			return options[(int)Math.random()*((25-0 +1) +0)]; 
		}
		
		public int getAlphaNumeric()
		{
			return options[(int)Math.random()*((61-0 +1) +0)]; 
		}
		
		public int getSpecialChar()
		{
			return options[(int)Math.random()*((67-62 +1) +62)]; 
		}
		
		public boolean Validate(char[] cHar)
		{
			
		}

		
		public static void main(String args)
		{
			boolean valid = false; 
			char[] cpassword = new char[plength]; 
			while(!valid)
			{
				cpassword[0] = getAlpha(); 
				for(int i = 1; i < cpassword.length; i++)
					cpassword[i] = getAlphaNumeric();
					int pos = (int)Math.random()*(((cpassword.lenth-2)-1 +1) +1)];
				cpassword[pos] = getSpecialChar(); 
				valid = validate(cpassword); 
			}
			String password = ""; 
				for (int i = 0; i < cpassword; i++)
				{
					password +=cpassword[i]; 
				}
				return password; 
		}
		
		
		
		
}