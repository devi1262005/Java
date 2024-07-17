import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReadWrite {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter a filename to write to: ");
            String filename = reader.readLine();

            System.out.print("Enter content to write to the file: ");
            String content = reader.readLine();

            writeToFile(filename, content);

            System.out.println("Content has been written to the file.");

            System.out.println("Reading content from the file...");
            String readContent = readFromFile(filename);
            System.out.println("Content read from file: \n" + readContent);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void writeToFile(String filename, String content) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            writer.write(content);
        }
    }

    private static String readFromFile(String filename) throws IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        }
        return content.toString();
    }
}
