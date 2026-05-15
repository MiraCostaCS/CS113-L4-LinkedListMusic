# Lab #4 - MP3 Player Lab

## Project Overview
In this lab, you will develop an MP3 player using Object-Oriented Programming (OOP) principles. The system will simulate an MP3 player that can store a list of songs, play them, and allow users to navigate between songs. You will implement basic functionality for adding songs, playing the current song, and moving to the next or previous song in a circular playlist. This lab will help reinforce your understanding of OOP concepts such as classes, objects, methods, and the use of linked lists to store and manage data.

## Objectives
*   Implement fundamental OOP concepts such as classes, objects, methods, and constructors.
*   Design and implement a linked list to manage a collection of songs.
*   Apply encapsulation to protect the attributes of the `Song` and `MP3` classes.
*   Use the `toString()` method to display formatted data to the user.
*   Implement basic playlist navigation, including the ability to play the next and previous songs.
*   Demonstrate the usage of helper methods for code organization and clarity.

## Part 1: Class Design
### 1. Create the `Song` Class
- Attributes:
  *   `title` (String): The title of the song.
  *   `artist` (String): The artist who performed the song.
  *   `duration` (double): The duration of the song in minutes.
- Methods:
  *   Constructor: Initializes all attributes (`title`, `artist`, `duration`).
  *   Getters: Provide access to the song's `title`, `artist`, and `duration`.
  *   `toString()`: Returns a string representation of the song in the format `"Song: [title] by [artist] ([duration] minutes)"`.

### 2. Create the `MP3` Class
- Attributes:
  *   `songList` (LinkedList): A linked list to store the songs.
  *   `currentSongIndex` (int): The index of the current song being played in the playlist.
- Methods:
  *   Constructor: Initializes the `songList` as an empty linked list and sets the `currentSongIndex` to 0.
  *   `addSong(Song song)`: Adds a new song to the playlist. Ensure the song is not null before adding it.
  *   `play()`: Plays the current song. If the list is empty, print "No songs available to play."
  *   `next()`: Plays the next song in the playlist in a circular manner. If the list is empty, print "No songs available to play."
  *   `previous()`: Plays the previous song in the playlist in a circular manner. If the list is empty, print "No songs available to play."
  *   `toString()`: Returns a formatted string displaying all songs in the playlist in a box-like format. If the list is empty, return "No songs available."
- Helper Methods:
  *   `formatSong(Song song)`: Formats a single song’s details into a box display.
  *   `truncate(String text, int maxLength)`: Truncates text if it's too long and adds ellipses.

## Part 2: Implementing the MP3 Player
### 1. Testing the MP3 Player:
*   Create several `Song` objects with different attributes (e.g., title, artist, duration).
*   Instantiate an `MP3` object.
*   Add the songs to the MP3 player using the `addSong()` method.
*   Print the playlist using the `toString()` method to display all songs.
*   Test the `play()`, `next()`, and `previous()` methods to ensure that the song navigation works as expected.
        
### 2. Edge Case Handling:
*   Ensure that when the song list is empty, the program prints a suitable message ("No songs available to play.") and doesn't throw errors when trying to play or navigate songs.
        

## Part 3: Testing the System in `MyProgram`

### 1.  Create and Test Song Objects:
*   Instantiate several `Song` objects with different titles, artists, and durations.
*   Add these songs to the MP3 player using the `addSong()` method.
### 2.  Display Playlist:
*   Print out the playlist using the `toString()` method to confirm that songs are listed in a formatted, box-like structure.
### 3.  Test Navigation:
*   Test the `play()` method by calling it to play the current song.
*   Test the `next()` method to see if it moves to the next song in the playlist.
*   Test the `previous()` method to see if it moves to the previous song in the playlist.
### 4.  Edge Case Testing:
*   Test with an empty playlist to ensure proper handling of empty cases.

## Reflection Questions
1.  How does using a linked list improve the management of songs in the MP3 player?
2.  Why is it important to ensure the song list is not empty before attempting to play or navigate songs?
3.  How does encapsulation protect the data within the `Song` and `MP3` classes?
4.  How does the use of helper methods improve the readability and maintainability of the code?

### Submission:
*   Ensure all `TODO` sections in the starter code are completed.
*   Run and test the program to verify correct output.
*   Submit the final `.java` file with proper comments and indentation.
