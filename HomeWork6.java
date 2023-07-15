public class HomeWork6 {

    public enum Months {JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER}

    public static void main(String[] args){
        Months month = Months.NOVEMBER;
        int days = daysInMonth(month);
        System.out.println("In " + month.name() + " there are " + days + " days");
    }
    public static int daysInMonth(Months month){
        return switch (month) {
            case JANUARY, MARCH, MAY, JULY, AUGUST, OCTOBER, DECEMBER -> 31;
            case APRIL, JUNE, SEPTEMBER, NOVEMBER -> 30;
            case FEBRUARY -> 28;
        };
    }
}
