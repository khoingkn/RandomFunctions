import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class JavaTrials {
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, 1);
		Date result = cal.getTime();
		System.out.println(result.toString());
		
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		String theDay = formatter.format(result);
		System.out.println(theDay);
	}

}
