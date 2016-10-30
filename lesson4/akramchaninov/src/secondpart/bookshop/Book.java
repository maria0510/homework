package secondpart.bookshop;

import secondpart.bookshop.Author;

public class Book {

  public String name;
  public String[] authors;
  public int price;

  public Book (String name, int price, Author ...authors) {
    this.name = name;
    this.price = price;
    this.authors = new String[authors.length];
    for (int i = 0; i < authors.length; i++) {
      this.authors[i] = authors[i].name;
    }
  }

  public String toString() {
    String str = name + " by " + arraytoString(authors) + " costs " + price + " UAH ";
    return str;
  }

  public boolean equals(Object that) {
    if (this == that) return true;
    return equalTo((Book)that);
  }

  public boolean equalTo(Book book) {
    return (name == book.name && price == book.price && authors == book.authors);
  }

  private static String arraytoString(String[] array) {
    String arrayString = "";
    for (int i = 0; i < array.length; i++) {
      arrayString += array[i];
      if (i != array.length - 1)
        arrayString += " and ";
    }
    return arrayString;
  }

}
