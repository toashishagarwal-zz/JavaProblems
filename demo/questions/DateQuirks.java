package demo.questions;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateQuirks {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Calendar d = Calendar.getInstance();
        d.add(d.MONTH, -3);
        System.out.println(d.getTime());
       
        
        System.out.println(new SimpleDateFormat("yy/mm/dd").format(d.getTime()));
        
        
        Date date = Calendar.getInstance().getTime();
        DateFormat formatter = new SimpleDateFormat("yy/MM/dd");
        String today = formatter.format(date);
        System.out.println("Today : " + today);
    }

}
