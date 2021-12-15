package main;
import java.util.HashMap;
import java.util.Map;

public class ProfileMap {
	public Map<String, String> profiles = new HashMap<>();
	public void addProfile(Profile profile) {
		profiles.put(profile.toString(), profile.name);
	}
	public String matchString(String toMatch) {
		return profiles.get(toMatch);
	}
}
