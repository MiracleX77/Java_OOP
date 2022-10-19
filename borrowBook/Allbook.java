package borrowBook;


import java.util.ArrayList;

public class Allbook {
    ArrayList<String> data_book = new ArrayList<>();
    ArrayList<String> borrow_book = new ArrayList<>();
    public String getData_book(int i) {
        return data_book.get(i);
    }

    public void addData_book(String name) {
        this.data_book.add(name);
    }

    public int countBook(){
        return data_book.size();
    }

    public boolean checkBook(String namebook){
        if(data_book.indexOf(namebook)==-1){
            return false;
        }
        else{

            data_book.remove(data_book.indexOf(namebook));
            borrow_book.add(namebook);
            return true;
        }
    }
    

    

}
