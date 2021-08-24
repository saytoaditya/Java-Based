import java.util.Scanner;
import java.util.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime; 
class Parking
{
    public static void main(String[] args)
    {
        int temp=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Welcome In parking Lot System");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter available car parking slot");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int carSlot=scan.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter available bike parking slot");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int bikeSlot=scan.nextInt();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Enter available heavy Vehicle parking slot");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int heavySlot=scan.nextInt();
        int car[]=new int[carSlot];     // to store car parking
        int bike[]=new int[bikeSlot];   // to store bike parking
        int heavy[]=new int[heavySlot]; 
        StringBuilder carTicket=new StringBuilder(carSlot);     // to store carTicket 
        StringBuilder bikeTicket=new StringBuilder(bikeSlot);  // to store bikeTicket 
        StringBuilder heavyTicket=new StringBuilder(heavySlot);   // to store heavyTicket 
        while(temp==1)
        {
            System.out.println("1 Slot Availablity Of Vehicle");
            System.out.println("2 parking slot booking");
            System.out.println("3 removee parking ");
            System.out.println("4 exit ");
            int option=scan.nextInt();
            switch(option) 
            { 
                case 1:
                        showAvailableParking(car,bike,heavy);
                        break;
                case 2:
                        addParking(car,bike,heavy);
                        //ticket();
                        break;
                case 3:
                        emptyParking(car,bike,heavy);
                        break;
                case 4:
                        temp=0;
                         break;
            }
        }
    }
    public static void showAvailableParking( int car[],int bike[],int heavy[])
    {
        System.out.println(" car parking available slot no" );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int i=0;i<car.length;i++)
        {
            if(car[i]==0)
            System.out.print(+i+ " ");
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" bike parking available slot no" );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int j=0;j<bike.length;j++)
        {
            if(bike[j]==0)
            System.out.print(+j+ " ");
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" heavy parking available slot no" );
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        for(int k=0;k<heavy.length;k++)
        {
            if(heavy[k]==0)
            System.out.print(+k+ " ");
        }
        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    }
    public static void addParking(int car[],int bike[],int heavy[])
    {
        Scanner scan =new Scanner(System.in); 
        System.out.println("For Which Vehicle You want to add praking");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("1 car");
        System.out.println("2 bike");
        System.out.println("3 heavy");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1: 

                    
                    java.util.Date inTime=new java.util.Date();   
                    int availableParking=0;
                    for(int i=0;i<car.length;i++)
                    {
                         if(car[i]==0)
                        {
                            System.out.println("Enter  number of car");
                            int carvehicleNo=scan.nextInt(); 
                            availableParking=i;
                            car[i]=1;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("here is your ticket detail");
                            System.out.println("Vehile Number - "+carvehicleNo);
                            System.out.println("In Time - "+inTime);
                            System.out.println("Parking Number - " +availableParking);
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            break;
                        }
                    }
                    break;
            case 2:  
                    System.out.println("Enter  number of bike");
                    int bikevehicleNo=scan.nextInt(); 
                    java.util.Date bikeinTime=new java.util.Date();  
                    ///System.out.println(inTime); 
                    int bikeavailableParking=0;
                    for(int i=0;i<bike.length;i++)
                    {
                        
                        if(bike[i]==0)
                        {
                            bike[i]=1;
                            bikeavailableParking=i;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("here is your ticket detail");
                            System.out.println("Vehile Number- "+bikevehicleNo);
                            System.out.println("In Time -"+bikeinTime);
                            System.out.println("Parking Number -" +bikeavailableParking);
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            break;
                        }
                    }
                    
                    break;
            case 3:
                    System.out.println("Enter  number of heavy");
                    int heavyVehicleNo=scan.nextInt(); 
                    java.util.Date heavyinTime=new java.util.Date();  
                    ///System.out.println(inTime); 
                    int heavyAvailableParking=0;
                    for(int i=0;i<heavy.length;i++)
                    {
                        
                        if(heavy[i]==0)
                        {
                            heavy[i]=1;
                            heavyAvailableParking=i;
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            System.out.println("here is your ticket detail");
                            System.out.println("Vehile Number- "+heavyVehicleNo);
                            System.out.println("In Time -"+heavyinTime);
                            System.out.println("Parking Number -" +heavyAvailableParking);
                            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                            break;
                        }
                    }
                   
                    break;
        }  
    }
    public static void emptyParking(int car[],int bike[],int heavy[])
    {
        Scanner scan =new Scanner(System.in); 
        System.out.println("For Which Vehicle You want to empty praking");
        System.out.println("1 car");
        System.out.println("2 bike");
        System.out.println("3 heavy");
        int choice=scan.nextInt();
        switch(choice)
        {
            case 1: 
                    System.out.println("Which car is Leaving");
                    int cardetail=scan.nextInt();
                    for(int i=0;i<car.length;i++)
                    {
                        if(i==cardetail)
                        {
                            car[i]=0;
                            System.out.println("Paarking no "+i+ " is available now");
                        }
                    }
                    break;
            case 2:  
                    System.out.println("Which bike is Leaving");
                    int bikedetail=scan.nextInt();
                    for(int j=0;j<bike.length;j++)
                    {
                        if(bike[bikedetail]==0)
                        {
                            System.out.println("parking is already empty");
                        }
                        if(j==bikedetail)
                        {
                            bike[j]=0;
                            System.out.println("Paarking no "+j+ " is available now");
                        }
                    }
                    break;
            case 3:
                    System.out.println("Which heavy Vehicle is Leaving");
                    int heavydetail=scan.nextInt();
                    for(int k=0;k<heavy.length;k++)
                    {
                        if(heavy[heavydetail]==0)
                        {
                            System.out.println("parking is already empty");
                        }
                        if(k==heavydetail)
                        {
                            heavy[k]=0;
                            System.out.println("Paarking no "+k+ " is available now");
                        }
                    }
                    break;
        }  
    }
}