import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
// class SortByTitle implements Comparator<Song>{

//     @Override
//     public int compare(Song o1, Song o2) {
//         // TODO Auto-generated method stub
//         return o1.getTitle().compareTo(o2.getTitle());
//     }

// }
class Song implements Comparable<Song>{
    private String title;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
    private String artistName;
    private String photo;

    @Override
    public int compareTo(Song song){
        return this.artistName.compareTo(song.artistName);
    }

    // Constructor - When Object is created...
    Song(String title, String artistName, String photo){
        this.title = title;
        this.artistName = artistName;
        this.photo = photo;
    }
    @Override
    public String toString(){
            return "Title "+title +" AristName "+artistName+" Photo "+photo;
    }
    // song this
    // songs o songs[index]
    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }
        if(o instanceof Song){
            Song song = (Song) o; // Casting // Downcasting
            if(this.artistName.equals(song.artistName)
            && this.title.equals(song.title)
            && this.photo.equals(song.photo)){
                return true;
            }
        }
        return false;
    }
}

class Demo1{
    public static void main(String[] args) {

        ArrayList<Song> songs = new ArrayList<>();
        Song song = new Song("ABc","xyz","abcd.jpg");
        songs.add(song);
        songs.add(new Song("Q","q","q.png"));
        // Searching
        boolean result= songs.contains(new Song("ABc","xyz","abcd.jpg"));
        System.out.println(result?"Found":"Not Found");
        System.out.println(songs);
        //ArrayList list = new ArrayList(); // Java 1.4
        // list.add(10);
        // list.add("Amit");
        // list.add(10.20);
        //ArrayList<String> list = new ArrayList<String>(); // Java 1.5
        ArrayList<String> list = new ArrayList<>(200); // Java 1.7
        list.add("Amit");
        list.add("Ram");
        list.contains("Amit");
        list.add(0, "Ramesh");
        System.out.println(list.toString()); // list.toString()
        //list.remove(0);
        //list.remove("Ram");
        int e [] = new int[100];

        // Sorting
        Collections.sort(list); // List<String>
        //Collections.sort(songs); // List<Song> Comparable
       // Collections.sort(songs, new SortByTitle());
       Collections.
       sort(
           songs,(a,b)->a.getArtistName().compareTo(b.getArtistName()));


        // int arr[]= {90,10,66,44,22};
    }
}