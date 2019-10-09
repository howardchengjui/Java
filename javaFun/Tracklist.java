import java.util.HashMap;
import java.util.Set;
public class Tracklist {
    public static void main(String[] args) {
        HashMap<String,String> tracklist = new HashMap<String,String>();
        tracklist.put("Boyfriend","Justin Bieber");
        tracklist.put("THank you,next","Ariana Grande");
        tracklist.put("Mirror","Justin Timberlake");
        tracklist.put("Happy","Pharrel Williams");

        String artist = tracklist.get("Boyfriend");
        System.out.println("The artist is " + artist);

        Set<String> tracks = tracklist.keySet();
        for(String track : tracks){
            System.out.println(track + ":"+ tracklist.get(track));
            // System.out.println(tracklist.get(track));
        }
    }
}
