import com.elementary.model.Song;
import com.elementary.model.SongBook;

import com.elementary.KaraokeMachine;

/**
 * Created by ejanicas on 29/01/17.
 */
public class Karaoke {
    public static void main(String[] args) {
        SongBook songBook = new SongBook();
        KaraokeMachine karaokeMachine = new KaraokeMachine(songBook);
        karaokeMachine.run();
    }
}
