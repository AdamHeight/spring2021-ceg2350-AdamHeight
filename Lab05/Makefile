GS = -g
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

run:	$(MAIN).class
	$(JVM) $(MAIN)

clean:
	$(RM) *.class
