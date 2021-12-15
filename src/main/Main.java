package main;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		ProfileMap pMap = new ProfileMap();
		try (BufferedReader br = new BufferedReader(new FileReader("profiles.csv"))) {
		    String line;
		    while ((line = br.readLine()) != null) {
		        String[] values = line.split(",");
		        Profile p = new Profile();
		        p.airport = values[0];
		        p.flight = values[1];
		        p.agegroup = values[2];
		        p.sex = values[3];
		        p.citizenship = values[4];
		        p.name = values[5];
		        pMap.addProfile(p);
		        System.out.println(p.toString() + "|" + p.name);
		    }
		    
		    for (String s : pMap.profiles.keySet()) {
		    	System.out.println(s);
		    }
		    
		    System.out.println(pMap.matchString("BNE|QF123|C|M|DEN"));
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
