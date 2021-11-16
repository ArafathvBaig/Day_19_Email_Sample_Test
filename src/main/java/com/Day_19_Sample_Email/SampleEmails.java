package com.Day_19_Sample_Email;

import java.util.regex.Pattern;

public class SampleEmails
{
	public static boolean checkEmails(String email) 
	{  
		boolean check = Pattern.matches("(([a-z A-Z]{3,})([-$&+,:;=?#|'<>.^*()%!]?[0-9 a-z A-Z]{3,})?+@([0-9 a-z]{1,})([.])([a-z]{2,3})([.]?[a-z]{2,3})?)", email);
        Boolean temp = check;
        return temp;
    }
}
