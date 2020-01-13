
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MyFile {

		public static void main(String[] args) {
			String username;
			String password;
			String choice =null;
			Scanner s =new Scanner(System.in);
			try(FileWriter fileWriter = new FileWriter("D:/newFile.txt")) {
				do {
					System.out.println("Enter Username ");
					username = s.next();
					System.out.println("Enter Password");
					password = s.next();
					fileWriter.append(username+" ");
					fileWriter.append(password);
					System.out.println("Do you want to Continue(yes/no)");
					choice = s.next();
				} while(choice.equalsIgnoreCase("yes"));
			}
			catch(IOException ex) {
				System.out.println(ex);
			}
		}

}
