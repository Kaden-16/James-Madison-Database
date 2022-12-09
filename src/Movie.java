
public class Movie {

    private String title;
    private int year;
    private String director;
    private String imageLink;
    private Actor[] actorList;
    private String imDbRating;
    // Might not be able to do it
    private String movieRating;
    private String id;
    private String plot;

    public Movie(String title, String director, String id, String poster,
            Actor[] actorList, String imDbRating, String movieRating,
            String year, String plot) {
        this.title = title;
        this.director = director;
        this.id = id;
        this.imageLink = poster;
        this.actorList = actorList;

        if (movieRating != "null") {
            this.imDbRating = imDbRating;

        } else {
            this.imDbRating = "No IMDB Rating";
        }

        if (movieRating != "null") {
            this.movieRating = movieRating;

        } else {
            this.movieRating = "Content rating is unknown at this time";
        }
        this.plot = plot;

        if (year != "null" && !year.isEmpty()) {
            try {
                if (year.contains("(")) {
                    this.year = Integer.parseUnsignedInt(year.substring(
                            year.indexOf("(") + 1, year.indexOf(")")));

                } else {
                    this.year = Integer.parseUnsignedInt(year.substring(0, 4));
                }
            } catch (NumberFormatException ex) {
                this.year = 0;
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getPoster() {
        return imageLink;
    }

    public String getPlot() {
        return plot;
    }

    public Actor[] getActorList() {
        return actorList;
    }

    public String getIMDBRating() {
        return imDbRating;
    }

    public String getMovieRating() {
        return movieRating;
    }

    public String getID() {
        return id;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return title;
    }
}
