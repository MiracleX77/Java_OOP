public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h,int m ,int s){
        hour=h;
        minute=m;
        second=s;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }
    public void setHour(int h){
        hour=h;
    }
    public void setMinute(int m){
        minute=m;
    }
    public void setSecond(int s){
        second=s;
    }
    public void setTime(int h,int m,int s){
        hour=h;
        minute=m;
        second=s;
    }
    public String toString(){
        if (hour<10 && minute<10 && second<10){
            return "0"+hour+":0"+minute+":0"+second;
        }
        else if(hour<10 && minute<10){
            return "0"+hour+":0"+minute+":"+second;
        }
        else if(hour<10 && second<10){
            return "0"+hour+":"+minute+":0"+second;
        }
        else if(minute<10 && second<10){
            return hour+":0"+minute+":0"+second;
        }
        else if(minute<10){
            return hour+":0"+minute+":"+second;
        }
        else if(second<10){
            return hour+":"+minute+":0"+second;
        }
        else if(hour<10){
            return "0"+hour+":"+minute+":"+second;
        }
        else{
            return hour+":"+minute+":"+second;
        }
    }
    public Time nextSecond(){
        second+=1;
        if (second==60){
            second=0;
            minute+=1;
        }
        if (minute==60){
            minute=0;
            hour+=1;
        }
        if (hour==24){
            hour=0;
        }
        return this;
    }
    public Time previousSecond(){
        second-=1;
        if (second==-1){
            second=59;
            minute-=1;
        }
        if (minute==-1){
            minute=59;
            hour-=1;
        }
        if (hour==-1){
            hour=23;
        }
        return this;
    }


}
