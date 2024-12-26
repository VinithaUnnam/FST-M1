package activities;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;

public class Activity14 {
	    public static void main(String[] args) {
	        try {
	            // Step 1: Create a new text file
	            File file = new File("samplefile.txt");
	            boolean fStatus = file.createNewFile(); // Create the file if it doesn't exist
	            if (fStatus) {
	                System.out.println("File created successfully!");
	            } else {
	                System.out.println("File already exists.");
	            }

	            // Step 2: Write some text into the file
	            String content = "This is a sample text file.\nWe are performing file operations!";
	            FileUtils.writeStringToFile(file, content, "UTF-8"); // Write text to the file

	            // Step 3: Read data from the file
	            String fileData = FileUtils.readFileToString(file, "UTF-8");
	            System.out.println("Data in file: " + fileData);

	            // Step 4: Create a new directory named 'resources'
	            File destDir = new File("resources");
	            if (!destDir.exists()) {
	                destDir.mkdir(); // Create the directory if it doesn't exist
	                System.out.println("Directory 'resources' created.");
	            }

	            // Step 5: Copy the file to the new directory
	            FileUtils.copyFileToDirectory(file, destDir);
	            System.out.println("File copied to 'resources' directory.");

	            // Step 6: Read data from the copied file in the 'resources' directory
	            File newFile = FileUtils.getFile(destDir, "samplefile.txt");
	            String newFileData = FileUtils.readFileToString(newFile, "UTF-8");
	            System.out.println("Data from the copied file: " + newFileData);

	        } catch (IOException e) {
	            e.printStackTrace(); // Handle exceptions like file not found or access issues
	        }
	    }
	}


