package Task05;

import java.io.FileWriter;
import java.io.IOException;

public class SaveTreeFile implements SaveTree {
    private String fileName = "ftree.txt";

    public void setFileName (String fileName) {
        this.fileName = fileName;
    }

    public String getFileName () {
        return this.fileName;
    }

    @Override
    public void saveTree(String tree) {
        try (FileWriter file = new FileWriter(fileName)) {
            file.append(tree);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
