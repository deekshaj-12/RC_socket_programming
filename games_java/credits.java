import java.io.*;
class credits
{
    public void Credits()throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
              System.out.println("\t\tMASTER MIND");
              System.out.println("\t\tOriginally invented by:   Mordecai Meirowitz");
              System.out.println("\t\tProgrammed by:   Deeksha Jayanth   ");
              System.out.println("\t\tTesting Team: ");
              System.out.println("\t\tExecutive Team: ");
              System.out.println("\t\tMarketing Team:  ");
              Thread.sleep(5000);
              System.out.print("\u000C");
        
        System.out.print("\t\tPress Enter to Continue...");
        br.read();
        System.out.print("\u000C");
        menu m=new menu();
        m.options();
    }
}
    
    
        
    
        
    