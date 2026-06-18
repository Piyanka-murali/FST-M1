
package com.activity;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) {

        try {
            // Create file
            File inputFile = new File("src/main/resources/newfile.txt");
            boolean fStatus = inputFile.createNewFile();

            if (fStatus) {
                System.out.println("File created successfully!");
                
                // Write data into file
                FileUtils.writeStringToFile(inputFile, 
                        "Some text in a file", 
                        Charset.defaultCharset());
            } else {
                System.out.println("File already exists at this path.");
            }

            // Read file
            System.out.println("Data in file: " + 
                    FileUtils.readFileToString(inputFile, "UTF-8"));

            // Create directory
            File destDir = new File("src/main/resources/destDir");
            if (!destDir.exists()) {
                destDir.mkdir();
            }

            // Copy file to directory
            FileUtils.copyFileToDirectory(inputFile, destDir);

            // Get file from new directory
            File newFile = FileUtils.getFile(destDir, "newfile.txt");

            // Read data from new file
            String newFileData = FileUtils.readFileToString(newFile, "UTF-8");

            // Print it
            System.out.println("Data in new file: " + newFileData);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
