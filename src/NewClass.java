import java.sql.*;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NewClass 
{
    public static void main(String[] args) throws Exception
  
        {   System.out.println("----------------------------------------------------------------------");
            System.out.println("--------------WELCOME TO INTERNATIONAL AIR TRAFFIC CONTROL------------");
            System.out.println("----------------------------------------------------------------------");
            String url = "jdbc:mysql://localhost:3306/airtraffic"; // configure mysql manually and port number
            String uname = "root";
            String pass = ""; //enter password for root manually
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,uname,pass);
            Statement st = con.createStatement();
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("1.View flights crossing Syria");
            System.out.println("2.View flights crossing Syria @ particular time");
            System.out.println();
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Enter Option");
            Scanner in = new Scanner(System.in); 
            int s = in.nextInt();
             switch (s) 
                 { 
                         case 1: 
                             String query = "SELECT * FROM `syria` ORDER BY `aircraft number` ASC";
                               ResultSet rs = st.executeQuery(query);
                                while(rs.next())
                                    {
                                        String table = rs.getInt(1) + " : " + rs.getString(2) + "  "+ rs.getTime(3) + "  "+ rs.getTime(4) + "  ";
                                        System.out.println(table);
                                      }
                         
                                   break; 
                         case 2:  
                                System.out.println("Enter the inTIME  as HH:mm:ss");
                                Scanner im = new Scanner(System.in);
                                String sDate2 = im.next();
                                String str = new String(sDate2);
                                //String time = str.split("\\s")[1].split("\\.")[0];
                               // System.out.print(time);
                                System.out.println("Enter the OutTIME as HH:mm:ss");
                                Scanner scanner = new Scanner(System.in);
                                String sDate1 = scanner.next();
                                String str1 = new String(sDate1);
                                // String time1 = str.split("\\s")[1].split("\\.")[0];
                                //System.out.print(time1);
                               //System.out.println(outtime);

                                
                               String query2 = "SELECT * FROM `syria` WHERE `intime` >= '"+str+"' AND `outtime` <= '"+str1+"' ORDER BY `intime` ASC";
                               //String query2="SELECT * FROM `syria` WHERE `intime` >= '16:40:00' AND `outtime` <= '22:00:00' ORDER BY `aircraft number` ASC";
                                ResultSet ru = st.executeQuery(query2);
                                while(ru.next())
                                    {
                                        String table = ru.getInt(1) + " : " + ru.getString(2) + "  "+ ru.getTime(3) + "  "+ ru.getTime(4) + "  ";
                                        System.out.println(table);
                                      }
                }              
            
            
        
            st.close();
            con.close();
        
        }
}
