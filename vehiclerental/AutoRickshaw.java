
/**
 * Write a description of class AutoRickshaw here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AutoRickshaw extends Vehicle
{
    private int engineDisplacement;
    private String torque;
    private int numberOfSeats;
    private int fuelTankCapacity;
    private String groundClearance;
    private int chargeAmount;
    private String bookedDate;
    private boolean isBooked;
    
    public AutoRickshaw(int vehicleID, String vehicleName, String vehicleWeight, String vehicleColor, String vehicleSpeed, int engineDisplacement,
    String torque, int fuelTankCapacity, String groundClearance){
    super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
    this.engineDisplacement= engineDisplacement;
    this.torque= torque;
    this.fuelTankCapacity= fuelTankCapacity;
    this.groundClearance= groundClearance;
    super.setVehicleSpeed(vehicleSpeed);
    super.setVehicleColor(vehicleColor);
    this.isBooked= false;
    }
    
    public int getEngineDisplacement(){
        return this.engineDisplacement;
    }
    
    public String getTorque(){
        return this.torque;
    }
    
    public int getNumberOfSeats(){
        return this.numberOfSeats;
    }
        
    public int getFuelTankCapacity(){
        return this.fuelTankCapacity;
    }
    
    public String getGroundClearance(){
        return this.groundClearance;
    }
    
    public int getChargeAmount(){
        return this.chargeAmount;
    }
    
    public String getBookedDate(){
        return this.bookedDate;
    }
    
    public boolean getIsBooked(){
        return this.isBooked;
    }
    
    public void setChargerAmount(int newChargeAmount){
        this.chargeAmount=newChargeAmount;
    }
    
    public void setNumberOfSeats(int newNumberOfSeats){
        this.numberOfSeats=newNumberOfSeats;
    }
    
    public void Book(String bookDate, int ChargeAmount, int numberOfSeats){
        if(this.isBooked == false){
            this.bookedDate = bookedDate;
            this.isBooked=true;
            this.chargeAmount=chargeAmount;
            this.numberOfSeats=numberOfSeats;
            System.out.println("your autorickshaw is booked");
        }else{
            System.out.println("isBooked= " +this.isBooked);
            System.out.println("this autorickshaw is already booked");
        }
    }
    
    public void display(){
        super.display();
        if(isBooked==true){
            System.out.println("EngineDisplacement=" +this.engineDisplacement);
            System.out.println("Torque=" + this.torque);
            System.out.println("FuelTankCapacity=" + this.fuelTankCapacity);
            System.out.println("GroundClearlance" + this.groundClearance);
            System.out.println("BookedDate=" + this.bookedDate);
        }  
        
        if(this.chargeAmount==0){
            System.out.println("Charge amount not set");
        }else{
            System.out.println("Charge amount=" + this.chargeAmount);
        }
        
        if(this.numberOfSeats==0){
            System.out.println("number of seats not set");
        }else{
            System.out.println("number of seats=" +this.numberOfSeats);
        }
    }
}

