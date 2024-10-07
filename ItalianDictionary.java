import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class ItalianDictionary {
    private Path filename = Path.of("C:\\Users\\8293365\\Desktop\\dizionario");
    private Path _path = FileSystems.getDefault().getPath("Desktop", "dizionario.txt");
    public Path path;
    public Path getFilename() {
        return _path;
    }
    ItalianDictionary() {
        path = getFilename();
    }

   /*
     public String getDictionary(Path filename){
       return;
     }
     */


    public void dictPrinter(Path path) throws IOException {
        BufferedReader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
        while((reader.readLine())!= null){
            //reader.lines().forEach(System.out::println);
            try {
                if(reader.readLine().strip().length()==4 ){
                    System.out.println(reader.readLine());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        }
    }

