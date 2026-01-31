# Lab 3 - Java Fundamentals

**Author**: Jon Mrowczynski

This lab will help us ensure that we understand (or find knowledge gaps in) some fundamental ideas in Java including how to:
- get user input from the console 
- print to the console
- declare and assign variables and constants
- use built-the objects
- utilize branching, loops, and arrays.

## Task 1: Clone Repo

Clone this repo using HTTPS or SSH. Either one will work since we won't be uploading code to this repo.

## Task 2: Complete the TODOs

You will find many TODO's inside the Java source file. These are relatively common when working on code.

Write code to satisfy all the TODOs and answer any corresponding questions that are contained in this README.
After you have completed each TODO (written code that you tested to ensure proper functionality), it is safe to delete the TODO comment.

You'll find these classes to be helpful:

1. [`java.util.Scanner`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Scanner.html)
2. [`java.util.Random`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Random.html)
3. [`java.util.Arrays`](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/Arrays.html)

Sample output of a completed lab 3 is provided to help you see what is desired for each part.

Your output should be formatted similarly. Obviously the numbers can and will be different.

```
Part 1 (12pts):

How many integers will you be entering?: 3
Please enter in 3 integers:
Integer 1: 1
Integer 2: 2
Integer 3: 3
2.0
```

```
Part 2 (12pts):

Original array: [3, 1, 14, 6, 6, 8, 10, 2, 13, 5, 4, 9, 9, 9, 9, 8, 15, 2, 7, 14, 11, 3, 12, 15, 7, 7, 13, 7, 13, 2]
Sorted array: [1, 2, 2, 2, 3, 3, 4, 5, 6, 6, 7, 7, 7, 7, 8, 8, 9, 9, 9, 9, 10, 11, 12, 13, 13, 13, 14, 14, 15, 15]
The first value greater than 9 was: 10 at index: 20
```

```
Part 3 (5pts):

[5, 6, 6, 8, 8, 9, 9, 9, 9, 10, 15, 15, ]
```

## Q1: What was not followed for the `JavaFUNdamentals` `class`?

[Answer here]

## Q2 (2pts): Why can't you use a for-each loop to populate an array?

[Answer here]

## Q3: What kind of class is `Arrays`?

[Answer here]

## Q4 (2pts): What does the last line of code in the `part3` method do?

[Answer here]

You will often encounter code written in a way or using an API that you are not familiar with.
Taking a look at the last line of code, can you reason through what it is doing? 

We could dedicate an entire class period explaining this one line of code. In short, the [Stream API]((https://docs.oracle.com/en/java/javase/21/docs/api//java.base/java/util/stream/Stream.html)) is Java's way of implementing
functional programming! A more succinct and powerful way to write code (when used correctly).

We'll cover this in more depth later. However it will probably pop up here and there throughout the course. 

## Task 3: Ensure all your code is set to run.

It is common to comment out code that you don't quite care about running during development or demonstrations. 

Basically, always ensure that no code is commented out prior to submitting your files to D2L. Rather, give your code one final
test run to make sure everything works as expected!

## Task 4: Add your name as a new author to the class!

This requires you to create a new `@author` tag in the class's javadoc.

## Task 5: Submit to D2L Your:

1. filled out version of this README.
2. completed Java source file.