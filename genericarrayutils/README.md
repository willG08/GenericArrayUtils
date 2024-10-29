# CS3230-GenericArrayUtils


## Given Starter Code
* `GenericArrayUtils`, a generic class to provide utility methods to Arrays that works with any type; This class contains a constructor to initialze an input array of any type, as well as `getEveryOtherElements` and `reverse` methods.

## Your Tasks
In this project, you You need to implement the following items based on the given starter code:

* Modify the method `getEveryOtherElements` to let it work with any type, and return an array containing the values of every other element in the array. If the parameter `isEven` is true, return only elements with even index values, otherwise, return only elements with odd index values. Example: elements = {0, 1, 2, 3, 4, 5, 6, 7, 8}, if `isEven` is false, return the array {1 3 5 7}, if `isEven` is true, return the array {0 2 4 6 8}.
* Modify the mmethod`reverse` to let it work with any type, reverse the order of the elements in the array, and return the array. 

## Testing
Unit tests have been written to test your code. While crafting your solution, feel free to run tests at any point to verify the correctness of your code. To execute tests on your local machine, you can either right-click on the `src/test/java` package in the left pane and choose `Run All Tests`, or use the mvn test command from the IntelliJ Maven button on the right vertical bar, or open a command prompt or terminal, navigate to the project folder, and execute the command `mvn test`. You can run tests for a particular program by right-clicking on the corresponding test code and choosing to run the test. As an example, within IntelliJ, you can right-click on the `HelloWorldTest` file under the test directory and then select `Run HelloWorldTest`.

## Submission
Ensure that your source code is committed and pushed to GitHub.com. Additionally, adhere to any instructions provided on Canvas for the submission of any other necessary documents to fulfill the grading requirements. When you're prepared to upload your solution code to GitHub.com, proceed to commit and push your changes. Feel free to stage, commit, and push the code to GitHub as often as necessary. GitHub.com will autonomously execute tests on its platform to validate your code.
