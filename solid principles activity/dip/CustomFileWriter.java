package solid.live.dip;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CustomFileWriter implements Writer{
    private String filePath;

    CustomFileWriter(String filePath){
        this.filePath = filePath;
    }
    @Override
    public void write(String data) {
        try (
            BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))){

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
