public class Author{
  String name = "";
  String email = "";

  public Author(String name, String email){
    this.name = name;
    this.email = email;
  }

  public String toString(){
    return "Name and Surname - " + name + "\n" +
          "email - " + email;
  }
  public boolean equals(Author author){
    return this.name == author.name && this.email == author.email;
  }
}
