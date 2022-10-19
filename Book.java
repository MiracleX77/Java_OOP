import java.util.ArrayList;

public class Book {
    private String title;
    private ArrayList<String> authors;
    
    public  String getTitle(){
        return title;
    }
    public ArrayList<String> getAuthors(){
        return authors;
    }

    public void addAuthor(String name){
       authors.add(name);
    }
}
