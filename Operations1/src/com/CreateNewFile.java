package com;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
 
public class CreateNewFile
{
    public static void main(String[] args) throws IOException
    {
        createFileUsingFileClass();
        createFileUsingFileOutputStreamClass();
        createFileIn_NIO();
    }
 
    static void createFileUsingFileClass() throws IOException
    {
          File file = new File("\"C:\\Users\\AISHWARYA SR\\Downloads\\1589201301_5keywords_and_custom_exceptions (1).docx\"");
          if (file.createNewFile()){
            System.out.println("File is created!");
          }else{
            System.out.println("File already exists.");
          }
           
          FileWriter writer = new FileWriter(file);
          writer.write("Test data");
          writer.close();
    }
 
     static void createFileUsingFileOutputStreamClass() throws IOException
    {
        String data = "Test data";
        FileOutputStream out = new FileOutputStream("\"C:\\Users\\AISHWARYA SR\\Downloads\\1589201301_5keywords_and_custom_exceptions.docx\"");
        out.write(data.getBytes());
        out.close();
    }
 
     static void createFileIn_NIO()  throws IOException
    {
        String data = "Test data";
        Files.write(Paths.get("\"C:\\Users\\AISHWARYA SR\\Downloads\\BingWallpaper.exe\""), data.getBytes());
        List<String> lines = Arrays.asList("1st line", "2nd line");
        Files.write(Paths.get("file6.txt"),
                    lines,
                    StandardCharsets.UTF_8,
                    StandardOpenOption.CREATE,
                    StandardOpenOption.APPEND);
    }
}
