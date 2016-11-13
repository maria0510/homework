package main.java;

import java.util.Arrays;
	
public class PascalTriangle{
  public int n;
  public int[][] triangle;
	
  public PascalTriangle(int n){
    this.n = n;
    triangle = new int[n][n];
  }
  public void calculation(){
    for(int k = 0; k < n; k++){
      triangle[k][0] = triangle[k][k] = 1;
      for(int a = 1; a <= k; a++){
	triangle[k][a] = triangle[k-1][a-1] + triangle[k-1][a];
      }	
    }
  }
  public void print(){
    int b = n;
    for(int i = 0; i < n; i++){
      for(int j = 0; j <= i; j++){
	if(j == 0){
	  for(int a = 0; a <= b; a++){
	    System.out.print(" "); 
	  }
	}
        if(triangle[i][j] == 0){
	  System.out.print(" *"); 
	} else {			
	    System.out.print(" " + triangle[i][j]);
	  }
      }
      System.out.println();
      b--;			
    }	
  }
  public void print(String filter){
    if (filter == "even"){
      even();
      print();
    } 
    if (filter == "odd") {
      odd();
      print();
    } 
  }
  private void even(){
    for(int k = 0; k < n; k++){
      for(int a = 0; a <= k; a++){
	if (triangle[k][a] % 2 == 0)
	  triangle[k][a] = 0;
      }	
    }
  }
  private void odd(){
    for(int k = 0; k < n; k++){
      for(int a = 0; a <= k; a++){
	if (triangle[k][a] % 2 != 0)
	  triangle[k][a] = 0;
      }	
    }
  }
}	
	
