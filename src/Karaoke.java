import com.elementary.model.Song;
import com.elementary.model.SongBook;

import com.elementary.KaraokeMachine;

/**
 * Created by ejanicas on 29/01/17.
 */
public class Karaoke {
    public static void main(String[] args) {
        SongBook songBook = new SongBook();
        songBook.importFrom("songs.txt");
        KaraokeMachine karaokeMachine = new KaraokeMachine(songBook);
        karaokeMachine.run();
        System.out.println("Saving book....");
        songBook.exportTo("songs.txt");
    }
}
