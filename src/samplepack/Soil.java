package samplepack;
class Soil extends EnviroSamples{
    public String soilType, soilColor;
    public double soilWeight;
    public Soil(){
        super();
    }
    public Soil(String myLocation, int myMonth, int myDay, int myYear, String myType, String myColor, double myWeight){
        super(myLocation, myMonth, myDay, myYear);
        soilType = myType;
        soilColor = myColor;
        soilWeight = myWeight;
    }
    public void printInfo(){
        System.out.println("Soil Sample");
        System.out.println("Location: " + this.getLocation());
        System.out.println("Date collected: " + this.date);
        System.out.println("Type and color: " + this.soilType + " " + this.soilColor);
        System.out.println("Soil Weight: " + this.soilWeight + "grams");
    }
}