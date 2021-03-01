package constructor_Lesson;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class WorkingWithFiles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filename = "src/test/data.csv";
		
		File file = new File (filename);
		
		if (!file.exists()) { 
			try {
				file.createNewFile();
				System.out.println(file.getName() + " created");
			} catch (IOException e) {
				System.out.println("Error creating file");
				System.out.println(e);
			}
		}
		
		try {
			FileWriter fileWriter = new FileWriter(filename);
			PrintWriter printWriter = new PrintWriter(fileWriter);
			printWriter.println("id,name,email\n");
			printWriter.println("1,Jamila,jamila@gmail.com");
			printWriter.println("2,Alex,alex@hotmail.com");
			printWriter.println("3,Musa,musa@hotmail.com");
			printWriter.println("4,Johnny,johnny@hotmail.com");
			printWriter.close();
			printWriter.flush();
			System.out.println("contents added to file");
		} catch (IOException e) {
			System.out.println(e);
		}
		
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader reader = new BufferedReader(new FileReader(file));
			
			String contents = "";
			
			System.out.println("header = " + reader.readLine());

			List<User> users = new ArrayList<>();
			while ((contents = reader.readLine()) != null) {
				String[] split = contents.split(",");
				Integer id = Integer.parseInt(split[0]);
				String name = split[1];
				String email = split[2];
				User user = new User(id, name, email);
				users.add(user);
			}
			
			reader.close();
			
			System.out.println("Looping through user list");
			users.forEach(System.out::println);
			
		} catch (IOException e) {
			System.out.println(e);
		}

	}


}
