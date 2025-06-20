package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Playlist {
    List<Song> songs;
    public Playlist() {
        songs = new ArrayList<Song>();
    }
    public void addItem(Song item) {
        songs.add(item);
    }
    public Iterator<Song> iterator() {
        return new PlaylistIterator();
    }
    class PlaylistIterator implements Iterator<Song> {
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= songs.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Song next() {
            return songs.get(currentIndex++);
        }

        @Override
        public void remove() {
            songs.remove(--currentIndex);
        }
    }

}
