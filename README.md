# Compile Instructions for Java

javac --source-path myapp -d bin myapp/*
-d points to the end point
/* takes all in the myapp

javac --source-path . -d bin ./*.java
. is refering to this

java -cp bin myapp.HelloWorld
-cp is the classpath
myapp is the package
HelloWorld is the class that contains the entry point which is the main() function

jar -c -v -f hWorld.jar -e myapp.HelloWorld .
VERY IMPORTANT TO RUN THIS IN THE FOLDER WITH THE CLASS

JAR should be in the bin file (something like the main file), class might be in sub folders but when using the jar it should be in the bin
java -jar hWorld.jar myapp.HelloWorld
java -jar hWorld.jar 
It seems that both will work, question now is if there is a need for myapp.HelloWorld


FORMATTED PRINT
%s represent String
%d represent Integer
%f represent float
%d double
%c char
%b boolean
%l long


ArrayList to store words
Keyboard inpu to be a sentence 
scanner to break the sentence into words
put the words into the arraylist