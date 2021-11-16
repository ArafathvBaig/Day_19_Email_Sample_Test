package com.Day_19_Sample_Email;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
 
@RunWith(JUnitParamsRunner.class)
@Category(SampleEmails.class)

public class SampleEmailsTest 
{
	@Test
	@Parameters({
		 "abc@yahoo.com",
         "abc-100@yahoo.com",
         "abc.100@yahoo.com",
         "abc111@abc.com",
         "abc-100@abc.net",
         "abc.100@abc.com.au",
         "abc@1.com",
         "abc@gmail.com.com",
         "abc+100@gmail.com"
	})
    public void checkValidEmail(String email)
	{
        boolean check = SampleEmails.checkEmails(email);
        Assert.assertEquals(true, check);
    }
	@Test
	@Parameters({
		 "abc",
        "abc@.com.my",
        "abc123@gmail.a",
        "abc123@.com",
        "abc123@.com.com",
        ".abc@abc.com",
        "abc()*@gmail.com",
        "abc@%*.com",
        "abc..2002@gmail.com",
        "abc.@gmail.com",
        "abc@abc@gmail.com",
        "abc@gmail.com.1a",
        "abc@gmail.com.aa.au"	    	 
        })
	public void checkInValidEmail(String email)
	{
        boolean check = SampleEmails.checkEmails(email);
        Assert.assertEquals(false, check);
    }
}


