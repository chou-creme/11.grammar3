import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.*;

public class TextReader {
    private String path;

    private static Logger logger = Logger.getLogger(TextReader.class.getName());

    public enum Mark{
        START,END
    };
    
    private TextReader(String path) {
        this.path = path;
    }

    private void execute() {
        List<String> valueList = new ObjectList<>();

        try (fr = new FileReader(path);
            br = new BufferedReader(fr)){
            String line= null;
            while ((line = br.readLine()) != null) {
                valueList.add(Integer parseInt(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } 
        
        for (int size: valueList) {
            System.out.println(value);
        }
    }

    public static void main(String... args) {
        logger.info(Mark.START.name());
        new TextReader(args[0]).execute();
        logger.info(Mark.END.name());
    }

}