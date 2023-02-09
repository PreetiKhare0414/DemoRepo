package javaArrayList;

import java.time.LocalDateTime;


public class DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime myObj = LocalDateTime.now();
		System.out.println(myObj);
		java.time.format.DateTimeFormatter myFormat =DateTimeFormatter.ofPattern("dd:mm:yy; hh:mm:ss");
		String DateTime=myObj.format(myFormat);
		System.out.println(DateTime);
		
		
	}
}
		
		