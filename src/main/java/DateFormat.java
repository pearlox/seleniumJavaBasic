import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateFormat {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);

        //dd/MM/yyyy
//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yyyy HH:mm:ss");
        String convertedDateString = simpleDateFormat.format(date);
        System.out.println(convertedDateString);

        String strDate = "12/01/2000";
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy");
        Date convertedDate = simpleDateFormat1.parse(strDate);
        System.out.println(convertedDate);

        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println(calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println(calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        calendar.set(Calendar.MONTH,Calendar.SEPTEMBER);


        calendar.add(Calendar.DATE,-10);
//        System.out.println(calendar);

        Calendar userCalendar = Calendar.getInstance();
        userCalendar.setTime(convertedDate);
//        System.out.println(userCalendar);


        System.out.println("Time in milli seconds : "+userCalendar.getTimeInMillis());

        Date convertedDateFromCalender = new Date();
        convertedDateFromCalender.setTime(userCalendar.getTimeInMillis());
        System.out.println(convertedDateFromCalender);

        Date date1 = new Date(Long.parseLong("947615400000"));
        Date date2 = new Date(Long.parseLong("947894400000"));

        System.out.println(date1);
        System.out.println(date2);

        System.out.println(date1.after(date2));
        System.out.println(date1.before(date2));

        System.out.println(date.compareTo(date2));
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getHours());
        System.out.println(date.getMinutes());
        System.out.println(date.getMonth());
        System.out.println(date.getYear());
    }
}
