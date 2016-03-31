import java.io.*;
import java.util.*;

public class FCFS
{

    public static void main(String[] args)
    {
        ArrayList<String> list1 = new ArrayList<String>();
        try
        {
            File file = new File("input.data");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            String line;
            System.out.println("Input: \n");
          
            while ((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
                list1.add(line);
              
            }
          
            fileReader.close();
           
          
            String numProcesses = list1.get(0);
           
            String type = list1.get(1);
           
           
            if (type.equals("0"))     // This means it is not Round Robin. We will do First Come First Serve    
            computeFCFS(list1, numProcesses);
          
  
        }
      

        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
   
   
   
  
    public static void computeFCFS(ArrayList<String> list1, String numProcesses)
    {
        System.out.println("\n");
       
        System.out.println("Output: \n");
       
        char arrivalTimeP1 = list1.get(2).charAt(0);
        char burstTimeP1 = list1.get(2).charAt(2);
        char priorityP1 = list1.get(2).charAt(4);
     
       
        char arrivalTimeP2 = list1.get(3).charAt(0);
        char burstTimeP2 = list1.get(3).charAt(2);
        char priorityP2 = list1.get(3).charAt(4);
      
       
        char arrivalTimeP3 = list1.get(4).charAt(0);
        char burstTimeP3 = list1.get(4).charAt(2);
        char priorityP3 = list1.get(4).charAt(4);
     
       
        System.out.println("0   " + burstTimeP1 +  "   1");
        int a = Character.getNumericValue(burstTimeP1);
        int b = Character.getNumericValue(burstTimeP2);
        int endTimeP2 = a+b;
        System.out.println(burstTimeP1+"   "+ endTimeP2 + "   2 ");
   
        int y = Character.getNumericValue(burstTimeP3);
        int endTimeP3 = endTimeP2 + y;
        System.out.println(endTimeP2+"   "+endTimeP3+"   "+"3");
       
       
    }
}