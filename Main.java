import java.util.Arrays;

public class Main{
    
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Bye World");
        // for string datatype give " " on right hand side of =operator
        String name="ansh agarwal";
        System.out.println(name);
        // no need to use " " for int datatype
        int abc=24;
        System.out.println(abc);
        /*  in the line below *final* is keyword 
        (this will declare the variable as "final" or "constant", which means unchangeable and read-only):*/
        final int Mynum =25;
        // now when i try to declare another value to Mynum like 20, it will generate an error
        // Mynum=25;
        String namee= "Ansh";
        System.out.println("Welcome " + namee);
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        int x = 5;
        int y = 6;
        // Print the value of x + y
        System.out.println(x + y); 
        //declaring more than one variable of the same type, you can use a comma-separated list:
        int c = 5,  a= 6, z = 50;
        System.out.println(x + y + z);
        //can also assign the same value to multiple variables in one line
        int t, u, d;
        t = u = d = 50;
        System.out.println(t + u + d);
        //Integer Types -> byte,short,int,long
        //Floating point Types -> float,double
        // byte < short < int < long 
        // whenever using long data type make sure to end the value with a "L"
        long myNumb = 15000000000L;
        System.out.println(myNumb);
        // float << double
        // prefer using double as it has a precision of about 16 digits while float has of around 5-6 digits.
        // use a "f" for float and "d" for double after the value
        // Java has a boolean data type, which can only take the values true or false
        // byte - 1 [-128 to 127]
        // short - 2
        // int - 4
        // long - 8
        // float - 4
        // double - 8
        // char - 2
        // boolean - 1 (true/false)
        // concatenation in java 
        String name1 = "Aman";
        String name2 = "Dhattarwal";
        String name3 = name1 + name2;
        System.out.println(name3);
        //example2- 
        String name11 = "Aman";
        String name21 = "Dhattarwal";
        String name31 = name11 + " is a " + name21;
        System.out.println(name31);
        // Java is a 0 index based language
        String name14 = "Ansh";
        System.out.println(name14.charAt(0));
        // output-> A
        //Replacing in java
        String name15 = "Dhyey";
        String name16 = name15.replace('y', 'x');
        System.out.println(name16);
        //output -> Dhxex
        System.out.println(name15);
        //output -> Dhyey
        // Strings in java are immutable
        // Substring
        String abdc="Ansh and Vansh";
        System.out.println(name.substring(5,8));
        //output -> and
        //Arrays in java
        int[] marks = new int[3];
        marks[0] = 97;
        marks[1] = 95;
        marks[2] = 99;
        System.out.println(marks[2]); 
        //output -> 99
        // to print the lenth of an array  
        System.out.println(marks.length);
        // before sorting 
        // 97, 95 ,99
        // after sorting 
        // 95 ,97 ,99
        Arrays.sort(marks);
        System.out.println(marks[0]);
        // Use new: When you know the size of the array but want to assign values later.
        // Without new: When you know both the size and values at the time of initialization.
        // In Java, the size of an array is fixed when it is created.
        // Once an array is created, you cannot change its size.
        // To overcome this problem, you can use an ArrayList instead of an array.


        // 2D arrays are just like = Matrices in Mathemeatics
        //2d arrays
        int[][] finalmarks = {{97,98,95}, {92,94,99}};
        System.out.println(finalmarks[0][1]);
        // here indexing [0][1] leads to result of the first student as he holds the 0th index and his 1st subjects marks i.e 98
        // output -> 98
        //CASTING
        double price= 100.00;
        double finalPrice = price + 18;
        System.out.println(finalPrice);
        // output -> 118.0
        //Casting in Java refers to the process of converting a variable from one data type to another.
        //Widening (Automatic) Casting: Converting a smaller type to a larger type size.
        //Narrowing (Manual) Casting: Converting a larger type to a smaller type size.


        /* Widening Casting (Automatic): -> IMPLICIT CASTING
        *This type of casting is done automatically by Java.
        *It happens when you convert a smaller data type into a larger data type.
        *There is no risk of data loss because the larger data type can accommodate all the values of the smaller type.
        *byte → short → int → long → float → double */

        /* Narrowing Casting (Manual): -> EXPLICIT CASTING
        *This type of casting needs to be done manually by the programmer.
        *It happens when you convert a larger data type into a smaller data type.
        *There is a risk of data loss because the smaller type may not be able to hold the value from the larger type. 
        *double → float → long → int → short → byte */


}
}           
// single line comment in java
/* multi 
 * line 
 * comment 
 * in 
 * java
 */



 //PRIMITIVE DATA TYPES IN JAVA
 /* 
  * built-in data types provided by Java.
  * They are not objects and store simple values.
    * There are 8 types of primitive data types:
    * byte
    * short
    * int
    * long
    * float
    * double
    * boolean
    * char
    * Primitive data types are predefined by the language and named by a keyword.
  */


  //NON-PRIMITIVE DATA TYPES IN JAVA
  /* 
   * more complex types created by the programmer and include objects, arrays, and other classes.
   * Examples of Non-Primitive Data Types:
    String (e.g., "Hello")
    Arrays (e.g., int[] numbers = {1, 2, 3};)
    Classes (e.g., Student, Employee)
    Interfaces
    Enums
*/

//OPERATORS IN JAVA
// 4 TYPES OF OPERATORS IN JAVA:
// Arithmetic Operators
// Assignment Operators
// Logical Operators
// Bitwise Operators

//ARITHMETIC OPERATORS
// +	Addition	Adds together two values	x + y
// -	Subtraction	Subtracts one value from another	x - y
// *	Multiplication	Multiplies two values	x * y
// /	Division	Divides one value by another	x / y
// %	Modulus	Returns the division remainder	x % y
// ++	Increment	Increases the value of a variable by 1	++x
// --	Decrement	Decreases the value of a variable by 1	--x

int mathss=1;
int mathsss=2;
int sum=mathss+mathsss;
System.out.println(sum);
// output -> 3

//ASSIGNMENT OPERATORS
// =	x = 5	x = 5
// +=	x += 3	x = x + 3
// -=	x -= 3	x = x - 3
// *=	x *= 3	x = x * 3
// /=	x /= 3	x = x / 3
// %=	x %= 3	x = x % 3
// &=	x &= 3	x = x & 3
// |=	x |= 3	x = x | 3
// ^=	x ^= 3	x = x ^ 3
// >>=	x >>= 3	x = x >> 3
// <<=	x <<= 3	x = x << 3



