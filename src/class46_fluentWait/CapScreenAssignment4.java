package class46_fluentWait;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CapScreenAssignment4 {

	public static void main(String[] args) {
		
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat mydate= new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		String finalDate=mydate.format(date);
		System.out.println(finalDate);
	}
	
}
