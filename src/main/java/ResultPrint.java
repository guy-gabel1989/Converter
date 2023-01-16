import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResultPrint {
    void resultPrint() throws IOException {

        String filePath = "Result List";
        String resultsPrint = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(resultsPrint);
    }

}
