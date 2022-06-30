public class TVSerie extends Video {
    public TVSerie (String name, String genre, String returnDate) {
        super(name, genre, returnDate);
    }
    TVSerie serie1= new TVSerie("The Haunting of Hill House","horror", "Day 26 of this month" );
    @Override
    void HasSubtitles() {
        if (getGenre() == "horror"){
            System.out.println("Yes, all of our horror series have available subtitles");

        }

    }
}

