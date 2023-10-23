
public class Romanconversion 
{
	int NumValue(char roman)
	{
		if(roman=='I')
		{
			return 1;
		}
		if(roman=='V')
		{
			return 5;
		}
		if(roman=='X')
		{
			return 10;
		}
		if(roman=='L')
		{
			return 50;
		}
		if(roman=='C')
		{
			return 100;
		}
		if(roman=='D')
		{
			return 500;
		}
		if(roman=='M')
		{
			return 1000;
		}
		return -1;
	}
	
	int romanToInt(String str)
	{
		int sum=0;
		for(int i=0; i<str.length(); i++)
		{
			int s1=NumValue(str.charAt(i));
			if(i+1<str.length())
			{
				int s2=NumValue(str.charAt(i+1));
				if(s1>=s2)
				{
					sum=sum+s1;
				}
				else
				{
					sum=sum-s1;
				}
			}
			else
			{
				sum=sum+s1;
			}
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Romanconversion rc=new Romanconversion();
		String  inputRoman="XLXV";
		System.out.println(rc.romanToInt(inputRoman));
		
	}
}