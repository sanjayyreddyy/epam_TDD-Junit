package com.epam.EpamTask;

public class DeleteOccurances {

	public String removeElement(String string) {
		// TODO Auto-generated method stub
		String result=string;
		int StringLength = string.length();
		if(StringLength>=2)
		{
			char firstChar = string.charAt(0);
			char secondChar = string.charAt(1);	
			String remaining = string.substring(2,StringLength);
			if(firstChar=='A' && secondChar=='A' )	
				result = "" + remaining;
			else if(firstChar=='A')
				result ="" + secondChar + remaining;
			else if(secondChar=='A')
				result ="" + firstChar + remaining;
			else
			result = "" + firstChar + secondChar + remaining ;
		}
		if(StringLength==1 && string.equals("A"))
		{
			result="";
		}
		return result;
	}

}
