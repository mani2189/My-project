package Webrdiverexamples;

public class CommonPrefix 

{

	public static void main(String[] args)
	
	{
		String words []= {"flower","flowing","float"};
		
		String prefix = words[0];
		
		  for( int i =1; i<words.length;i++) 
		  {
	           while(words[i].indexOf(prefix)!=0)  
                {
	        	   prefix= prefix.substring(0, prefix.length()-1);
	        	   
	        	   if(prefix.length()==0)
	        	   {
	        		   System.out.println("Empty String");
	        	   }
	        	   
	        	   
                }
		  }
	           
	           if(!prefix.equals(" "))
	           {
	        	   System.out.println(prefix);
	           }
		  }
		
		 
				
				
	}
		
			
		  
		 
		

	

	

