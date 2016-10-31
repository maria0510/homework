public class Main {
  public static void main(String ...args) {
    Author author1 = new Author("Ivan Petrov", "ivan@gmail.com");
    Author author2 = new Author("Semen Gorbushka", "sema@gmail.com");
    Author author3 = new Author("Viktor Pelevin", "viktor@gmail.com");
    Author author4 = new Author("Viktor Pelevin", "viktor@gmail.com");
    Book book1 = new Book("Endless journey", 20.0);
    Book book2 = new Book("Gereration P", 15.0);
    Book book3 = new Book("Gereration P", 15.0);
    book1.addAuthor(author1);
    book1.addAuthor(author2);
    book2.addAuthor(author3);
    book3.addAuthor(author3);
    System.out.println(book1.toString());
    System.out.println(book2.toString());
    System.out.println(author1.toString());
    System.out.println(author1.equals(author2));
    System.out.println(author3.equals(author4));
    System.out.println(book1.equals(book2));
    System.out.println(book2.equals(book3));

    }
}
