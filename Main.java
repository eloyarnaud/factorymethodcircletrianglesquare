package dataadapter;

public class Main {

	String myDate = "20121206";

	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
	cal.setTime(sdf.parse(myDate));
}
