package HW4.models;


import java.util.Calendar;
import java.util.GregorianCalendar;

public class Congrats {
    private Calendar calendar;

    public Congrats() {
        calendar = new GregorianCalendar(2024, Calendar.FEBRUARY, 23);
    }

    public void congratulation(Gender gender) {
        if (calendar.get(Calendar.DATE) == 23 && calendar.get(Calendar.MONTH) == 1 && gender.equals(Gender.MALE))
            System.out.println(Holidays.MANS_DAY.getCongratulation());
        else if(calendar.get(Calendar.DATE) == 8 && calendar.get(Calendar.MONTH) == 2 && gender.equals(Gender.FEMALE))
            System.out.println(Holidays.WOMANS_DAY.getCongratulation());
        else if (calendar.get(Calendar.DATE) == 1 && calendar.get(Calendar.MONTH) == 0)
            System.out.println(Holidays.NEW_YEAR.getCongratulation());
        else
            System.out.println(Holidays.TYPICAL_DAY.getCongratulation());
    }
}
