import java.io.BufferedReader;
import java.io.FileReader;

public class Main {

	public static void main(String[] args) {
		ProfileMap pMap = new ProfileMap();
		try (BufferedReader br = new BufferedReader(new FileReader("profiles.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        
		    }
		}

	}

}
