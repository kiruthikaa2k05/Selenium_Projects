package com.orangehrm.seleniumiuframwork.generic_utility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.UUID;


public class JavaUtility {
	//Generate Random Number
	public int getRandomNumber(int range) {
		 Random random = new Random();
		 int randomNumberInRange=random.nextInt(range);
		 return randomNumberInRange;
	}
	
	//Generate Current date
	public String getCurrentDate(String dateFormat) {
		Date date = new Date();
	     SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
		return sdf.format(date);
	}
	
	//Counting days
	public String getRequiredDate(int days) {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		sdf.format(date);
		Calendar cal = sdf.getCalendar();
		cal.add(Calendar.DAY_OF_MONTH,days);
		String requiredDate=sdf.format(cal.getTime());
		return requiredDate;
	}
	
	//Generating Random Value(AlphaNumeric)
	public String getRandomValue() {
		UUID randomDate = UUID.randomUUID();
		String value=randomDate.toString().replaceAll("[^a-zA-Z]","");
		return value;
	}

}
