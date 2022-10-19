package borrowBook;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        Allbook book = new Allbook();
        book.addData_book("bo1");
        book.addData_book("bo2");
        book.addData_book("bo3");
        System.out.println("please input yourname: ");
        String name_user = myObj.nextLine();
        System.out.println("Hello "+name_user+" Book your can borrow is: ");
        while (true){
            for (int i=0;i<book.countBook();i++){
                System.out.print(book.getData_book(i)+" ");
    
            }
            System.out.println("\nWhich book your borrow?");
            String name_book = myObj.nextLine();
            book.checkBook(name_book);
            if (book.countBook()==0){
                break;
            }
        }
        
       

        
    }
    
}
