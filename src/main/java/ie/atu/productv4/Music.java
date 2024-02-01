package ie.atu.productv4;

public class Music extends Product{

    private String Artist,Label;

    public Music() {
        super();
        Artist = "";
        Label = "";
        count++;
    }

    public void setArtist(String Artist) {
        this.Artist = Artist;
    }

    public String getArtist() {
        return Artist;
    }

    public void setLabel(String Label) {
        this.Label = Label;
    }

    public String getLabel() {
        return Label;
    }

    @Override
    public String toString() {
        return super.toString() + " by " + Artist + "\n"+ Label;
    }
}

