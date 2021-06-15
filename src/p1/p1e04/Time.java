package p1.p1e04;

public class Time {
    private float hour;
    private float minute;
    private float second;

    public float getHour() {
        return hour;
    }

    public void setHour(float hour) {
        this.hour = hour;
    }

    public float getMinute() {
        return minute;
    }

    public void setMinute(float minute) {
        this.minute = minute;
    }

    public float getSecond() {
        return second;
    }

    public void setSecond(float second) {
        this.second = second;
    }

    public Time(float hour, float minute, float second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public float calcBeginning() {
        return ((hour*60)*60) + (minute*60) + second;
    }

    public float calcEnd() {
        return  (((24*60)*60) - calcBeginning());
    }

    public void print() {
        System.out.println("Segundos desde 0h0min0s: "+calcBeginning()+
                "\nSegundos para meia noite: "+calcEnd());
    }
}

