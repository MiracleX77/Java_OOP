public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }
    public int getDay(){
        return day;
    }
    public int getMonth(){
        return month;
    }
    public int getYear(){
        return year;
    }
    public void setDay(int new_d ){
        day=new_d;
    }
    public void setMonth(int new_m ){
        month=new_m;
    }
    public void setYear(int new_y ){
        year=new_y;
    }
    public void setDate(int d,int m,int y){
        day=d;
        month=m;
        year=y;
    }
    public String toString(){
        if (day<10 && month<10){
            return "0"+day+"/0"+month+"/"+year;
        }
        else if(day<10){
            return "0"+day+"/"+month+"/"+year;
        }
        else if(month<10){
            return day+"/0"+month+"/"+year;
        }
        else{
            return day+"/"+month+"/"+year;
        }
    }


    
}
