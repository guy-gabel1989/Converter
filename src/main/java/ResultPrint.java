import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ResultPrint {
    void resultPrint() throws IOException {

        //file path for the file the holds all the calculations
        String filePath = "Result List";
        //prints evrything that's in the Result List file
        String resultsPrint = new String(Files.readAllBytes(Paths.get(filePath)));
        System.out.println(resultsPrint);
    }

}
