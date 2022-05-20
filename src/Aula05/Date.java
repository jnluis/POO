package Aula05;

public class Date {
    int day, month, year;

    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setDate(int dia, int mes, int ano){
        this.day = dia;
        this.month = mes;
        this.year = ano;
    }
        
    //     public Date(int day, int month, int year) {
    //     if (Isvalid(day, month, year)) {
    //         this.day = day;
    //         this.month = month;
    //         this.year = year;
    //     }

    //     else {
    //         System.out.println("Data Inválida!!!");
    //     }


    // } 

    public static boolean ValidMonth(int month){
        boolean valid = false;
        if ((month >=0) && (month <= 12))
            valid = true;
        return valid; 
    }

    public static int monthDays(int month,int year){
        int dias;
        switch (month) {
            case 1: 
            case 3:dias = 31; break;
            case 2: 
                if((year%4 == 0) && ((year%100 != 0) || (year%400 == 0))){
                    dias = 29;
                }else{dias = 28;
                }break;
            case 5:
            case 7:
            case 8:
            case 10:
            case 12: dias = 31; break;
            default: dias = 30;
        }
        return dias;
    }

    public static boolean leapYear(int year){
        boolean isLeap = false;
        if((year%4 == 0) && ((year%100 != 0) || (year%400 == 0))){
            isLeap = true;
        }
        return isLeap;
    }

    public static boolean Isvalid(int day, int month,int year){
         
        if (!ValidMonth(month)) {
            return false;
        }
        if (day <0 || day > monthDays(month, year)){
            System.out.println("Dia inválido");
            return false;
            }

    return true;  
    }

    public void set(int daySet, int monthSet,int yearSet){
        if (Isvalid(daySet,monthSet,yearSet)){
            day = daySet; 
            month = monthSet;
            year= yearSet;
        }  else{
            System.out.println("Data inválida");
        }
    }

    public int getDay(){return day;}
    public int getMonth(){return month;}
    public int getYear(){return year;}
    public void incrementDate (){
        if (day < monthDays(month, year))
            day +=1;
        else if (month<12) {
            day = 1;
            month +=1;
        }
        else if (month==12){
            day =1;
            month=1;
            year+=1;
        }
    }

    public void decrementDate (){
        day -= 1;
        if (day == 0 ) {
            month -= 1;
            if (!ValidMonth(month)) {
                month = 12;
                year -= 1;
            }
        day = monthDays(month, year);
        }
    }

   @Override public String toString(){
        return String.format("%04d-%02d-%02d",getYear(),getMonth(),getDay()); 
    }
}   