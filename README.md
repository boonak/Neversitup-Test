# Neversitup-Test

## Project Overview
This project is a Java application that implements three different functions: generating permutations of a string, finding the odd integer in an array, and counting the number of smiling faces in an array.
The requirement follows the instruction from this file: [Original Requirement Document](https://docs.google.com/document/d/1N3owA8z3MrvnPMqUcfEsi-Q8cCIRyeaWpTXE1el0cME/)



## Project Structure
The project follows a customized Maven folder structure:
```
|-- pom.xml
|-- code
|   |-- Start.java
|-- test
|   |-- Test.java
```

- pom.xml: This is the Maven Project Object Model file that contains the project configuration, including dependencies and build settings.
- code/Start.java: This file contains the implementation of the three functions: generating permutations, finding the odd integer, and counting smiley faces.
- test/Test.java: This file includes unit tests for the implemented functions.

### Function 1: Generating Permutations
The function `getPermutations(String input)` takes a non-empty input string and returns a list of all permutations, removing duplicates if present.

#### Example Usage:
```
String input = "aabb";
Permutations a = new Permutations();
List<String> permutations = a.getPermutations(input);
System.out.println(permutations);
//OUTPUT: ["aabb", "abab", "abba", "baab", "baba", "bbaa"]
```

### Function 2: Finding the Odd Integer
The function `findOdd(int[] input)` takes an array of integers and returns the integer that appears an odd number of times.

#### Example Usage:
```
FindOdd b = new FindOdd();
int[] inputList = {1,2,2,3,3,3,4,4,3,3,3,2,2,1,5,5,5};
int oddNumber = b.findOdd(inputList);
System.out.println(oddNumber);
//OUTPUT: 5
```
### Function 3: Counting Smiley Faces
The function `countSmileys(List<String> arr)` takes an array of strings and returns the total number of valid smiling faces.

#### Example Usage:
```
CountSmileys c = new CountSmileys();
List<String> testList = Arrays.asList(";D", ":-(", ":-)", ";~)");
int count = c.countSmileys(testList);
System.out.println(count);
//OUTPUT: 3
```

## Unit Testing
All unit tests for the functions are included in the `test/Test.java` file. Maven is configured to execute these tests during the build process using Surefire. The test cases are listed in the table below.

|     Test No. |        Test Name   |       Function  |               Input               |                   Expected Result                  |
|:------------:|:------------------:|:---------------:|---------------------------------|--------------------------------------------------|
|       1      | test1_permutation  | getPermutations | "a"                               |                                              ["a"] |
|       2      | test2_permutation  | getPermutations | "ab"                              |                                       ["ab", "ba"] |
|       3      | test3_permutation  | getPermutations | "abc"                             |       ["abc", "acb", "bac", "bca",   "cab", "cba"] |
|       4      | test4_permutation  | getPermutations | "aabb"                            | ["aabb", "abab", "abba", "baab",   "baba", "bbaa"] |
|       5      | test1_findOods     | findOdd         | [7]                               |                                                  7 |
|       6      | test2_findOods     | findOdd         | [0]                               |                                                  0 |
|       7      | test3_findOods     | findOdd         | [1,1,2]                           |                                                  2 |
|       8      | test4_findOods     | findOdd         | [0,1,0,1,0]                       |                                                  0 |
|       9      | test5_findOods     | findOdd         | [1,2,2,3,3,3,4,3,3,3,2,2,1]       |                                                  4 |
|      10      | test1_countSmileys | countSmileys    | [":)", ";(", ";}", ":-D"]         |                                                  2 |
|      11      | test2_countSmileys | countSmileys    | [";D", ":-(", ":-)", ";~)"]       |                                                  3 |
|      12      | test3_countSmileys | countSmileys    | [";]", ":[", ";*", ":$",   ";-D"] |                                                  1 |
|      13      | test4_countSmileys | countSmileys    | [ ]                               |                                                  0 |
