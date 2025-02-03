# Array Operations Program

This repository contains a Java program designed to perform various operations on arrays. The program uses a command-line interface and supports features like identifying even and odd numbers, finding the smallest difference between consecutive elements, and displaying results effectively.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Classes and Methods](#classes-and-methods)
- [How to Run](#how-to-run)

## Overview
The program is designed to perform operations on arrays entered by the user. It processes the array to display results based on specific operations, such as finding odd/even numbers or identifying the index with the smallest difference between consecutive elements.

The program consists of the following classes:
- **`ArrayFunctions`**: Handles array-related operations.
- **`UserInput`**: Manages user input for arrays.
- **`Main`**: Acts as the entry point of the program.

## Features
- **Odd and Even Number Identification**: Separates odd and even numbers from the given array and displays them.
- **Smallest Difference Calculation**: Finds the smallest difference between consecutive elements in the array and displays the corresponding index.
- **Custom Display Methods**: Provides clear and formatted output for results.

## Classes and Methods

# ArrayFunctions Class

This class provides methods for array-related operations.

## Methods

- **`void display(ArrayList<Integer> array)`**  
  Displays the contents of an `ArrayList`.

- **`void displayIndex(int index)`**  
  Displays the index with the smallest difference.

- **`void oddEven(int[] array)`**  
  Separates and displays odd and even numbers from the provided array.

- **`void min(int[] array)`**  
  Finds the smallest difference between consecutive elements in the array and displays the index of the first element in the pair.

- **`ArrayList<Integer> arrayToArrayList(int[] array)`**  
  Converts an array to an `ArrayList` and returns it.

- **`int[] arrayListToArray(ArrayList<Integer> list)`**  
  Converts an `ArrayList` back to an array and returns the resulting array.

---

### UserInput Class
This class manages user input for the program.

- **`int[] arrayInput()`**  
  Prompts the user to enter an array of 5 integers and returns it.

---

### Main Class
The main entry point of the program where the user interacts with the system.

- **Workflow**:
  1. Prompts the user to enter an array.
  2. Calls `oddEven()` to display odd and even numbers.
  3. Calls `min()` to find and display the smallest difference between consecutive elements.

## How to Run

1. Clone the repository to your local machine:
   ```bash
   git clone https://github.com/Sudhanshu-Kulkarni/array-operations-program.git
2. Navigate to the repository folder and compile the Java files:
   - javac *.java
3. Run the program using the Main class:
   - java Main
