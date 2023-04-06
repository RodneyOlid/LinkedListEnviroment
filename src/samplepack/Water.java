package samplepack;

class Water extends EnviroSamples{
    public double waterTemp;
    public String waterSource;
    public Water(){
        super();
    }
    public Water(String myLocation, int myMonth, int myDay, int myYear, double myTemp, String mySource){
        super(myLocation, myMonth, myDay, myYear);
        waterTemp = myTemp;
        waterSource = mySource;
    }
    public void printInfo(){
        System.out.println("Water Sample");
        System.out.println("Location: " + this.getLocation());
        System.out.println("Date collected: " + this.date);
        System.out.println("Water Source " + this.waterSource);
        System.out.println("Water Temperature: " + this.waterTemp);
    }
}
