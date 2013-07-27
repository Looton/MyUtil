import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * @FileName CheckWeek6.java
 * @Description 检查某一天是否是星期六
 * @author looton@163.com
 * @Date 2013-7-27
 */

public class CheckWeek6 {
	public boolean checkWeek6(String str) throws ParseException {
		boolean flag = false;
		int week6 = 0;
		DateFormat df = new SimpleDateFormat("yyyy/MM/dd", Locale.CHINA);
		Date date = df.parse(str);
		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		week6 = calendar.get(Calendar.DAY_OF_WEEK);

		if (week6 == 7) {
			flag = true;
		}
		return flag;
	}

	public static void main(String[] args) throws ParseException {
		CheckWeek6 cw = new CheckWeek6();
		boolean result = cw.checkWeek6("2013/07/20");
		if (result) {
			System.out.println("今天是星期六");
		}
		else {
			System.out.println("今天不是星期六");
		}
	}
}
