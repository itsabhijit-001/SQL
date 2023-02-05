
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class  Update{
 /**
 * @param args
 */
public static void main(String[] args) {
	 String urlMySQL="jdbc:mysql://localhost:3306/hr";
	 String username="root";
	 String password="1234";
	 Scanner scn=new Scanner(System.in);
     
	 try {
			Connection conSQL=DriverManager.getConnection(urlMySQL,username,password);
			System.out.println("Connection success");
	
            System.out.println("Do you want to update any record? (type Y for yes or else no)");
            String out=scn.next().toLowerCase();
            
            if(out.equals("y") || out.equals("yes")) {
                do{
                    System.out.println("Please enter your id : ");
                    int id=scn.nextInt();
                    System.out.println("Which column you want to ");
                    System.out.println("1. For name \n 2. For age \n 3. For Address \n 4.For course Id ");
                    int val=scn.nextInt();

                    if (val==1){
                        String name=scn.next();
                        String query="update student set name="+name+" where id= "+id+" ;";
                        Statement stmt=conSQL.createStatement();
                        int x=stmt.executeUpdate(query);
                        System.out.println("Data updated !!");                    
                
                    }
                    else if (val==2){
                        int age=scn.nextInt();
                        String query="update student set age="+age+" where id= "+id+" ;";
                        Statement stmt=conSQL.createStatement();
                        int x=stmt.executeUpdate(query);
                        System.out.println("Data updated !!");                    
                
                    }
                    else if (val==3){
                        String address=scn.next();
                        String query="update student set address="+address+" where id= "+id+" ;";
                        Statement stmt=conSQL.createStatement();
                        int x=stmt.executeUpdate(query);
                        System.out.println("Data updated !!");                    
                
                    }
                    else if (val==4){
                        int courseId=scn.nextInt();
                        String query="update student set courseId="+courseId+" where id= "+id+" ;";
                        Statement stmt=conSQL.createStatement();
                        int x=stmt.executeUpdate(query);
                        System.out.println("Data updated !!");                    
                
                    }
                    else{
                        System.out.println("Wrong input !!!");                   
                
                    }
                    System.out.println("Do you want to continue ('yes' or 'no')");
                    
                }while(scn.next().equals("yes"));
            }
        }
        catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        scn.close();
    }
}
