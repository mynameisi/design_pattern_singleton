package singleton;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer {

	public static String sj() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("hh:mm:ss:SSS");
		return formatter.format(currentTime);
	}

}
