Hometask
#1
 +| Left | Op | Right | Result |
 +| :---:  | :---:  | :---:  | :---:  |
 +| AND |  |  |  |
 +| 0 | & | 0 | 0 |
 +| 0 | & | 1 | 0 |
 +| 1 | & | 0 | 0 |
 +| 1 | & | 1 | 1 |
 +| OR |  |  |  |
 +| 0 | \| | 0 | 0 |
 +| 0 | \| | 1 | 1 |
 +| 1 | \| | 0 | 1 |
 +| 1 | \| | 1 | 1 |
 +| XOR |  |  |  |
 +| 0 | ^ | 0 | 0 |
 +| 0 | ^ | 1 | 1 |
 +| 1 | ^ | 0 | 1 |
 +| 1 | ^ | 1 | 0 |
 +| NOT |  |  |  |
 +| n/a  | ~ | 0 | 1 |
 +| n/a  | ~ | 1 | 0 |
 
#2
Masha@Masha--- MINGW32 /c/homework/lesson3/msergeeva (master)
$ javac src/lesson3/secondprogram/Hometask_BitWiseCalc.java -d out && java -cp o                                                                                                                ut lesson3.secondprogram.BitwiseCalc
Bitwise operator &: 1010
Bitwise operator |: 101111
Bitwise operator ^: 100101
Bitwise operator ~: 11111111111111111111111111010101

#3
+Masha@Masha--- MINGW32 /c/homework/lesson3/msergeeva (master)
+$ javac src/lesson3/secondprogram/SecondHometask.java -d out
+
+Masha@Masha--- MINGW32 /c/homework/lesson3/msergeeva (master)
+$ java -cp out lesson3.secondprogram.SecondHometask
+Integer = 25
+Fnumber = 6.25
+Dnumber = 0.255555
+Stroka: It's an example!

#4
Masha@Masha--- MINGW32 /c/homework/lesson3/msergeeva (master)
$ java -cp out lesson3.secondprogram.SecondHometask1
Array: { 1 2 3 }
The new array with copyOf: { 1 2 3 0 0 }
The new array with copyOfRange: { 3 0 0 }
The fill array: { 8 8 8 8 8 }

