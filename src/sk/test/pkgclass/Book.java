/*
Создайте класс Book и Author 
Книгу могут написать много авторов (в классе Book есть поле Author[] authors) 
Создайте конструкторы, get/set (где необходимо сделайте проверку), 
также метод toString() 
Создайте массив из 5 книг
 */
package sk.test.pkgclass;

public class Book {

    String title;

    public Book(String title) {
        this.title = title;
    }

    public static void main(String[] args) {

        Author[] authorArray = {new Author(), // [0]
            new Author(), // [1]
            new Author() // [2]
    };

        System.out.println(authorArray[0].getAuthors()[0]);
        System.out.println(authorArray[0].getAuthors()[1]);

        String test[] = {"Vasin", "Petin", "Vitin", "Fedin"};

        authorArray[1].setAuthors(test);

        System.out.println(authorArray[1].getAuthors()[0]);
        System.out.println(authorArray[1].getAuthors()[1]);
        System.out.println(authorArray[1].getAuthors()[2]);
        System.out.println(authorArray[1].getAuthors()[3]);
        
        
        
        Book book = new Book("Lalala");
        
        
        
        String [] books = new String[5];
        books[0] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[0];
       book.title = "Tututu";
        books[1] = "Title book: " + book.title + " author: " + authorArray[0].getAuthors()[1];
        book.title = "Fufufu";
        books[2] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[0];
        book.title = "Dadada";
        books[3] = "Title book: " + book.title + " author: " + authorArray[1].getAuthors()[1];
        book.title = "Nenene";
        books[4] = "Title book: " + book.title + " authors: " + authorArray[1].getAuthors()[2] + ", " +authorArray[1].getAuthors()[3];
        
        
        for(String x: books){
            System.out.println(x);
        }
    }
    
    public String toString(){
        return title;
    }

}
