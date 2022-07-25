package sg.edu.rp.c346.id21012434.ndpthemesong;

import java.io.Serializable;

public class Song implements Serializable {

    private int id;
    private int year;
    private String songContent;

    public Song( int id, int year, String songContent  ) {
        this.year = year;
        this.id = id;
        this.songContent = songContent;
    }

    public int getId() {  return id;  }

    public String getSongContent() { return songContent; }

    public void setSongContent(String songContent) {
        this.songContent = songContent;
    }

    @Override
    public String toString() { return "ID:" + id + ", " + songContent;  }

}
