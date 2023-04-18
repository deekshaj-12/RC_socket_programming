import java.io.*;
class credits1
{
    public static void credits()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
              System.out.println("\t\tOTHELLO");
              System.out.println("\t\tOriginally invented by:    Lewis Waterman and John W. Mollett ");
              System.out.println("\t\tProgrammed by:   Deeksha J   ");
              System.out.println("\t\tTesting Team: ");
              System.out.println("\t\tExecutive Team: ");
              System.out.println("\t\tMarketing Team:  ");
              Thread.sleep(5000);
              System.out.print("\u000C");
        
        System.out.print("\t\tPress Enter to Continue...");
        br.read();
        System.out.print("\u000C");
        menu1 m=new menu1();
        m.menu();
    }
}