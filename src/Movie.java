public class Movie extends Video{
    public Movie(String name, String genre, String returnDate) {
        super(name, genre, returnDate);
    }

    @Override
    void HasSubtitles() {
        System.out.println("YES,all the movies have subtitles");
    }
}
