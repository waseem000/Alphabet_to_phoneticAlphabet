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

	public void setConverted_setntance(String convertedSetntance) {
		convertedSetntance = convertedSetntance;
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
		
		char[] charArray=sen.toCharArray();
		char[] convertedCharArray;
		for(int i=0; i<charArray.length;i++)
		{
			for (int j = 0; j < phoneticAlphabet.size(); j++) 
			{
				if(charArray[i]==  phoneticAlphabet.get(j).charAt(1))
				{
					phoneticAlphabetsentence .add(phoneticAlphabet.get(j));
				}	
			}		
			
		}
		
		for (int i = 0; i < phoneticAlphabetsentence .size(); i++) {
			
			convertedSetntance +=phoneticAlphabetsentence .get(i);
			
		}
	}
	
}
