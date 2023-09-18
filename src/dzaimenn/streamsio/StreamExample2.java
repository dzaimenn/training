package dzaimenn.streamsio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class StreamExample2 {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("ping www.example.com");
            InputStream inputStream = process.getInputStream();
            OutputStream outputStream = process.getOutputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            PrintWriter writer = new PrintWriter(new OutputStreamWriter(outputStream));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.println("Data from process: " + line);
                writer.flush();
            }

            reader.close();
            writer.close();
            inputStream.close();
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}