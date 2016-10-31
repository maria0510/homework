class PascalsTriangle{
  public static void main(String[] args) {
    PascalsTriangleClass triangle = new PascalsTriangleClass(5);
    triangle.print();
    triangle.print("ODD");
    triangle.print("EVEN");
    triangle.print("WRONG");
  }

}

class PascalsTriangleClass{
int n;
  public PascalsTriangleClass(int n){
    this.n = n;
  }

  public void print(){
    for (int i = 0; i < n; i++) {
      System.out.print(spaces (n - i));
      for (int j = 0; j < i + 1; j++){
        System.out.print (triangleEntry (i, j) + " ");
      }
      System.out.println();
    }
  }

  public void print(String filter){
    if (filterIsEven (filter)){
      for (int i = 0; i < n; i++) {
        System.out.print(spaces (n - i));
        for (int j = 0; j < i + 1; j++){
          if(triangleEntry (i, j) % 2 == 0){
            System.out.print ("*" + " ");
          }
          else{
            System.out.print (triangleEntry (i, j) + " ");
          }
        }
        System.out.println();
      }
    }
    else if (filterIsOdd (filter)){
      for (int i = 0; i < n; i++) {
        System.out.print(spaces (n - i));
        for (int j = 0; j < i + 1; j++){
          if(triangleEntry (i, j) % 2 != 0){
            System.out.print ("*" + " ");
          }
          else{
            System.out.print (triangleEntry (i, j) + " ");
          }
        }
        System.out.println();
      }
    }
    else{
      System.out.print ("Wrong filter!!!");
    }

  }


  private String spaces( int num){
    String space = "";
    for (int i = num; i > 0 ; i--) {
      space += " ";
    }
    return space;
  }

  private int factorial (int num){
    if (num == 0){
      return 1;
    }
    return factorial(num - 1) * num;
  }

  private int triangleEntry (int row, int term){
    return factorial (row) / (factorial (term) * factorial (row - term));
  }

  private boolean filterIsEven (String filter){
    return filter == "EVEN";
  }

  private boolean filterIsOdd (String filter){
    return filter == "ODD";
  }
}
