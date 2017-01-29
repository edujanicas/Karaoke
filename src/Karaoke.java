import com.elementary.model.Song;
import com.elementary.model.SongBook;

/**
 * Created by ejanicas on 29/01/17.
 */
public class Karaoke {
    public static void main(String[] args) {
        Song song = new Song(
                "Michael Jackson",
                "Beat It",
                "https://youtu.be/Q8aJsrgvVao"
        );

        SongBook songBook = new SongBook();
        System.out.printf("Adding %s %n", song);
        songBook.addSong(song);
        System.out.printf("There are %d songs. %n", songBook.getSongCount());
    }
}
