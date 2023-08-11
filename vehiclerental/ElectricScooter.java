
/**
 * Write a description of class ElectricScooter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class ElectricScooter extends Vehicle
{
    //attributes of class ElectricScooter
    private int range;
    private int batteryCapacity;
    private int price;
    private String chargingTime;
    private String brand;
    private String mileage;
    private boolean hasPurchased;
    private boolean hasSold;
    
    //constructor
    public ElectricScooter(int vehicleID, String vehicleName, String vehicleWeight, String vehicleSpeed, String vehicleColor, int batteryCapacity){
        super(vehicleID, vehicleName, vehicleColor, vehicleWeight);
        super.setVehicleSpeed(vehicleSpeed);//calling mutator method from super class
        super.setVehicleColor(vehicleColor);
        this.batteryCapacity= batteryCapacity;
        this.range= 0;
        this.price= 0;
        this.brand= "";
        this.mileage= "";
        this.chargingTime= "";
        this.hasPurchased= false;
        this.hasSold= false;
    }
    
    
    //accessor method 
    public int getRange(){
        return range;
    }
    
    public int getPric(){
        return price;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public String getMileage(){
        return mileage;
    }
    
    public boolean getHasPurchased(){
        return hasPurchased;
    }
    
    public boolean getHasSold(){
        return hasSold;
    }
    
    //method to set the brand
    public void setBrand(String newBrand){
        if(this.hasPurchased == false){
            this.brand= newBrand;
        }else{
            System.out.println("It is not possible to change the brand.");
        
        }
    } 
    //method to purchase an electric scooter
    public void purchase(String brand,int price, String chargingTime, String mileage, int range){
        if(!this.hasPurchased){
            setBrand(brand);
            this.price= price;
            this.chargingTime= chargingTime;
            this.mileage= mileage;
            this.range= range;
            this.hasPurchased= true;
        }else{
            System.out.println("The scooter has already been purchased");
        }
    }
    //method to sell
    public void sell(int price){
        this.price = price;
        if(!this.hasSold){
            this.range = 0;
            this.chargingTime = "";
            this.mileage = "";
            this.batteryCapacity=0;
            this.hasSold = true;
            this.hasPurchased = false;
        }else{
            System.out.println("The scooter is already sold");
        }
    }

    //display method
    public void display(){
        super.display();
        if(this.hasPurchased){
            System.out.println("Brand:" +this.brand);
            System.out.println("Battery Capacity:" +this.batteryCapacity);
            System.out.println("Mileage: " +this.mileage);
            System.out.println("Range: " +this.range);
            System.out.println("Recharge Time: " +this.chargingTime);
        }
    }
}


    
     
    

