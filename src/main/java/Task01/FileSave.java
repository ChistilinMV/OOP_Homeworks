package Task01;

import java.io.FileWriter;
import java.io.IOException;

public interface FileSave {
    default void savefile(String string){
        try (FileWriter file = new FileWriter("ftree.txt")) {
            file.append(string);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
