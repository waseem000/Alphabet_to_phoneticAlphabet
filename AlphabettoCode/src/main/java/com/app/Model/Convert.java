package com.app.Model;

import java.util.ArrayList;
import java.util.Arrays;

public class Convert {

	
	private String sentence ;
	private String convertedSetntance;
	private ArrayList<String> phoneticAlphabetsentence = new ArrayList<String>();
	private ArrayList<String> phoneticAlphabet= new ArrayList<String>(
		Arrays.asList("Alpha","Bravo","Charlie","Delta","Echo","Foxtrot","Golf","Hotel","India","Juliet","Kilo","Lima","Mike","November","Oscar","Papa","Quebec","Romeo","Sierra","Tango","Uniform","Victor","Whiskey","X-ray","Yankee","Zulu"));
	
	public String getConverted_setntance() {
		return convertedSetntance;
	}

	public void setConverted_setntance(String convSetntance) {
		convertedSetntance = convSetntance;
	}

	public String getsentence () {
		return sentence ;
	}

	public void setsentence (String sentence ) {
		this.sentence  = sentence ;
	}
	
	public void convertsentence ()
	{
		String sen= getsentence ();
		sen= sen.toUpperCase();
		boolean foundphonetic=false;
		char[] charArray=sen.toCharArray();
		char[] convertedCharArray;
		for(int i=0; i<charArray.length;i++)
		{
			for (int j = 0; j < phoneticAlphabet.size(); j++) 
			{
				if(charArray[i]==  phoneticAlphabet.get(j).charAt(0))
				{
					foundphonetic=true;
					phoneticAlphabetsentence .add(phoneticAlphabet.get(j));
					break;
				}
			/*	if(foundphonetic)
				{
					foundphonetic=false;
					continue;
				}*/
			}		
			
		}
		
		for (int i = 0; i < phoneticAlphabetsentence .size(); i++) {
			
			if(i==0)
			{
				convertedSetntance =phoneticAlphabetsentence .get(i);
			}
			else 
			{
				convertedSetntance +=phoneticAlphabetsentence .get(i);
			}
			
			convertedSetntance=convertedSetntance+"  ";
			
		}
		System.out.println("From internal JAVA Class : converted sentence is ===="+convertedSetntance);
	}
	
}
