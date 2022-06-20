package Aula07;

public class DateND extends Date {
    public int day, month, year;

    public DateND(int dia, int mes, int ano){
        this.day = dia;
        this.month = mes;
        this.year = ano;
    }

    public void setDate(int dia, int mes, int ano){
        this.day = dia;
        this.month = mes;
        this.year = ano;
    }
    public Boolean leapYear(int year){
        boolean isLeap = false;
        if((year%4 == 0) && ((year%100 != 0) || (year%400 == 0))){
            isLeap = true;
        }
        return isLeap;
    }


    public Boolean ValidMonth(int month){
        boolean valid = false;
        if ((month >=0) && (month <= 12))
            valid = true;
        return valid; 
    }

    public int monthDays(int month,int year){
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



    
    public Boolean Isvalid(int day, int month,int year){
         
        if (!ValidMonth(month)) {
            return false;
        }
        if (day <0 || day > monthDays(month, year)){
            System.out.println("Dia inválido");
            return false;
            }

    return true;  
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

    public int decrementDatee(int dia, int mes, int ano){
        int d = 0;

        while(dia != 1 || mes != 1 || ano != 2000){
            if(dia == 1){
                dia = this.monthDays(mes, ano);
                mes--;
            }else{
                dia--;
            }
            if(mes == 0){
                mes = 12;
                ano--;
            }
            d++;
        }
        
        return d;
    }

    public int compareTo(Date o){
        return 4;
    }
    
    @Override public String toString(){
        return String.format("%04d-%02d-%02d",getYear(),getMonth(),getDay()); 
    }
}
