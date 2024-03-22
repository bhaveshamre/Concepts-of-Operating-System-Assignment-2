package in.acts.cdac;
import java.lang.*;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class Time {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Date (dd/mm/yyyy) :");
		String date = sc.nextLine();
		System.out.println("Enter Time (hh/mm/ss) :");
		String time = sc.nextLine();
		
		String dateinput = date;
		String timeinput = time;
		String date_time_ip = date+" "+time;
		SimpleDateFormat dateformat = new SimpleDateFormat("dd/mm/yyyy");
		
		Date a = dateformat.parse(dateinput);
		Date b = dateformat.parse(timeinput);
		Date c = dateformat.parse(date_time_ip);
		
		    SimpleDateFormat outputFormat1 = new SimpleDateFormat("dd/mm/yyyy");
	        SimpleDateFormat outputFormat2 = new SimpleDateFormat("mm/dd/yyyy");
	        SimpleDateFormat outputFormat3 = new SimpleDateFormat("yyyy/mm/dd");
	        SimpleDateFormat outputFormat4 = new SimpleDateFormat("hh:mm:ss");
	        SimpleDateFormat outputFormat5 = new SimpleDateFormat("hh:mm:ss a");
	        SimpleDateFormat outputFormat6 = new SimpleDateFormat("hh:mm");
	       

	        System.out.println("a. " + outputFormat1.format(a));
	        System.out.println("b. " + outputFormat2.format(a));
	        System.out.println("c. " + outputFormat3.format(a));
	        System.out.println("d. " + outputFormat4.format(b));
	        System.out.println("e. " + outputFormat5.format(b));
	        System.out.println("f. " + outputFormat6.format(b));
	        System.out.println("g. " + outputFormat1.format(a)+""+outputFormat4.format(b));
	        System.out.println("h. " + outputFormat2.format(a)+""+outputFormat5.format(b));
	        System.out.println("i. " + outputFormat3.format(a)+""+outputFormat6.format(b));
	
	
	
	}

}
