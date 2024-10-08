# Learning DSA With Java

<h1>Java Program Structure</h1>

<p>This guide explains the basic structure of a Java program. Java is a widely-used programming language that is class-based, object-oriented, and designed to have as few implementation dependencies as possible.</p>

<h2>Basic Java Program Structure</h2>

<pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
</code></pre>

<h3>Explanation:</h3>
<ol>
    <li><strong>public class Main</strong>: This declares a class named <code>Main</code>. In Java, everything happens inside a class, and the class name must match the filename.</li>
    <li><strong>public static void main(String[] args)</strong>: This is the main method, where the execution of the program begins.
        <ul>
            <li><code>public</code>: The method is accessible from outside the class.</li>
            <li><code>static</code>: Allows the method to be called without creating an instance of the class.</li>
            <li><code>void</code>: Indicates that the method does not return any value.</li>
            <li><code>main</code>: The name of the method, which is the entry point for every Java program.</li>
            <li><code>String[] args</code>: Parameters passed to the program from the command line.</li>
        </ul>
    </li>
    <li><strong>System.out.println()</strong>: This line prints output to the console.
        <ul>
            <li><code>System</code>: A built-in class that provides access to system-level functionalities.</li>
            <li><code>out</code>: Refers to the standard output stream.</li>
            <li><code>println()</code>: Prints a message followed by a new line.</li>
        </ul>
    </li>
</ol>

<h2>Key Points:</h2>
<ul>
    <li>Every Java program must have a <code>main</code> method for execution.</li>
    <li>Java is case-sensitive, so <code>Main</code> and <code>main</code> are different identifiers.</li>
    <li>Code inside <code>{}</code> defines the scope of the class or method.</li>
</ul>

<h2>Running the Program</h2>
<ol>
    <li><strong>Compile the Program</strong>: Use the <code>javac</code> command to compile the program.
        <pre><code>javac Main.java</code></pre>
    </li>
    <li><strong>Run the Program</strong>: Use the <code>java</code> command to run the compiled program.
        <pre><code>java Main</code></pre>
    </li>
</ol>

<p>You should see the following output:</p>
<pre><code>Hello, World!</code></pre>

<h2>More Examples</h2>
<p>Here are a few more basic Java programs to help you understand the structure better:</p>

<h3>Example 1: Print Your Name</h3>
<pre><code>public class Main {
    public static void main(String[] args) {
        System.out.println("My name is John!");
    }
}
</code></pre>

<h3>Example 2: Add Two Numbers</h3>
<pre><code>public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum is: " + sum);
    }
}
</code></pre>

<h1>Variables and Data Types in Java</h1>

<p>In Java, variables are containers that store data values. Java is a statically-typed language, meaning you must declare the type of a variable before using it. There are two main categories of data types in Java: <strong>primitive types</strong> and <strong>non-primitive types</strong>.</p>

<h2>1. Primitive Data Types</h2>

<p>Primitive data types are the most basic types of data in Java. There are 8 primitive data types:</p>
<ul>
    <li><strong>int</strong>: Stores integers (whole numbers), without decimals. Example: <code>int x = 10;</code></li>
    <li><strong>double</strong>: Stores floating-point numbers (numbers with decimals). Example: <code>double y = 20.5;</code></li>
    <li><strong>char</strong>: Stores a single character. Example: <code>char grade = 'A';</code></li>
    <li><strong>boolean</strong>: Stores a value of either <code>true</code> or <code>false</code>. Example: <code>boolean isJavaFun = true;</code></li>
    <li><strong>byte</strong>: Stores whole numbers from -128 to 127. Example: <code>byte b = 100;</code></li>
    <li><strong>short</strong>: Stores whole numbers from -32,768 to 32,767. Example: <code>short s = 5000;</code></li>
    <li><strong>long</strong>: Stores whole numbers from -2^63 to 2^63-1. Example: <code>long l = 15000000000L;</code></li>
    <li><strong>float</strong>: Stores floating-point numbers with less precision than double. Example: <code>float f = 5.75f;</code></li>
</ul>

<h2>2. Non-Primitive Data Types</h2>

<p>Non-primitive types (also known as reference types) include classes, arrays, and interfaces. One of the most commonly used non-primitive types is the <strong>String</strong> class.</p>

<ul>
    <li><strong>String</strong>: Stores a sequence of characters. Example: <code>String name = "John";</code></li>
</ul>

<h2>Examples of Variables</h2>

<h3>Example 1: Integer and Double</h3>
<pre><code>public class Main {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.99;
        System.out.println("Integer: " + x);
        System.out.println("Double: " + y);
    }
}
</code></pre>

<h3>Example 2: String and Boolean</h3>
<pre><code>public class Main {
    public static void main(String[] args) {
        String name = "Alice";
        boolean isStudent = true;
        System.out.println("Name: " + name);
        System.out.println("Is Student: " + isStudent);
    }
}
</code></pre>

<h2>Key Points</h2>
<ul>
    <li>Primitive types store simple values, while non-primitive types store references to objects.</li>
    <li>Variable names in Java are case-sensitive.</li>
    <li>Primitive variables are initialized with default values if not explicitly set.</li>
</ul>

<h1>Java Functions (Methods)</h1>

<p>In Java, a function (also known as a method) is a block of code that performs a specific task. Methods are used to reuse code, increase readability, and break down complex tasks into smaller, manageable pieces.</p>

<h2>1. Defining a Method</h2>

<p>A method in Java is defined using the following syntax:</p>

<pre><code>returnType methodName(parameters) {
    // method body
}
</code></pre>

<p>Example of a simple method:</p>

<pre><code>public class Main {
    // Method to print a greeting message
    public static void greet() {
        System.out.println("Hello, Java!");
    }
    
    public static void main(String[] args) {
        greet();  // Call the greet method
    }
}
</code></pre>

<h2>2. Method Parameters and Return Types</h2>

<p>A method can take input parameters and return a value. The return type specifies what type of value the method returns. If a method does not return a value, it uses the <code>void</code> keyword.</p>

<h3>Example with Parameters and Return Value</h3>

<pre><code>public class Main {
    // Method that takes parameters and returns a value
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        int sum = addNumbers(5, 10);  // Call the method with arguments
        System.out.println("Sum is: " + sum);
    }
}
</code></pre>

<p>In this example:</p>
<ul>
    <li><strong>addNumbers</strong> is a method that takes two parameters (<code>int a</code> and <code>int b</code>), adds them together, and returns the result as an integer.</li>
    <li>The method is called from the <code>main</code> method with the arguments 5 and 10.</li>
</ul>

<h2>3. Method Overloading</h2>

<p>Method overloading allows you to define multiple methods with the same name but with different parameters. The compiler differentiates them based on the number or type of arguments passed.</p>

<h3>Example of Method Overloading</h3>

<pre><code>public class Main {
    // Overloaded method: one takes two int arguments
    public static int addNumbers(int a, int b) {
        return a + b;
    }
    
    // Overloaded method: this one takes three int arguments
    public static int addNumbers(int a, int b, int c) {
        return a + b + c;
    }
    
    public static void main(String[] args) {
        int sum1 = addNumbers(5, 10);      // Calls the first method
        int sum2 = addNumbers(5, 10, 15);  // Calls the second method
        System.out.println("Sum1 is: " + sum1);
        System.out.println("Sum2 is: " + sum2);
    }
}
</code></pre>

<p>Here, the <code>addNumbers</code> method is overloaded to handle two and three parameters.</p>

<h2>4. Return Statement</h2>

<p>The <code>return</code> statement is used to exit from a method and optionally pass a value back to the calling method. If a method has a return type other than <code>void</code>, it must include a return statement that returns a value of that type.</p>

<pre><code>public class Main {
    // Method that returns the square of a number
    public static int square(int number) {
        return number * number;
    }
    
    public static void main(String[] args) {
        int result = square(4);
        System.out.println("Square of 4 is: " + result);
    }
}
</code></pre>

<h2>Key Points</h2>
<ul>
    <li>Methods help you reuse code and divide complex tasks into smaller pieces.</li>
    <li>Methods can accept parameters and return values.</li>
    <li>Method overloading allows you to create multiple methods with the same name but different parameters.</li>
    <li>The <code>return</code> statement is used to return a value from a method.</li>
</ul>

<h1>Classes and Objects in Java</h1>

<p>Java is an object-oriented programming language, which means it revolves around objects. A class is a blueprint for objects, and objects are instances of classes. In this section, we will explore how to define and use classes and objects in Java.</p>

<h2>1. Defining a Class</h2>

<p>A class in Java is defined using the <code>class</code> keyword. It contains fields (attributes) and methods (functions) that define the behavior of the object. Here’s an example:</p>

<!-- <pre><code> -->

```Java
public class Car {
    // Fields (attributes)
    String model;
    String color;
    int year;

    // Constructor
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to display car information
    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}
```
<!-- </code></pre> -->

<h3>Explanation:</h3>
<ul>
    <li><strong>Fields</strong>: These are variables that store the attributes of the class (e.g., <code>model</code>, <code>color</code>, <code>year</code>).</li>
    <li><strong>Constructor</strong>: A constructor is a special method that is called when an object is created. It initializes the object's fields.</li>
    <li><strong>Methods</strong>: Methods define the behavior of the class (e.g., <code>displayInfo()</code> prints the car's details).</li>
</ul>

<h2>2. Creating an Object</h2>

<p>An object is created using the <code>new</code> keyword, followed by a call to the class constructor. Once the object is created, you can access its fields and methods.</p>

<pre><code>public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Toyota Corolla", "Blue", 2020);

        // Call the method to display the car's information
        myCar.displayInfo();
    }
}
</code></pre>

<p>In this example:</p>
<ul>
    <li><strong>myCar</strong> is an object of the <code>Car</code> class.</li>
    <li>It is initialized using the constructor, and the fields <code>model</code>, <code>color</code>, and <code>year</code> are set.</li>
    <li>The <code>displayInfo()</code> method is called to print the car’s details.</li>
</ul>

<h2>3. Accessing Fields and Methods</h2>

<p>Fields and methods of an object can be accessed using the dot (.) operator. You can also modify the fields directly:</p>

<pre><code>public class Main {
    public static void main(String[] args) {
        // Create an object of the Car class
        Car myCar = new Car("Honda Civic", "Red", 2018);

        // Access and modify fields
        System.out.println("Original Color: " + myCar.color);
        myCar.color = "Black";  // Modify the color field
        System.out.println("New Color: " + myCar.color);

        // Call the method to display the car's information
        myCar.displayInfo();
    }
}
</code></pre>

<h2>4. Constructors in Java</h2>

<p>Constructors are used to initialize objects. In Java, if no constructor is defined, a default constructor is provided by the compiler. You can also define multiple constructors to allow different ways to initialize an object (constructor overloading).</p>

<h3>Example of Constructor Overloading</h3>

<pre><code>public class Car {
    String model;
    String color;
    int year;

    // Constructor 1: With all parameters
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Constructor 2: With model and color only
    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.year = 2021;  // Default year
    }

    public void displayInfo() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using Constructor 1
        Car car1 = new Car("Ford Mustang", "Yellow", 2022);
        car1.displayInfo();

        // Using Constructor 2
        Car car2 = new Car("Tesla Model S", "White");
        car2.displayInfo();
    }
}
</code></pre>

<p>Here, the <code>Car</code> class has two constructors: one with all parameters and another with only the model and color. The second constructor sets a default year.</p>

<h2>Key Points</h2>
<ul>
    <li>A class is a blueprint for objects; an object is an instance of a class.</li>
    <li>Classes contain fields (attributes) and methods (functions).</li>
    <li>Constructors are used to initialize objects. You can overload constructors to provide different ways to initialize objects.</li>
    <li>Objects are created using the <code>new</code> keyword and can access fields and methods using the dot operator.</li>
</ul>

<h1>Access Modifiers in Java</h1>

<p>Access modifiers in Java define the visibility or accessibility of classes, methods, and variables. They determine whether other classes can access a particular member of a class or not. There are four types of access modifiers in Java:</p>

<ul>
    <li><strong>public</strong></li>
    <li><strong>private</strong></li>
    <li><strong>protected</strong></li>
    <li><strong>default</strong> (no modifier)</li>
</ul>

<h2>1. Public</h2>

<p>The <code>public</code> access modifier allows the member to be accessible from anywhere, both inside and outside the class, package, or subclass.</p>

<pre><code>public class Main {
    public String name = "John";  // Public variable

    public void displayName() {   // Public method
        System.out.println("Name: " + name);
    }
}
</code></pre>

<p>In this example, the <code>name</code> variable and <code>displayName()</code> method are accessible from any other class.</p>

<h2>2. Private</h2>

<p>The <code>private</code> access modifier makes members accessible only within the same class. They cannot be accessed from outside the class.</p>

<pre><code>public class Main {
    private int age = 30;  // Private variable

    private void displayAge() {  // Private method
        System.out.println("Age: " + age);
    }
}
</code></pre>

<p>In this example, the <code>age</code> variable and <code>displayAge()</code> method can only be accessed within the <code>Main</code> class and not from any other class.</p>

<h3>Example of Getter and Setter Methods to Access Private Members:</h3>

<pre><code>public class Main {
    private int age = 30;

    // Getter method
    public int getAge() {
        return age;
    }

    // Setter method
    public void setAge(int age) {
        this.age = age;
    }
    
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println("Age: " + obj.getAge());
        obj.setAge(35);
        System.out.println("Updated Age: " + obj.getAge());
    }
}
</code></pre>

<p>In this example, the <code>getAge()</code> and <code>setAge()</code> methods allow access to the private <code>age</code> variable outside of the class.</p>

<h2>3. Protected</h2>

<p>The <code>protected</code> access modifier allows the member to be accessible within the same package and by subclasses (even if they are in different packages).</p>

<pre><code>public class Main {
    protected String job = "Engineer";  // Protected variable

    protected void displayJob() {  // Protected method
        System.out.println("Job: " + job);
    }
}
</code></pre>

<p>In this example, the <code>job</code> variable and <code>displayJob()</code> method can be accessed within the same package or by any subclass of the <code>Main</code> class.</p>

<h3>Example of Accessing Protected Members from a Subclass:</h3>

<pre><code>public class Employee extends Main {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.displayJob();  // Accessing protected method from subclass
    }
}
</code></pre>

<p>Here, the <code>Employee</code> class, which extends the <code>Main</code> class, can access the protected members of the parent class.</p>

<h2>4. Default (No Modifier)</h2>

<p>When no access modifier is specified, Java provides a default level of access. Members with default access are accessible only within the same package.</p>

<pre><code>class Main {
    String city = "New York";  // Default access variable

    void displayCity() {  // Default access method
        System.out.println("City: " + city);
    }
}
</code></pre>

<p>In this example, the <code>city</code> variable and <code>displayCity()</code> method have default access and can only be accessed by classes within the same package.</p>

<h2>Summary of Access Modifiers</h2>

<table>
    <thead>
        <tr>
            <th>Modifier</th>
            <th>Within Class</th>
            <th>Within Package</th>
            <th>Outside Package (Subclass)</th>
            <th>Outside Package (Non-Subclass)</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td><strong>public</strong></td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Yes</td>
        </tr>
        <tr>
            <td><strong>protected</strong></td>
            <td>Yes</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>No</td>
        </tr>
        <tr>
            <td><strong>default</strong> (no modifier)</td>
            <td>Yes</td>
            <td>Yes</td>
            <td>No</td>
            <td>No</td>
        </tr>
        <tr>
            <td><strong>private</strong></td>
            <td>Yes</td>
            <td>No</td>
            <td>No</td>
            <td>No</td>
        </tr>
    </tbody>
</table>

<h2>Key Points</h2>
<ul>
    <li><strong>public</strong>: Accessible everywhere.</li>
    <li><strong>private</strong>: Accessible only within the same class.</li>
    <li><strong>protected</strong>: Accessible within the same package and by subclasses in different packages.</li>
    <li><strong>default</strong>: Accessible only within the same package.</li>
</ul>

<h1>Java Array Topics and Methods</h1>

<h3>1. Introduction to Arrays</h3>
<ul>
    <li>Array is a collection of similar data types stored at contiguous memory locations.</li>
    <li>Array is fixed in size.</li>
    <li>Syntax:
        <pre><code>dataType[] arrayName = new dataType[size];</code></pre>
    </li>
</ul>

<h3>2. Array Declaration, Instantiation, and Initialization</h3>
<ul>
    <li>Declaration:
        <pre><code>int[] arr;</code></pre>
    </li>
    <li>Instantiation:
        <pre><code>arr = new int[5];</code></pre>
    </li>
    <li>Initialization:
        <pre><code>int[] arr = {1, 2, 3, 4, 5};</code></pre>
    </li>
</ul>

<h3>3. Accessing Array Elements</h3>
<ul>
    <li>Access elements using the index:
        <pre><code>int x = arr[2];  // Access 3rd element</code></pre>
    </li>
</ul>

<h3>4. Traversing an Array</h3>
<ul>
    <li>Using a for loop:
        <pre><code>
for (int i = 0; i &lt; arr.length; i++) {
    System.out.println(arr[i]);
}
        </code></pre>
    </li>
    <li>Using a for-each loop:
        <pre><code>
for (int num : arr) {
    System.out.println(num);
}
        </code></pre>
    </li>
</ul>

<h3>5. Common Array Methods</h3>
<ul>
    <li><strong>Arrays.toString()</strong> - Converts array to a string representation:
        <pre><code>import java.util.Arrays;

System.out.println(Arrays.toString(arr));  // Prints the array as [1, 2, 3, 4, 5]</code></pre>
    </li>
    <li><strong>Arrays.sort()</strong> - Sorts the array in ascending order:
        <pre><code>import java.util.Arrays;

Arrays.sort(arr);  // Sorts the array in place</code></pre>
    </li>
    <li><strong>Arrays.binarySearch()</strong> - Searches for an element using binary search (array must be sorted):
        <pre><code>import java.util.Arrays;

int index = Arrays.binarySearch(arr, 3);  // Returns index of element 3</code></pre>
    </li>
    <li><strong>Arrays.fill()</strong> - Fills the array with a specific value:
        <pre><code>import java.util.Arrays;

Arrays.fill(arr, 10);  // Fills the entire array with 10</code></pre>
    </li>
    <li><strong>Arrays.copyOf()</strong> - Copies array elements to a new array:
        <pre><code>import java.util.Arrays;

int[] newArr = Arrays.copyOf(arr, arr.length);  // Copies the array</code></pre>
    </li>
</ul>

<h3>6. Multidimensional Arrays</h3>
<ul>
    <li>Declaration and Instantiation:
        <pre><code>int[][] matrix = new int[3][3];</code></pre>
    </li>
    <li>Initialization:
        <pre><code>int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};</code></pre>
    </li>
    <li>Accessing elements:
        <pre><code>int val = matrix[1][2];  // Access element at row 1, column 2</code></pre>
    </li>
    <li>Traversing a 2D Array:
        <pre><code>
for (int i = 0; i &lt; matrix.length; i++) {
    for (int j = 0; j &lt; matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
    }
    System.out.println();
}
        </code></pre>
    </li>
</ul>

<h3>7. Cloning Arrays</h3>
<ul>
    <li>Cloning creates a shallow copy:
        <pre><code>int[] clonedArray = arr.clone();</code></pre>
    </li>
</ul>

<h3>8. Comparing Arrays</h3>
<ul>
    <li>Use <strong>Arrays.equals()</strong> to check if two arrays are equal:
        <pre><code>import java.util.Arrays;

boolean isEqual = Arrays.equals(arr1, arr2);</code></pre>
    </li>
</ul>

<h3>9. Array Length</h3>
<ul>
    <li>The <strong>length</strong> property returns the size of the array:
        <pre><code>int size = arr.length;</code></pre>
    </li>
</ul>

<h3>10. Array Sorting</h3>
<ul>
    <li>Use <strong>Arrays.sort()</strong> to sort arrays:
        <pre><code>import java.util.Arrays;

Arrays.sort(arr);</code></pre>
    </li>
</ul>

<h3>11. Copying Arrays</h3>
<ul>
    <li>Use <strong>System.arraycopy()</strong> to copy elements between arrays:
        <pre><code>System.arraycopy(srcArray, srcPos, destArray, destPos, length);</code></pre>
    </li>
</ul>

<h3>12. Passing Arrays to Methods</h3>
<ul>
    <li>Arrays can be passed as parameters to methods:
        <pre><code>
public static void printArray(int[] array) {
    for (int i : array) {
        System.out.println(i);
    }
}</code></pre>
    </li>
</ul>

<h3>

# String

#### In Java, a **string** is an object that represents a sequence of characters. It is used to store and manipulate text. Strings in Java are instances of the `String` class and are immutable, meaning once a `String` object is created, its value cannot be changed. However, various methods allow you to perform operations such as concatenation, comparison, and substring extraction without altering the original string.

### Example of a String in Java:
```java
public class Main {
    public static void main(String[] args) {
        // Declare and initialize a string
        String message = "Hello, Java!";
        
        // Print the string
        System.out.println(message);
        
        // Find the length of the string
        int length = message.length();
        System.out.println("Length of the string: " + length);
        
        // Concatenate another string
        String greeting = "Welcome to ";
        String combinedMessage = greeting + message;
        System.out.println("Combined Message: " + combinedMessage);
        
        // Check if it contains a substring
        boolean containsJava = message.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);
    }
}
```
## Basic String Functions in Java

Here are some commonly used basic functions of the `String` class in Java:

```Java
public class Main {
    public static void main(String[] args) {
        // Declare and initialize a string
        String message = "Hello, Java!";
        
        // Find the length of the string
        int length = message.length();
        System.out.println("Length of the string: " + length);
        
        // Access a character at a specific index
        char charAt = message.charAt(1);
        System.out.println("Character at index 1: " + charAt);
        
        // Convert to uppercase
        String upperCaseMessage = message.toUpperCase();
        System.out.println("Uppercase: " + upperCaseMessage);
        
        // Convert to lowercase
        String lowerCaseMessage = message.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseMessage);
        
        // Check if the string contains a substring
        boolean containsJava = message.contains("Java");
        System.out.println("Contains 'Java': " + containsJava);
        
        // Replace a part of the string
        String replacedMessage = message.replace("Java", "World");
        System.out.println("Replaced Message: " + replacedMessage);
        
        // Concatenate strings
        String greeting = "Welcome to ";
        String combinedMessage = greeting.concat(message);
        System.out.println("Combined Message: " + combinedMessage);
        
        // Compare two strings
        String anotherMessage = "Hello, Java!";
        boolean areEqual = message.equals(anotherMessage);
        System.out.println("Messages are equal: " + areEqual);
        
        // Get a substring
        String substring = message.substring(7, 11); // Extract "Java"
        System.out.println("Substring: " + substring);
    }
}
```

## StringBuilder in Java

`StringBuilder` in Java is a mutable sequence of characters. Unlike `String`, a `StringBuilder` can be modified after it is created, which makes it more efficient for situations where the string is frequently manipulated, such as in loops.

### Why Use `StringBuilder`?
- **Mutability**: Unlike `String`, `StringBuilder` can change its value without creating new objects.
- **Performance**: It’s faster than `String` when you are performing multiple modifications (e.g., concatenations).

### Commonly Used `StringBuilder` Methods:

### 1. `append()`
Adds text to the end of the existing string.

```java
StringBuilder sb = new StringBuilder("Hello");
sb.append(", World!");
System.out.println(sb); // Output: Hello, World!

```

### 2. `insert()`

```Java
sb.insert(5, " Java");
System.out.println(sb); // Output: Hello Java, World!
```
### 3. `replace()`
```Java
sb.replace(6, 10, "C++");
System.out.println(sb); // Output: Hello C++, World!

```
### 4. `delete()`

```Java
sb.delete(5, 9);
System.out.println(sb); // Output: Hello, World!

```
### 5. `reverse()`

```Java
sb.reverse();
System.out.println(sb); // Output: !dlroW ,olleH
```
## Difference Between `String` and `StringBuilder` in Java

Java provides two main classes for handling strings: `String` and `StringBuilder`. Both serve different purposes, and understanding their differences can help optimize performance in your applications.

| Feature             | `String`                         | `StringBuilder`                   |
|---------------------|----------------------------------|-----------------------------------|
| **Mutability**       | Immutable: Once created, the string cannot be changed. Any operation that alters the string creates a new `String` object. | Mutable: You can modify the contents of `StringBuilder` without creating new objects. |
| **Performance**      | Slower: Since `String` creates new objects when modified, performance can degrade with frequent modifications. | Faster: More efficient for multiple string modifications (e.g., appending, deleting, or replacing characters). |
| **Thread Safety**    | Thread-safe: Immutable objects are inherently thread-safe. | Not thread-safe: `StringBuilder` is not synchronized, meaning it’s not safe for use in multithreaded environments. Use `StringBuffer` for a thread-safe alternative. |
| **Usage Scenario**   | Best used for scenarios where the string value remains constant or changes rarely. | Ideal for scenarios where the string is frequently modified (e.g., building dynamic strings in loops). |
| **Memory Efficiency**| Uses more memory as it creates a new string object every time it is modified. | More memory-efficient as it modifies the existing object rather than creating a new one. |
| **Instantiation**    | `String str = "Hello";` or `String str = new String("Hello");` | `StringBuilder sb = new StringBuilder("Hello");` |
| **Concatenation**    | Uses the `+` operator or `concat()` method. Each concatenation creates a new `String` object. | Uses the `append()` method, modifying the existing `StringBuilder` object. |

### When to Use String vs. StringBuilder:
#### Use String when

- The value is constant or changes infrequently.
- You require thread safety without external synchronization.

#### Use StringBuilder when 

- You need to perform multiple string modifications (e.g., appending in loops).
- Performance is a concern, especially with large or frequently changing strings.
- Thread safety is not a requirement.

<hr/>

# LinkedList 

### What is a LinkedList?
A **LinkedList** is a linear data structure where elements (called **nodes**) are stored in a sequence, but unlike arrays, the elements are not stored in contiguous memory locations. Each node contains:
1. **Data**: The value of the node.
2. **Pointer (or reference)**: A reference to the next node in the sequence.

### Types of LinkedLists:
1. **Singly Linked List**:
   - Each node has data and a reference to the next node.
   - Traversal is possible only in one direction (from head to tail).

2. **Doubly Linked List**:
   - Each node has data, a reference to the next node, and a reference to the previous node.
   - Traversal is possible in both directions (forward and backward).

3. **Circular Linked List**:
   - In a circular linked list, the last node points back to the first node, forming a loop.
   - Can be singly or doubly linked.
   - There is no `null` reference at the end.

### Advantages of LinkedLists:
1. **Dynamic Size**:
   - Unlike arrays, LinkedLists do not need to be initialized with a fixed size, and they can grow or shrink as needed.

2. **Efficient Insertion/Deletion**:
   - Inserting or deleting elements is easier and faster as there is no need to shift elements like in arrays. Only the pointers need to be updated.

3. **Efficient Memory Usage**:
   - Memory is allocated as needed (no wasted space or need for resizing).

4. **No Contiguous Memory Requirement**:
   - Nodes can be stored anywhere in memory, and they are connected using pointers, making them suitable for situations where memory allocation is fragmented.

### Disadvantages of LinkedLists:
1. **Extra Memory for Pointers**:
   - Each node requires additional memory for storing the pointer/reference to the next node, which can be overhead, especially in large lists.

2. **Sequential Access**:
   - Accessing elements requires traversing the list from the beginning, making it slower to access elements compared to arrays (which allow direct access via indexing).

3. **Slower Search**:
   - Finding an element in a LinkedList requires traversing through the list, leading to a time complexity of O(n), whereas arrays allow faster lookups with O(1).

4. **Complexity**:
   - Operations like reverse traversal are more complex in singly linked lists and require additional overhead (like maintaining previous references).

### When to Use LinkedLists:
- When frequent insertions and deletions from the middle of the list are needed.
- When the size of the data structure is not known in advance.
- When contiguous memory allocation is not possible or desirable.

### When to Avoid LinkedLists:
- When frequent access to elements is needed, as array-based structures are more efficient for accessing elements by index.
- If memory overhead (extra space for pointers) is a concern.

## How LinkedList Works

<p align="center">
  <img src="https://media.geeksforgeeks.org/wp-content/uploads/20240219155344/Singly-Linked-List.webp" alt="LinkedList working GIF" width="500">
</p>

## Code

```Java

// Node class to represent each element in the LinkedList
class Node {
    int data;
    Node next;

    // Constructor to initialize the node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class
public class LinkedList {
    Node head;

    // Insert a node at the beginning (head)
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert a node at the end (tail)
    public void insertAtTail(int data) {
        Node newNode = new Node(data);

        // If the list is empty, make the new node the head
        if (head == null) {
            head = newNode;
            return;
        }

        // Traverse to the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        // Insert the new node at the end
        last.next = newNode;
    }

    // Insert a node at a specified position (middle)
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);

        // If inserting at the head (position 0)
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node just before the desired position
        Node previous = head;
        for (int i = 0; i < position - 1 && previous != null; i++) {
            previous = previous.next;
        }

        // If position is invalid (greater than the length of the list)
        if (previous == null) {
            System.out.println("Invalid position");
            return;
        }

        // Insert the new node at the specified position
        newNode.next = previous.next;
        previous.next = newNode;
    }

    // Method to display the LinkedList
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert at the head
        list.insertAtHead(10);
        list.insertAtHead(20);
        System.out.println("After inserting at head:");
        list.display(); // 20 -> 10 -> null

        // Insert at the tail
        list.insertAtTail(30);
        System.out.println("After inserting at tail:");
        list.display(); // 20 -> 10 -> 30 -> null

        // Insert at a specific position
        list.insertAtPosition(15, 2);
        System.out.println("After inserting at position 2:");
        list.display(); // 20 -> 10 -> 15 -> 30 -> null
    }
}

```

## LinkedList Deletion Node

```Java
// Define the Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the LinkedList class
class LinkedList {
    Node head;

    // Method to delete a node by its value
    public void deleteNode(int key) {
        Node temp = head, prev = null;

        // Case 1: If the head node itself holds the key to be deleted
        if (temp != null && temp.data == key) {
            head = temp.next; // Changed head
            return;
        }

        // Case 2: Search for the key to be deleted, keeping track of the previous node
        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        // Case 3: If the key was not present in the linked list
        if (temp == null) {
            System.out.println("Key not found in the list.");
            return;
        }

        // Case 4: Unlink the node from the linked list
        prev.next = temp.next;
    }

    // Method to add a node to the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    // Method to print the linked list
    public void printList() {
        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
}

// Main class to test the deletion
public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements into the linked list
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);

        System.out.println("Original List:");
        list.printList();

        // Delete a node with value 3
        list.deleteNode(3);
        System.out.println("After Deleting Node 3:");
        list.printList();
    }
}
```




