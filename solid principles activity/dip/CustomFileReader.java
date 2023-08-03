package solid.live.dip;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CustomFileReader implements Reader{
    private String filePath;
    CustomFileReader(String filePath){
        this.filePath= filePath;
    }

    @Override
    public String read() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        StringBuilder content = new StringBuilder();
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            content.append(line).append("\n");
        }

        String fileContent = content.toString();
        return fileContent;
    }
}
