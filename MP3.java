import java.util.LinkedList;


public class MP3 {
    // -songList:LinkedList<Song>
    // -currentSongIndex:int


    // Default Constructor


    // Add a song to the MP3 player
    // addSong(Song song) method to songList




    // Play the current song
    // for a method play() with void return
    // TODO: Check if the song list is empty
    // If there are no songs in the list, print "No songs available to play." and return
        // TODO: Retrieve the current song from the songList using currentSongIndex
        // Make sure the index is within bounds before accessing the song
        // TODO: Print the details of the current song in a user-friendly format
        // The Song class's toString() method will be used to display the song details




    // Play the next song
    // public void next() 
        // TODO: Check if the song list is empty before attempting to change the index.
        // - If empty, print a message and return immediately to avoid errors.
            // Prevent further execution if the list is empty
        // TODO: Update the `currentSongIndex` to the next song.
        //       - Use modular arithmetic to cycle back to the beginning when reaching the end.
        //       - Ensure that `currentSongIndex` is always within the valid range [0, songList.size() - 1].
        // TODO: Call the `play` method to start playing the next song.
        //       - Assumes `play()` correctly handles playing the song at `currentSongIndex`.




    // Play the previous song
    // public void previous()
        // TODO: Check if the song list is empty before attempting to change the index.
        // - If empty, print a message and return immediately to avoid errors.
            // Prevent further execution if the list is empty
        // TODO: Update the `currentSongIndex` to the previous song.
        //       - Use modular arithmetic to cycle back to the last song when reaching the beginning.
        //       - The formula `(currentSongIndex - 1 + songList.size()) % songList.size()` ensures
        //         that subtraction does not result in a negative index.
        // TODO: Call the `play` method to start playing the previous song.
        //       - Assumes `play()` correctly handles playing the song at `currentSongIndex`.




    /************* Please uncomment this to the end
    // Custom toString method to display each song in an individual box and link them visually
    @Override
    public String toString() {
        if (songList.isEmpty()) {
            return "No songs available.";
        }

        StringBuilder sb = new StringBuilder();
        String boxTop = "+---------------------------+---------------------------+----------------+\n";
        String boxMid = "|          Title            |          Artist           |   Duration     |\n";

        for (int i = 0; i < songList.size(); i++) {
            Song song = songList.get(i);
            sb.append(boxTop);
            sb.append(boxMid);
            sb.append(boxTop);
            sb.append(formatSong(song));

            // If there is another song after, show the linking arrow (for LinkedList representation)
            if (i < songList.size() - 1) {
                sb.append("         |\n         v\n");
            }
        }

        sb.append(boxTop);
        return sb.toString();
    }

    // Helper method to format the song details into box display
    private String formatSong(Song song) {
        String title = String.format("| %-25s ", truncate(song.getTitle(), 25));
        String artist = String.format("| %-25s ", truncate(song.getArtist(), 25));
        String duration = String.format("| %-14.2f |\n", song.getDuration());
        return title + artist + duration;
    }

    // Helper method to truncate text if it exceeds the given length
    private String truncate(String text, int maxLength) {
        if (text.length() > maxLength) {
            return text.substring(0, maxLength - 3) + "...";
        }
        return text;
    }
    ****************/ 
}
