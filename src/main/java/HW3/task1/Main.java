package HW3.task1;

public class Main {
    public static void main(String[] args) {
        Date date1 = new Date(1, 1, 2011);
        Date date2 = new Date(31, 12, 2010);
        System.out.println(date1.compareTo(date2));
    }
}
