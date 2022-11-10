import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DataBaseTest {


    @Test
    public void SearchMovieByIDTest() throws Exception {
        Movie test = DataBase.SearchMovieByID("tt0076759");
        assertEquals(test.getTitle(), "Star Wars: Episode IV - A New Hope");
        assertEquals(test.getYear(), 1977);
        assertEquals(test.getID(), "tt0076759");
        assertEquals(test.getDirector(), "George Lucas");
        assertEquals(test.getMovieRating(), "PG");
        assertEquals(test.getIMDBRating(), "8.6");
        // assertEquals(test.getActorList(), "8.6");

    }

}
