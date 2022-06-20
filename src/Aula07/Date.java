package Aula07;

public abstract class Date implements Comparable <Date> {
    
    public abstract Boolean ValidMonth(int m);
    public abstract int monthDays(int month,int year);
    public abstract Boolean leapYear(int a);
    public abstract Boolean Isvalid(int day, int month, int year);
    public abstract void incrementDate();
    public abstract void decrementDate();
}
