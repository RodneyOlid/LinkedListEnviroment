package samplepack;

class Rock extends EnviroSamples {
    public String rockType, rockName, rockColor;
    public Rock(){
        super();
    }
    public Rock(String myLocation, int myMonth, int myDay, int myYear, String myType, String myName, String myColor){
        super(myLocation, myMonth, myDay, myYear);
        this.rockType = myType;
        this.rockName = myName;
        this.rockColor = myColor;
    }
    public void printInfo(){
        System.out.println("Rock Sample: ");
        System.out.println("Location: " + this.getLocation());
        System.out.println("Date collected: " + this.date);
        System.out.println("Type and color: " + this.rockType + " " + this.rockColor);
        System.out.println("Rock name: " + this.rockName);
    }

}