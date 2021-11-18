package routines;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Convert_Fechas {

	public static Date dateFromDays(Integer numDays) {
		Calendar cal = Calendar.getInstance();
		cal.set(2020, 0, 01, 0, 0, 0);
		cal.add(Calendar.DATE,  numDays-1);
		return cal.getTime();
	}
	
	public synchronized static Integer formatDateNum(String pattern, Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		StringBuilder sb = new StringBuilder(sdf.format(date));
		return Integer.parseInt(sb.toString());
	}
}