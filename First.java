//import java.io.InputStream;

//import java.lang.*; By Default
class Second{
    // public , static , void keywords
    // public - access outside the folder (Package)
    // static - load when class is loaded.
    // void - no return
    // main  - Entry point of Java Program
    // ... var args (Java 1.5)
    // String ...arr or String args[] or String [] args
    // but all things are called Command Line Arguments

    static void main(){
      System.out.println("My Main Fn");
    }
public static void main(String ...arr){
    //System s = new System();
    //InputStream is = System.in; // Input
    //is.read();
    //System.in.read(); // Single Byte Input
    System.out.println("Hello Java ");
    main();
    //System.err.println("Error");
}
}