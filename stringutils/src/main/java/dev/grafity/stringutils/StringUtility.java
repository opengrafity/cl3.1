package dev.grafity.stringutils;
public class StringUtility{
	public String extractFirst(String text, int howmany){
		return text.substring(0,howmany)+"...";
	} 
}