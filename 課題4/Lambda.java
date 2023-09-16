import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.IntStream;

public class Lambda{
    private static final DateTimeFormatter FORMATER=DateTimeFormatter.ofPattern("HH:mm:ss.SSS");

    public static void main(String[] args){
        IntStream stream = IntStream.range(1,10000);
        stream.forEach(range -> System.out.println(FORMATER));
    }
    private static String currentTime(){
        return FORMATER.format(LocalDateTime.now());
    }
}