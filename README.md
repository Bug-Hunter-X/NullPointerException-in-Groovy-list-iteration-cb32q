# Groovy NullPointerException in List Iteration

This example demonstrates a common NullPointerException in Groovy when working with lists.  The `myMethod` function iterates over a list and prints each item in uppercase. However, if a `null` value is passed as the list argument, a `NullPointerException` occurs because the `each` method cannot iterate over `null`.

## Bug
The `bug.groovy` file contains the code that causes the error.  Running this code will result in a `NullPointerException`. 

## Solution
The `bugSolution.groovy` file provides a solution that addresses this issue using safe navigation and null checks.