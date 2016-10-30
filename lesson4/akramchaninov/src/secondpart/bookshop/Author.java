package secondpart.bookshop;

public class Author {

  public String name;
  public String email;

  public Author (String name, String email) {
    this.name = name;
    this.email = email;
  }

  public String toString() {
    String str = name + ". " + name + "'s e-mail is " + email;
    return str;
  }

  public boolean equals(Object that) {
    if (this == that) return true;
    return equalTo((Author)that);
  }

  public boolean equalTo(Author author) {
    return (name == author.name && email == author.email);
  }

}
