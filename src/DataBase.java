import java.io.BufferedReader;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class DataBase {

    public static Movie[] SearchMovie(String title) throws IOException {
        Movie[] movieList = new Movie[3];

        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8kk/" + title);

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        JsonNode tree = map.readTree(in);
        System.out.println(tree.toPrettyString());
        for (int i = 0; i < tree.size(); i++) {
            if(i < 3) {
            //System.out.println(tree.get("results").get(i).get("description").asText());

            movieList[i] = new Movie(tree.get("results").get(i).get("title").asText(),
                    tree.get("results").get(i).get("description").asText());
            } else {
                break;
            }
        }
        return movieList;
    }

    public Movie SearchMovieByTitle(String title) throws IOException {
        URL oracle = new URL(
                "https://imdb-api.com/en/API/SearchMovie/k_mcx0w8kk/" + title);

        InputStream in = oracle.openStream();

        ObjectMapper map = new ObjectMapper();

        Movie finalMovie = new Movie(title, title, title, null, 0, title, 0, 0);
        JsonNode tree = map.readTree(in);
        System.out.println(tree.toPrettyString());
        for (int i = 0; i < tree.size(); i++) {
            if(i < 3) {
            //System.out.println(tree.get("results").get(i).get("description").asText());

            //movieList[i] = new Movie(tree.get("results").get(i).get("title").asText(),
                    //tree.get("results").get(i).get("description").asText());
            } else {
                break;
            }
        }
        return finalMovie;
    }
}
