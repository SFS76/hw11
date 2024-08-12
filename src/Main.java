//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void defineHighGradeYear(int year) {
        boolean year4 = year % 4 == 0;
        boolean year100 = year % 100 != 0;
        boolean year400 = year % 400 == 0;
        if (year >= 1584 && year100 && year4 || year >= 1584 && year400) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год НЕ является високосным");
        }
    }
    public static void main(String[] args) {
            int year = 2000;
            defineHighGradeYear(year);

    }
}