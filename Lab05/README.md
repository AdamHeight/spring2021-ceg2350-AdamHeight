Name: Adam Height
Email: Height.4@Wright.edu

Part 1.

1. import java.util.*;

   class Echo {
     public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     System.out.println("What is your name?");
     String name = sc.next();
     System.out.println("Hello, " + name + ".");

     sc.close();
     }
   }

Part 2.

1. whereis gcc, gcc -v
2. whereis javac, javac -version
3. javac Echo.java
4. java Echo

Part 3.

1. touch Makefile
2. GS = -g
JC = javac
JVM = java
FILE=
MAIN = Echo
.SUFFIXES: .java .class
.java.class:
        $(JC) $(JFLAGS) $*.java

CLASSES = \
        Echo.java

default: classes

classes: $(CLASSES:.java=.class)

run:    $(MAIN).class
        $(JVM) $(MAIN)

clean:
        $(RM) *.class

Part 4.

1. Echo needs to be compiled and then run.
   javac Echo.java will compile and then java Echo will run it.
   Using the makefile, only make run will both compile and run it Echo.java will compile and then java Echo will run it.
   Using the makefile, only make run will both compile and run it.
