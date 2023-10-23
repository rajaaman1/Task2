
public class Panagram 
{
	static int size=26;
    static boolean isLetter(char ch)
    {
    	if(!Character.isLetter(ch))
    	{
    		return false;
    	}
    	return true;
     }
     static boolean containsAllLetter(String str, int len)
     {
    	 str=str.toLowerCase();
    	 boolean[] b=new boolean[size];
    	 for(int i=0; i<len; i++)
    	 {
    		 if(isLetter(str.charAt(i)))
    		 {
    			int letter=str.charAt(i)-'a';
    			b[letter]=true;
    	     }
    	 }
    	for(int i=0; i<size; i++)
 		{
 			if(!b[i])
 			{
 				return false;
 			}
 		}
 		return true;
 		
    	 
     }

	public static void main(String[] args) 
	{
		String str="The quick brown fox jumps upon right over the lazy dog";
		int len=str.length();
		System.out.println(len);
		if(containsAllLetter(str,len))
		{
			System.out.println("Panagram");
		}
		else
		{
			System.out.println("Not a Panagram String");
		}

	}

}
