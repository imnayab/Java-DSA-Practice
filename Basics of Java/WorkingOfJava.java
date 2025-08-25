Introduction to Java
Last Updated : 19 Aug, 2025
Java is a high-level, object-oriented programming language developed by Sun Microsystems in 1995. It is mostly used for building desktop applications, web applications, Android apps, and enterprise systems.

Key Features of Java
Platform Independent: Java is famous for its Write Once, Run Anywhere (WORA) feature. This means we can write our Java code once, and it will run on any device or operating system if Java Virtual Machine is installed.
Simple: No complex features like pointers and multiple inheritance, which makes it a good choice for beginners.
Object-Oriented: This makes code clean and reusable.
Secured: Since there are no pointers, it has built-in protections to keep our programs secure from common problems like memory leakage and segment fault.
Multithreading: Programs can do many things at the same time using multiple threads. This is useful for handling complex tasks like processing transactions.
Just-In-Time (JIT) Compiler: Java uses a JIT compiler. It improves performance by converting the bytecode into machine readable code at the time of execution.
Understanding Hello World Program in Java
When we learn any programming language, the first step is writing a simple program to display "Hello World". So, here is a simple Java program that displays "Hello World" on the screen.




// This is a simple Java program to print Hello World!
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

Output
Hello World!
How does this work:

// starts a single-line comment. The comments does not executed by Java.
public class HelloWorld defines a class named HelloWorld. In Java, every program must be inside a class.
public static void main(String[] args) is the entry point of any Java application. It tells the JVM where to start executing the program.
System.out.println("Hello, World!"); prints the message to the console.
Java program execution follows this below simple flow:

How-java-code-Executes
Java Program Execution Flow
Write code in a file like HelloWorld.java.
The Java Compiler "javac" compiles it into bytecode "HelloWorld.class".
The JVM (Java Virtual Machine) reads the .class file and interprets the bytecode.
JVM converts bytecode to machine readable code i.e. "binary" (001001010) and then execute the program.
To understand Hello World program in detail, refer to article: Java Hello World Program

Comments in Java
The comments are the notes written inside the code to explain what we are doing. The comment lines are not executed while we run the program.

Single-line comment

// This is a comment
Multi-line comment

/*
This is a multi-line comment.
This is useful for explaining larger sections of code.
*/
To understand Java comments in detail, refer to article: Java Comments

Curly Braces and Indentation in Java
In Java, curly braces {} are used to define blocks of code. For example, the body of a class or method is enclosed within curly braces.

Example:


public class Geeks{
    public static void main(String[] args) {
        {
            System.out.println("This is inside the block.");
        }

        System.out.println("This is outside the block.");
    }
}
The code block inside {} runs unconditionally and prints a message.
Curly brackets {} group multiple statements into a single block, even without conditions.
Naming Conventions in Java
Java uses standard naming rules that make the code easier and improves the readability.
In Java, the class names start with a capital letter for example, HelloWorld. Method and variable names start with a lowercase letter and use camelCase like printMessage.
And the constants are written in all uppercase letters with underscores like MAX_SIZE.
To understand Naming convention in Java in detail, refer to article: Java Naming Convention

Famous Applications Built Using Java
Android Apps: Most of the Android mobile apps are built using Java.
Netflix: This uses Java for content delivery and backend services.
Amazon: Java language is used for its backend systems.
LinkedIn: This uses Java for handling high traffic and scalability.
Minecraft: This is one of the world’s most popular games that is built in Java.
Spotify: This uses Java in parts of its server-side infrastructure.
Uber: Java is used for backend services like trip management.
NASA WorldWind: This is a virtual globe software built using Java.
What Can We Do with Java?
Java is used for:

Mobile App Development: Android development using Android Studio.
Web Development: Using frameworks like Spring Boot and Jakarta EE.
Desktop GUI Applications: With libraries like JavaFX and Swing.
Enterprise Applications: Java is the backbone of many banking and business software.
Game Development: Through game engines like LibGDX.
Big Data Technologies: Like Hadoop and Apache Kafka.
Internet of Things (IoT): Java can run on embedded systems and devices.
Cloud-based Applications: Java is used in services on AWS, Azure, and Google Cloud.
Scientific Applications: Java is used in tools that process large amounts of scientific data.
