public class MyProgram {
    public static void main(String[] args) {
        // TODO: Create song objects with a title, artist, and duration.
        //       - Ensure the `Song` class has an appropriate constructor.
        //       - Each song should have a unique title, artist, and duration.
        //       - Please add four songs that identify you as a person/background/culture
        Song song1 = new Song("México en la Piel", "Luis Miguel", 3.48);


        // TODO: Create an `MP3` player instance.
        //       - Ensure the `MP3` class has a default constructor.
        //       - This instance will be used to manage and play songs.
        MP3 myMP3 = new MP3();

        // TODO: Add songs to the `MP3` player.
        //       - Ensure that the `addSong` method correctly adds songs to the internal data structure (e.g., a `LinkedList`).
        //       - Songs should be added in the order they are created.
        //       - Do this for the four songs
        myMP3.addSong(song1);


        // TODO: Display all songs currently stored in the MP3 player.
        //       - The `toString` method of `MP3` should return a string representation of all songs.
        //       - Ensure that the `toString` method correctly formats the output.
        System.out.println(myMP3);
    }
}
