package lesson3.secondprogram;

class SecondHometask{
   
   public static void main(String[] args) {
       
	   FieldDefaultValuesExample example = new FieldDefaultValuesExample();
	   example.setInteger(25);
	   example.setFnumber(6.25f);
	   example.setDnumber(0.255555);
	   example.setStroka("It's an example!");
	   System.out.println(example);		 
    }
}	
 class FieldDefaultValuesExample{
    public int integer;
	public float fnumber;
	public double dnumber;
	public String stroka;
	
	public void setInteger(int integer){
	   this.integer = integer;
	}
	
	public void setFnumber(float fnumber){
	   this.fnumber = fnumber;
	}
	
	public void setDnumber(double dnumber){
	   this.dnumber = dnumber;
	}
	
	public void setStroka(String stroka){
	   this.stroka = stroka;
	}
	
	public String toString(){
	    return ("Integer = " + integer + "\n" + "Fnumber = " + fnumber + "\n" + "Dnumber = " + dnumber + "\n" + "Stroka: " + stroka);
	}
 }	
	
