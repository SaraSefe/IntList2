public abstract class Video {
    String name;
    String Genre;
    int returnDate;

    abstract void HasSubtitles();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String genre) {
        Genre = genre;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    public Video(String name, String genre, String returnDate) {
        this.name = getName();
        Genre = getGenre();
        this.returnDate = getReturnDate();
    }
}

