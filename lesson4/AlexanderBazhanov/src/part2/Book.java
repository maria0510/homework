import java.util.Arrays;
public class Book{
  String name;
  Double price;
  Author[] authors = new Author[20];

  public Book(String name, Double price){
    this.name = name;
    this.price = price;
  }

  public void addAuthor (Author author){
    int count = 0;
    if (author != null) {
      for (int i = 0; count < 1 && i < authors.length; i++) {
        if (authors[i] == null){
          authors[i] = author;
          count++;
        }
      }
    }
    else{
      System.out.print ("No such author, pls enter author first!");
    }
  }

  private String returnAuthors (Author[] array){
    String result = "";
    for (int i = 0; array[i] != null && i < array.length; i++) {
      result += array[i].name + ", ";
    }
    return result;
  }

  public String toString(){
    return "Book name - " + name + "\n" +
          "Book price - " + price + "\n"+
          "Author(s) - " + returnAuthors(authors) + "\n";
  }

  public boolean equals(Book book){
    return this.name == book.name && this.price.equals(book.price) &&
    Arrays.equals(this.authors, book.authors);
  }
}
