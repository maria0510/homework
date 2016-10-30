package secondpart;

import secondpart.bookshop.Book;
import secondpart.bookshop.Author;

class Main {

  public static void main(String ...args) {
    Author author1 = new Author("Bruce Eckel", "bruceeckel@gmail.com");
    Author author2 = new Author("Kathy Sierra", "kathy_sierra@gmail.com");
    Author author3 = new Author("Bert Bates", "bbates@gmail.com");
    Author author4 = new Author("Bert Bates", "bbates@gmail.com");
    System.out.println(author1.toString());
    System.out.println(author2.toString());
    System.out.println(author3.toString());

    printAuthorsEqualityState(author1, author2);
    printAuthorsEqualityState(author3, author4);

    Book book1 = new Book("Thinking in Java", 500, author1);
    Book book2 = new Book("Head First Java", 400, author2, author3);
    Book book3 = new Book("Head First Java", 400, author2, author3);
    System.out.println(book1.toString());
    System.out.println(book2.toString());

    printBooksEqualityState(book1, book2);
    printBooksEqualityState(book2, book3);
  }

  public static void printAuthorsEqualityState(Author auth1, Author auth2) {
    System.out.print(auth1.name + " and " + auth2.name);
    if (auth1.equals(auth2)) {
      System.out.println(" are the same people");
    } else {
      System.out.println(" are not the same people");
    }
  }

  public static void printBooksEqualityState(Book book1, Book book2) {
    System.out.print(book1.name + " and " + book2.name);
    if (book1.equals(book2)) {
      System.out.println(" are the same books");
    } else {
      System.out.println(" are not the same books");
    }
  }

}
