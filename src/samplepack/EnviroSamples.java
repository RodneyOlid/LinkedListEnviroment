package samplepack;
public abstract class EnviroSamples {

    private String location;
    public int month, day, year;
    public String date;
    public static int amount = 0;
    public EnviroSamples(){
    }
    public EnviroSamples(String myLocation, int myMonth, int myDay, int myYear){
        this.location = myLocation;
        this.month = myMonth;
        this.day = myDay;
        this.year = myYear;
        this.date = myMonth + "/" + myDay + "/" + myYear;
        amount++;
    }
    public String getLocation() {
        return this.location;
    }

    public void setLocation(String myLocation) {
        this.location = myLocation;
    }

    public void printInfo(){
        System.out.println("Environmental Sample: ");
        System.out.println("Location " + getLocation());
        System.out.println("Date: " + this.date);
    }

    @Override
    public String toString(){
        return "The date the sample was collected was " + this.date;
    }

}


