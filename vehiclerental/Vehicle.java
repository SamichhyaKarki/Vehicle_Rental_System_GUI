
/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    private int vehicleID;
    private String vehicleName;
    private String vehicleWeight;
    private String vehicleColor;
    private String vehicleSpeed;
   
    public Vehicle (int vehicleID, String vehicleName, String vehicleColor, String vehicleWeight) {
       this.vehicleID = vehicleID;
       this.vehicleName = vehicleName;
       this. vehicleWeight = vehicleWeight;
    }
    
    public int getVehicleID(){
        return this.vehicleID;
    }
    
    public String getVehicleName(){
        return this.vehicleName;
    }
    
    public String getVehicleColor(){
        return this.vehicleColor;
    }
    
        public String getVehicleWeight(){
        return this.vehicleWeight;
    }
    
    public String getVehicleSpeed(){
        return this .vehicleSpeed;
    }
            
    public void setVehicleSpeed(String newSpeed){
        this.vehicleSpeed = newSpeed;
    }
            
    public void setVehicleColor(String newColor){
        this.vehicleColor = newColor;
    }
            
    public void display(){
        System.out.println("vehicle ID: " + this.vehicleID);
        System.out.println(" vehicle Name: " + this.vehicleName);
        System.out.println (" vehicle speed: " + this.vehicleSpeed);
        System.out.println (" vehicle Weight: " + this. vehicleWeight);
        
        if(this.vehicleWeight == ""){
            System.out.println("vehicleWeight value is not defined");
        }
        else{
            System.out.println("vehicle Weight: "+ this.vehicleWeight);
        }
    }
}
                
            
    
       
       
   
