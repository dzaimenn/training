package dzaimenn.streamsio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        File inputFile = new File("input.txt");
        try {
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from file: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        File outputFile = new File("output.txt");

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            String[] messages = {"Hello", "from", "Java!"};
            for (String message : messages) {
                writer.write(message);
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader(outputFile));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read from output file: " + line);
            }
            reader.close();
        } catch (IOException e) {
            System.err.println("Error reading output file: " + e.getMessage());
        }
    }

}