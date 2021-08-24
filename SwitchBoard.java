import java.util.Scanner;
import java.util.*;
class ApplianceData
{
    String applianceName;
    int refrence;
    String state; 
    ApplianceData(int refrence,String applianceName,String state)
    {
        this.applianceName=applianceName;
        this.refrence=refrence;
        this.state=state;
    }
}
class SwitchBoard
{
    public static void main(String[] args)
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome in switchboard simulation");
       
       
        String[] appliance  = {"Fan", "Ac", "Bulb"}; 
        int appliancesCount[]=new int[appliance.length];
        List<ApplianceData> appliancesList=new ArrayList<ApplianceData>();
        for(int i=0;i<appliancesCount.length;i++)
        {
            System.out.println("enter value for "+appliance[i]);
            appliancesCount[i]=scan.nextInt();
        }
        
        for(int i=0;i<appliancesCount.length;i++)
        {
            int refrence=1;
            for(int j=0;j<appliancesCount[i];j++)
            {
                
                String state="off";
                appliancesList.add(new ApplianceData(refrence++,appliance[i],state));
            }
        }
        
        
        int temp=0;
        while(temp==0)
        {
            displayList(appliancesList);
            System.out.println("ENTER DEVICE NUMBER TO ON/OFF or press 0 to exit");
            int deviceInput=scan.nextInt();
            if(deviceInput==0)
            break;
            if(appliancesList.get(deviceInput-1).state=="off")
            System.out.println("1.  Switch " +appliancesList.get(deviceInput-1).applianceName+" "+appliancesList.get(deviceInput-1).refrence+ " ON");
            else
            System.out.println("1. Switch " +appliancesList.get(deviceInput-1).applianceName+" "+appliancesList.get(deviceInput-1).refrence+" OFF");
            System.out.println("2. back");
            int stateInput=scan.nextInt();
            if(stateInput==1)
            chnageState(deviceInput,appliancesList);
            else
            displayList(appliancesList);
        }
        
        
    }
        public static void displayList(List<ApplianceData> appliancesList1)
        {
            int deviceNnumber=1;
            for(ApplianceData appliancesList:appliancesList1)
                {
            System.out.println(deviceNnumber+ " " +appliancesList.applianceName+ " " +appliancesList.refrence+ " is " +appliancesList.state);
            deviceNnumber++;
            }
        }
         public static void chnageState(int input,List<ApplianceData> appliancesListc)
          {
            if(appliancesListc.get(input-1).state=="off")
            appliancesListc.set(input-1,new ApplianceData(appliancesListc.get(input-1).refrence,appliancesListc.get(input-1).applianceName,"on"));
            else
            appliancesListc.set(input-1,new ApplianceData(appliancesListc.get(input-1).refrence,appliancesListc.get(input-1).applianceName,"off"));
            
         }
}