import java.util.Scanner;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
class Booking{
    String vehicleType;
    int status;
    int fee;
    Booking(int status,String vehicleType,int fee)
    {
        this.status=status; 
        this.vehicleType=vehicleType;
        this.fee=fee;   
    }
}
public class ParkingLot
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to parking system");
        String[] parkingVehicleType = {"2v", "4v", "hv"};
        int[] parkingVehicleLength=new int[parkingVehicleType.length];
        List<Booking> vehicleList=new ArrayList<Booking>();
        for(int i=0;i<parkingVehicleType.length;i++)
        {
            System.out.println("Enter available parking for " +parkingVehicleType[i]);
            parkingVehicleLength[i]=scan.nextInt();
        }
        for(int i=0;i<parkingVehicleLength.length;i++)
        {
            int status=0;
            System.out.println("Enter  parking fee for " +parkingVehicleType[i]);
            int fee=scan.nextInt();
            for(int j=0;j<parkingVehicleLength[i];j++)
            {
                vehicleList.add(new Booking(status,parkingVehicleType[i],fee));
            }
        }
        int temp=1;
        while(temp==1)
        {
            System.out.println("1 Slot Availablity Of Vehicle");
            System.out.println("2 parking slot booking");
            System.out.println("3 remove parking ");
            System.out.println("4 exit ");
            int option=scan.nextInt();
            switch(option)
            {
                case 1:
                        displayList(vehicleList);
                        break;
                case 2:
                        
                        
                        addParking(vehicleList,parkingVehicleType);
                        //ticket(); 
                        break;
                case 3:
                        removeParking(vehicleList,parkingVehicleType);
                        break;
                case 4:
                        temp=0;
                         break;
            }
        }
    }

    public static void displayList(List<Booking> vehicleList1)
        {
            System.out.println("status vehicleType fee");
            for(Booking vehicleData:vehicleList1)
                {
            System.out.println(vehicleData.status+ " " +vehicleData.vehicleType+ " " +vehicleData.fee);
             }
        }
     public static void addParking(List<Booking> vehicleList1,String[] parkingVehicleType1)
        {
                Scanner scan=new Scanner(System.in);
                for(int i=0;i<parkingVehicleType1.length;i++)
                {
                    System.out.println(+i+ " "+parkingVehicleType1[i]);
                }
                System.out.println("choose vehicle type to park");
                int selection =scan.nextInt();
                System.out.println("enter vehicle number");
                scan.nextLine();
                String vNumber=scan.nextLine();
                int parked=0;
                int slotNumber=0;
                for(Booking vehicleData:vehicleList1)
                {
                    if(vehicleData.vehicleType==parkingVehicleType1[selection])
                    {
                        if(vehicleData.status==0)
                            {
                                 parked=1;
                                 slotNumber= vehicleList1.indexOf(vehicleData);
                                vehicleList1.set(vehicleList1.indexOf(vehicleData),new Booking(1,parkingVehicleType1[selection],vehicleList1.get(vehicleList1.indexOf(vehicleData)).fee));
                            }
                            break;
                    } 
                }
                if(parked==0)
                {
                    System.out.println("slot is not available");
                }
                else
                {
                    System.out.println("-----------------TICKET---------------");
                    System.out.println("VEHICLE NUMBER "+ vNumber);
                    System.out.println("SLOT NUMBER "+slotNumber);

                    System.out.println("------------------------------------");
                }
        }
        public static void removeParking(List<Booking> vehicleList1,String[] parkingVehicleType1)
        {
            Scanner scan=new Scanner(System.in);
            for(int i=0;i<parkingVehicleType1.length;i++)
            {
                System.out.println(+i+ " "+parkingVehicleType1[i]);
            }
            System.out.println("choose vehicle type to unpark");
            int selection =scan.nextInt();
            for(Booking vehicleData:vehicleList1)
                {
                    if(vehicleData.vehicleType==parkingVehicleType1[selection])
                    {
                        if(vehicleData.status==1)
                            {
                                 //slotNumber= vehicleList1.indexOf(vehicleData);
                                vehicleList1.set(vehicleList1.indexOf(vehicleData),new Booking(0,parkingVehicleType1[selection],vehicleList1.get(vehicleList1.indexOf(vehicleData)).fee));
                            }
                            break;
                    } 
                }
                System.out.println("vehicle unparked");
        }
}
