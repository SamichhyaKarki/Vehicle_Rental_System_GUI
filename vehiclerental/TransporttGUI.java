
/**
 * Write a description of class TRANSPORTTGUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class TransporttGUI implements ActionListener
{
   private JFrame frame, electricScooterframe,framee;
   private JPanel addPanel, bookPanel, addScooterPanel, sellpurchasePanel, purchaseScooterPanel, sellScooterPanel,panell,pth,pfo,pfi;
   private JLabel vehicleidLabel, vehicleNameLabel,vehicleColorLabel,vehicleWeightLabel,vehicleSpeedLabel,engineDisplacementLabel,torqueLabel,fuelTankLabel,groundLabel,
   bookIdLabel, bookDateLabel, bookChargeLabel, bookSeatsLabel,addAutoTitle,topic2, topic, topicc,lo, lt, lth, lfo, lfi, lx, lvn, le, lnn, lten,lelv, lbar, leen, lfoen,
   scooterVehicleIdLabel,scooterVehicleNameLabel, scooterVehicleColorLabel, scooterVehicleWeightLabel, scooterVehicleSpeedLabel, scooterBatteryCapacityLabel,sellpurchase, 
   forPurchaseLabel,purchaseVehicleIdLabel, purchaseBrandLabel;
   private JTextField vehicleidText, vehicleNameText, vehicleColorText, vehicleWeightText,vehicleSpeedText,engineDisplacementText,torqueText,fuelTankText,groundText, texto, textwo,
   textee, textfo, textfi,textx, textvn, textght, textnn, texten, textelvn, textelve, texteen, textfoen,bookIdText, bookChargeText, bookSeatsText,scooterVehicleIdText,
   scooterVehicleNameText, scooterVehicleColorText, scooterVehicleWeightText, scooterVehicleSpeedText, scooterBatteryCapacityText;
   private JButton clearButton, addButton, clearScooterButton, addScooterButton, addbtn, addbtnn, addbttn, addbbtn, add_electric, add_btnnn, seller,cllearrx, cllearr, display;
   private JComboBox<String> comboOfyear, comboOfmonth, comboOfday;
   
    
   
   ArrayList<Vehicle> ar_list = new ArrayList<Vehicle>();
   public void autoRickshawGUI()
   {
    frame = new JFrame("AutoRickshaw");//frame of autorickshaw
    frame.setBounds(0,0,920,690);
    frame.setLayout(null);
    frame.setResizable(false);
    frame.setLocationRelativeTo(null);
   
   
   
    addPanel = new JPanel();//panel of autorickshaw for addding autorickshaw section
    addPanel.setBounds(0,0,900,310);
    addPanel.setLayout(null);
    addPanel.setBackground(new Color(117, 117, 163));
   
    bookPanel = new JPanel();//panel of autorickshaw for booking autorickshaw section
    bookPanel.setBounds(0,330,450,290);
    bookPanel.setLayout(null);
    bookPanel.setBackground(new Color(117, 117, 163));
   
    topic = new JLabel();//topic given in the panel
    topic.setText("Add AutoRickshaw");
    topic.setBounds(300,0,300,50);
    Font topic_font = new Font("Lucida Sans",Font.BOLD,30);//font to the topic  
    topic.setFont(topic_font);
    addPanel.add(topic);
   
    vehicleidLabel = new JLabel("Vehicle ID");//label for vehicleid for adding auto rickshaw 
    vehicleidLabel.setBounds(15,90,150,18);
    Font fof =  new Font("Times New Roman",Font.PLAIN,20);
    vehicleidLabel.setFont(fof);
   
    vehicleidText = new JTextField();//textfield of vehicleid for adding auto rickshaw 
    vehicleidText.setBounds(180,85,200,25);
   
    vehicleNameLabel = new JLabel("Vehicle Name");//label of vehicle name for adding auto rickshaw 
    vehicleNameLabel.setBounds(15,120,200,18);
    vehicleNameLabel.setFont(fof);
   
    vehicleNameText = new JTextField();//textfield of vehicle name for adding auto rickshaw 
    vehicleNameText.setBounds(180,115,200,25);
   
    vehicleColorLabel = new JLabel("Vehicle Color");// label of vehicle color for adding auto rickshaw 
    vehicleColorLabel.setBounds(15,150,200,18);
    vehicleColorLabel.setFont(fof);
   
    vehicleColorText = new JTextField();//textfield of vehicle color for adding auto rickshaw
    vehicleColorText.setBounds(180,145,200,25);
   
    vehicleWeightLabel = new JLabel("Vehicle Weight");//label of vehicle weight for adding auto rickshaw
    vehicleWeightLabel.setBounds(15,180,200,18);
    vehicleWeightLabel.setFont(fof);
   
    vehicleWeightText = new JTextField();//textfield of vehicle weight for adding auto rickshaw
    vehicleWeightText.setBounds(180,175,200,25);
   
    vehicleSpeedLabel = new JLabel("Vehicle Speed");//label of vehicle speed for adding auto rickshaw
    vehicleSpeedLabel.setBounds(15,210,200,18);
    vehicleSpeedLabel.setFont(fof);
   
    vehicleSpeedText = new JTextField();//textfield of vehicle speed for adding auto rickshaw
    vehicleSpeedText.setBounds(180,205,200,25);
   
    engineDisplacementLabel = new JLabel("Engine Displacement");//label of engine displacement for adding auto rickshaw 
    engineDisplacementLabel.setBounds(460,90,200,18);
    engineDisplacementLabel.setFont(fof);
    
    engineDisplacementText = new JTextField();//textfield of engine displacement for adding auto rickshaw
    engineDisplacementText.setBounds(660,85,200,25);
   
    torqueLabel = new JLabel("Torque");//label of torque for adding auto rickshaw
    torqueLabel.setBounds(460,120,200,18);
    torqueLabel.setFont(fof);
   
    torqueText = new JTextField();//textfield of torque for adding auto rickshaw
    torqueText.setBounds(660,115,200,25);
   
    fuelTankLabel = new JLabel("Fuel Tank Capacity");//label for fuel tank capacity for adding auto rickshaw
    fuelTankLabel.setBounds(460,150,200,18);
    fuelTankLabel.setFont(fof);
   
    fuelTankText = new JTextField();//textfield for fuel tank capacity for adding auto rickshaw
    fuelTankText.setBounds(660,145,200,25);
   
    groundLabel = new JLabel("Ground Clearance");//label of ground clearance for adding auto rickshaw
    groundLabel.setBounds(460,180,200,18);
    groundLabel.setFont(fof);
   
    groundText = new JTextField();//textfield of ground clearance for adding auto rickshaw
    groundText.setBounds(660,175,200,25);
   
    clearButton = new JButton("Clear");//clearbutton
    clearButton.setBounds( 250, 250,130,30);
    clearButton.addActionListener(this);
    
   
    addButton = new JButton("Add");//add button for adding auto rickshaw
    addButton.setBounds(450, 250, 130,30);
    addButton.addActionListener(this);
    
    topic2 = new JLabel();//topic to second book panel
    topic2.setText("Book AutoRickshaw");
    topic2.setBounds(70,10,300,30);
    Font topic2_font = new Font("Lucida Sans",Font.BOLD,25);//font to the topic2
    topic2.setFont(topic2_font);
    bookPanel.add(topic);
    
    
   
    
    
   
    bookIdLabel = new JLabel("Vehicle ID");//label of vehicle id to book autorickshaw
    bookIdLabel.setBounds(15,85,200,18);
    bookIdLabel.setFont(fof);
   
    bookIdText = new JTextField();//textfield of vehicleid to book autorickshaw
    bookIdText.setBounds(180,80,200,25);
   
    bookDateLabel = new JLabel("Booked Date");//label of booked date to book autorickshaw
    bookDateLabel.setBounds(15,115,200,18);
    bookDateLabel.setFont(fof);
   
    String[] year = {"2022","2021","2020","2019","2023","2024"};
    comboOfyear = new JComboBox<>(year);//combobox for year to book autorickshaw
    comboOfyear.setBounds(180,110,65,25);
   
    String[] month = {"January", "February","March", "April", "May", "June", "July", "August", "Septermber", "October", "Nobember", "December"};
    comboOfmonth = new JComboBox<>(month);//combo for month to book autorickshaw
    comboOfmonth.setBounds(245,110,90,25);
   
    String[] day = {"01","02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"};
    comboOfday = new JComboBox<>(day);//combo of day to book autorickshaw
    comboOfday.setBounds(325,110,65,25);
    
    addbtn = new JButton("Book");//label of book to book autorickshaw
    addbtn.setBounds(125,230,130,30);
    addbtn.addActionListener(this);
    
    addbtnn = new JButton("Clear");//clear button in book panel
    addbtnn.setBounds(270,230,130,30);
    addbtnn.addActionListener(this);
    
    addbttn = new JButton("Display");//display buttton 
    addbttn.setBounds(500,410,250,55);
    addbttn.addActionListener(this);
    
    addbbtn = new JButton("Switch to Electric Scooter");//switch to electric scoooter button
    addbbtn.setBounds(500,490,250,55);
    addbbtn.addActionListener(this);
    
   
    bookChargeLabel = new JLabel("Charge Amount");//label of charge amount to book autorickshaw
    bookChargeLabel.setBounds(15,150,200,18);
    bookChargeLabel.setFont(fof);
   
    bookChargeText = new JTextField();//textfield of charge amount to book autorickshaw
    bookChargeText.setBounds(180,150,200,25);
   
    bookSeatsLabel = new JLabel("Number of Seats");//label of number of seats to book autorickshaw
    bookSeatsLabel.setBounds(15,180,200,18);
    bookSeatsLabel.setFont(fof);
   
    bookSeatsText = new JTextField();//textfield of number of seats to book autorickshaw
    bookSeatsText.setBounds(180,180,200,25);
   
   
   
   
   
   
   
    addPanel.add(topic);
    addPanel.add(vehicleidLabel);
    addPanel.add(vehicleidText);
    addPanel.add(vehicleNameLabel);
    addPanel.add(vehicleNameText);
    addPanel.add(vehicleColorLabel);
    addPanel.add(vehicleColorText);
    addPanel.add(vehicleWeightLabel);
    addPanel.add(vehicleWeightText);
    addPanel.add(vehicleSpeedLabel);
    addPanel.add(vehicleSpeedText);
    addPanel.add(engineDisplacementLabel);
    addPanel.add(engineDisplacementText);
    addPanel.add(torqueLabel);
    addPanel.add(torqueText);
    addPanel.add(fuelTankLabel);
    addPanel.add(fuelTankText);
    addPanel.add(groundLabel);
    addPanel.add(groundText);
    addPanel.add(clearButton);
    addPanel.add(addButton);
   
    bookPanel.add(topic2);
    bookPanel.add(bookIdLabel);
    bookPanel.add(bookIdText);
    bookPanel.add(bookDateLabel);
    bookPanel.add(comboOfyear);
    bookPanel.add(comboOfmonth);
    bookPanel.add(comboOfday);
   
    bookPanel.add(bookChargeLabel);
    bookPanel.add(bookChargeText);
    bookPanel.add(bookSeatsLabel);
    bookPanel.add(bookSeatsText);
    bookPanel.add(addbtn);
    bookPanel.add(addbtnn);
    
    frame.add(addbttn);
    frame.add(addbbtn);
    frame.add(addPanel);
    frame.add(bookPanel);
    frame.setVisible(true);
    
   }
    
    
     
    public void actionPerformed(ActionEvent e){
        //Auto rickshaw buttons//clearButton is the clear button of autorickshaw
        if(e.getSource() == clearButton){
            //clear addautorickshaw
            vehicleidText.setText("");
            vehicleNameText.setText("");
            vehicleColorText.setText("");
            vehicleWeightText.setText("");
            vehicleSpeedText.setText("");
            engineDisplacementText.setText("");
            torqueText.setText("");
            fuelTankText.setText("");
            groundText.setText("");
           
        }//addButton is the add button of autorickshaw
        else if(e.getSource() == addButton){
            try{
                int id = Integer.parseInt(vehicleidText.getText());
                String name = vehicleNameText.getText();
                String color = vehicleColorText.getText();
                String weight = vehicleWeightText.getText();
                String speed = vehicleSpeedText.getText();
                int displacement = Integer.parseInt(engineDisplacementText.getText());
                String torque = torqueText.getText();
                int fuel = Integer.parseInt(fuelTankText.getText());
                String ground = groundText.getText();
            
                
                boolean present = false;
            
                for(Vehicle obj: ar_list){
                    if(obj.getVehicleID() == id){
                        present = true;
                        break;
                    }
                }
            
                if(present == false){
                    AutoRickshaw auto = new AutoRickshaw(id,name, color, weight, speed, displacement, torque, fuel, ground);
                    ar_list.add(auto);
                    JOptionPane.showMessageDialog(frame, "Added Successfully");
                }else{
                    JOptionPane.showMessageDialog(frame, "already added");
                }
            
            }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(frame, "Enter Valid data!!!");
            }
           
       }else if(e.getSource() == addbtn){
           //book function of autorickshaw //addbtn is the button of book button of autorickshaw
           try{
               int vehicleID = Integer.valueOf(bookIdText.getText());
               String year = String.valueOf(comboOfyear.getSelectedIndex());
               String month = String.valueOf(comboOfmonth.getSelectedIndex());
               String day = String.valueOf(comboOfday.getSelectedIndex());
               String bookedDate = year + month + day;
               int chargeAmount = Integer.valueOf(bookChargeText.getText());
               int numberOfSeats = Integer.valueOf(bookSeatsText.getText());
               
               boolean present = false;
               for(Vehicle obj: ar_list){
                   if(obj instanceof AutoRickshaw){
                       AutoRickshaw auto = (AutoRickshaw) obj;
                       if(auto.getVehicleID() == vehicleID){
                           if(auto.getIsBooked() == false){
                               auto.Book(bookedDate, chargeAmount, numberOfSeats);
                               JOptionPane.showMessageDialog(frame, "AutoRickshaw has been booked!");
                               
                            }else{
                                JOptionPane.showMessageDialog(frame, "AutoRickshaw has already been booked!");
                            }
                            present = true;
                            break;
                       }
                   }
                }
                
               if(present == false){
                           JOptionPane.showMessageDialog(frame, "AutoRickshaw with this ID is not with us");
                   }
           }
           catch(NumberFormatException n){
               JOptionPane.showMessageDialog(framee, "Enter valid data!!!");
            }
            
       }else if(e.getSource() == addbtnn){
           //clear book function//addbtnn is button name ofclearbutton of autorickshaw
           bookIdText.setText("");
           bookChargeText.setText("");
           bookSeatsText.setText("");
           
       }else if(e.getSource() == addbttn){
           //display function//addbttn is button of displaybutton of autorickshaw
           for(Vehicle obj:ar_list){
               if(obj instanceof AutoRickshaw){
                   AutoRickshaw auto = (AutoRickshaw) obj;
                   auto.display();
                   System.out.println("");
               }
           }
           
       }else if(e.getSource() == addbbtn){
           //Switch to electric scooter//addbbtn is button of switch to electric scooter
           electricScooterGUI();
           frame.setVisible(false);
           
        }
        //Electric scooter buttons// add_electric is the button to add an electric scooter
        else if(e.getSource() == add_electric ){
             try{
                int vehicleID = Integer.valueOf(texto.getText());
                String vehicleName = textwo.getText();
                String vehicleColor = textee.getText();
                String vehicleWeight =textfo.getText();
                String vehicleSpeed = textfi.getText();
                int BatteryCapacity = Integer.valueOf(textx.getText());
               
                boolean present = false;
                for(Vehicle obj: ar_list){
                    if(obj.getVehicleID() == vehicleID){
                        present = true;
                    }
                }
               
                if(present == true){
                    JOptionPane.showMessageDialog(framee, "Already added");
                }else{
                    ElectricScooter auto = new ElectricScooter(vehicleID, vehicleName, vehicleColor, vehicleWeight, vehicleSpeed, BatteryCapacity);
                    ar_list.add(auto);
                    JOptionPane.showMessageDialog(framee, "Added Successfully");
                }
               
                }
            catch(NumberFormatException n){
                JOptionPane.showMessageDialog(framee, "Enter valid data");
            }
           
        }
        else if(e.getSource() == add_btnnn){
            //purchase electric scooter funciton// add_btnnn is the button of purchase electric scooter
            try{
                int vehicleID = Integer.valueOf(textvn.getText());
                String brand = textght.getText();
                int price = Integer.valueOf(textnn.getText());
                String chargingTime = texten.getText();
                String mileage = textelvn.getText();
                int range = Integer.valueOf(textelve.getText());
               
               
               boolean present = false;
               for(Vehicle obj: ar_list){
                   if(obj instanceof ElectricScooter){
                       ElectricScooter auto = (ElectricScooter) obj;
                       if(auto.getVehicleID() == vehicleID){
                           if(auto.getHasPurchased() == false){
                               auto.purchase( brand, price, chargingTime, mileage, range);
                               JOptionPane.showMessageDialog(framee, "ElectricScooter has been Purchased!");
                               
                            }else{
                                JOptionPane.showMessageDialog(framee, "ElectricScooter has already been Purchased!");
                            }
                            present = true;
                            break;
                       }
                   }
                }
                
               if(present == false){
                           JOptionPane.showMessageDialog(frame, "ElectricScooter with this ID is not with us");
                   }
           }
           catch(NumberFormatException n){
               JOptionPane.showMessageDialog(framee, "Enter valid data!!!");
            }
        }
        else if(e.getSource() == seller){
            //sell electric scooter funciton//seller is the button of sell electric scooter
            try{
                int vehicleID = Integer.valueOf(texteen.getText());
                int price = Integer.valueOf(textfoen.getText());
               
               
               boolean present = false;
               for(Vehicle obj: ar_list){
                   if(obj instanceof ElectricScooter){
                       ElectricScooter auto = (ElectricScooter) obj;
                       if(auto.getVehicleID() == vehicleID){
                           if(auto.getHasSold() == false){
                               auto.sell(price);
                               JOptionPane.showMessageDialog(framee, "ElectricScooter has been Sold!");
                               
                            }else{
                                JOptionPane.showMessageDialog(framee, "ElectricScooter has already been Sold!");
                            }
                            present = true;
                            break;
                       }
                   }
                }
                
               if(present == false){
                           JOptionPane.showMessageDialog(frame, "ElectricScooter with this ID is not with us");
                   }
           }
           catch(NumberFormatException n){
               JOptionPane.showMessageDialog(framee, "Enter valid data!!!");
            }
        }
        else if(e.getSource() == cllearrx){
            //clear all electricscooter//cllearrx is the name of clear button of electric sccoter
            texto.setText("");
            textwo.setText("");
            textee.setText("");
            textfo.setText("");
            textfi.setText("");
            textx.setText("");
            textvn.setText("");
            textght.setText("");
            textnn.setText("");
            texten.setText("");
            textelvn.setText("");
            textelve.setText("");
            texteen.setText("");
            textfoen.setText("");            
        }
        else if(e.getSource() == cllearr){
            //switch to auto rickshaw button hunction//cllearr is the name of the 'switch to autorickshaw'
            autoRickshawGUI();
            framee.setVisible(false);
        } 
        else if(e.getSource() == display){
            //electricscooter display button//display is the name of the button of display button of electric scooter
            for(Vehicle obj: ar_list){
                if(obj instanceof ElectricScooter){
                    ElectricScooter ele = (ElectricScooter) obj;
                    ele.display();
                    System.out.println("");
                }
            }
        }
    }
   
   public void electricScooterGUI()
   {
        //JFrame of electric scooter
        framee=new JFrame();
        framee.setLayout(null);
        framee.setBounds(0,0,920,700);
       
        //JPanel for electric scooter//single big panel behind all the three small panel
        panell = new JPanel();
        panell.setLayout(null);
        panell.setBounds(0,0,1000,1000);
       
        //JLabel for electric scooter
        topicc = new JLabel();//giving topic to the panel
        topicc.setText("Electric-Scooter");
        topicc.setBounds(280,5,500,50);
        Font topicc_font = new Font("Lucida Sans",Font.BOLD,30);//font to the topic
        topicc.setFont(topicc_font);
        panell.add(topicc);
        
        
       
        pth = new JPanel();//panel of the add electric scooter section
        pth.setBounds(10, 70, 400, 350);
        pth.setLayout(null);
        panell.add(pth);
       
        pfo = new JPanel();//panel of purchase electric scooter section
        pfo.setBounds(450, 70, 400, 350);
        pfo.setLayout(null);
        panell.add(pfo);

        pfi = new JPanel();//panel of sell electric scooter section
        pfi.setBounds(270, 450, 400, 150);
        pfi.setLayout(null);
        panell.add(pfi);
       
       
       
        //JLabel for electric scooter
        lo = new JLabel();//label for vehicleid for adding electric scooter
        lo.setText("Vehicle Id:");
        Font ff =  new Font("Times New Roman",Font.PLAIN,20);
        lo.setFont(ff);
        lo.setBounds(30,60, 185, 25);
        pth.add(lo);
       
        lt = new JLabel();//label for vehicle name adding electric scooter
        lt.setText("Vehicle Name: ");
        lt.setFont(ff);
        lt.setBounds(30,90,185, 25);
        pth.add(lt);
       
        lth = new JLabel();//label for vehicle color adding electric scooter
        lth.setText("Vehicle Color: ");
        lth.setFont(ff);
        lth.setBounds(30,125, 185, 25);
        pth.add(lth);
       
        lfo = new JLabel();//label for vehicle weight adding electric scooter
        lfo.setText("Vehicle Weight: ");
        lfo.setFont(ff);
        lfo.setBounds(30,160,185, 25);
        pth.add(lfo);
       
        lfi = new JLabel();//label for vehicle speed adding electric scooter
        lfi.setText("Vehicle Speed: ");
        lfi.setFont(ff);
        lfi.setBounds(30,195,185,25);
        pth.add(lfi);
       
        lx = new JLabel();//label for battery capacity adding electric scooter
        lx.setText("Battery Capacity:");
        lx.setFont(ff);
        lx.setBounds(30,210,185,50);
        pth.add(lx);
       
        lvn = new JLabel();//label for vehicle id for purchase
        lvn.setText("Vehicle ID:");
        lvn.setFont(ff);
        lvn.setBounds(30,60,185,25);
        pfo.add(lvn);
       
        le = new JLabel();//label for brand for purchase
        le.setText("Brand: ");
        le.setFont(ff);
        le.setBounds(30,90,185, 25);
        pfo.add(le);
       
        lnn = new JLabel();//label for price for purchase
        lnn.setText("Price: ");
        lnn.setFont(ff);
        lnn.setBounds(30,120,185,25);
        pfo.add(lnn);
       
        lten = new JLabel();//label for chargingtime for purchase
        lten.setText("Charging Time:");
        lten.setFont(ff);
        lten.setBounds(30,150,185,25);
        pfo.add(lten);
       
        lelv = new JLabel();//label for mileage for purchase
        lelv.setText("Mileage: ");
        lelv.setFont(ff);
        lelv.setBounds(30,180,185,25);
        pfo.add(lelv);
       
        lbar = new JLabel();
        lbar.setText("Range: ");//label for range for purchase
        lbar.setFont(ff);
        lbar.setBounds(30,210,185,25);
        pfo.add(lbar);
       
        leen = new JLabel();//label for vehicle id for sell
        leen.setText("Vehicle ID:");
        leen.setFont(ff);
        leen.setBounds(30,30,185,25);
        pfi.add(leen);
       
        lfoen = new JLabel();//label for price for sell
        lfoen.setText("Price: ");
        lfoen.setFont(ff);
        lfoen.setBounds(30,60,185,25);
        pfi.add(lfoen);
       
       
       
       
        //JTextField of electric scooter
        texto= new JTextField();// textfield of Vehicleid for adding electric scooter
        texto.setBounds(210,60,120, 20);
        pth.add(texto);
       
        textwo = new JTextField();//textfield of vehicle name for adding electric scooter
        textwo.setBounds(210,90,120,20);
        pth.add(textwo);
       
        textee= new JTextField();//textfield of vehicle color for adding electric scooter
        textee.setBounds(210,130,120, 20);
        pth.add(textee);
       
        textfo= new JTextField();//textfield of vehicle weight for adding electric scooter
        textfo.setBounds(210,165,120,20);
        pth.add(textfo);
       
        textfi = new JTextField();//textfield of vehicle speed for adding electric scooter
        textfi.setBounds(210,200,120,20);
        pth.add(textfi);
       
        textx= new JTextField();// textfield of vehicle batter capacity for adding electric scooter
        textx.setBounds(210,230,120,20);
        pth.add(textx);
       
        textvn= new JTextField();//textfield of vehicle id for purchasing electric scooter
        textvn.setBounds(210,60,120, 20);
        pfo.add(textvn);
       
        textght = new JTextField();//textfield of brand for purchasing electric scooter
        textght.setBounds(210,90,120,20);
        pfo.add(textght);
       
        textnn= new JTextField();//textfield of price for purchasing electric scooter
        textnn.setBounds(210,120,120, 20);
        pfo.add(textnn);
       
        texten= new JTextField();//textfield of charging time for purchasing electric scooter
        texten.setBounds(210,150,120,20);
        pfo.add(texten);
       
        textelvn = new JTextField();//textfield of mileage for purchasing electric scooter
        textelvn.setBounds(210,180,120,20);
        pfo.add(textelvn);
       
        textelve= new JTextField();//textfield of range for purchasing electric scooter
        textelve.setBounds(210,210,120,20);
        pfo.add(textelve);
       
        texteen= new JTextField();//textfield of vehicle id for selling electric scooter
        texteen.setBounds(210,30,120,20);
        pfi.add(texteen);
       
        textfoen= new JTextField();//textfield of price for selling electric scooter
        textfoen.setBounds(210,60,120,20);
        pfi.add(textfoen);
       
        //Jbutton of electric scooter
       
        add_electric =new JButton();
        add_electric.setText ("Add Electric-Scooter");
        add_electric.setBounds(55,290,180,35);
        add_electric.addActionListener(this);
        pth.add(add_electric);
       
        add_btnnn =new JButton();
        add_btnnn.setText ("Purchase Electric-Scooter");
        add_btnnn.setBounds(90,290,185,35);
        add_btnnn.addActionListener(this);
        pfo.add(add_btnnn);
       
        seller =new JButton();
        seller.setText ("Sell Electric-Scooter");
        seller.setBounds(60,100,185,35);
        seller.addActionListener(this);
        pfi.add(seller);
       
        cllearrx =new JButton();
        cllearrx.setText ("Clear");
        cllearrx.setBounds(700,550,135,50);
        cllearrx.addActionListener(this);
        panell.add(cllearrx);
       
        cllearr =new JButton();
        cllearr.setText ("Switch to Auto-Rickshaw");
        cllearr.setBounds(35,550,210,50);
        cllearr.addActionListener(this);
        panell.add(cllearr);
       
        display = new JButton();
        display.setText ("Display");
        display.setBounds(700,480,135,50);
        display.addActionListener(this);
        panell.add(display);
       
       
       
        //Set the color
        Color cc=new Color(195, 85, 142);
        pth.setBackground(cc);
        pfo.setBackground(cc);
        pfi.setBackground(cc);
       
        Color co=new Color(235, 198, 217);
        panell.setBackground(co);
       
       
        panell.add(pth);
        panell.add(pfo);
        panell.add(pfi);
        framee.add(panell);
        framee.setResizable(false);
        framee.setVisible(true);
       
   
             }
        
    
    
     public static void main(String[] args)
     {
          TransporttGUI obj=new TransporttGUI();
          obj.autoRickshawGUI();
     }
    
}

    