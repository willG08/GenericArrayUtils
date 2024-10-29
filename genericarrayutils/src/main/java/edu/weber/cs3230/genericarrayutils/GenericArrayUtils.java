package edu.weber.cs3230.genericarrayutils;

import java.lang.reflect.Array;

//class to practice class manipulation
public class GenericArrayUtils<T> {
    //stores all elements
    private T[] elements;
    //isolates the even outputs
    private T[] evenOutputs;
    //isolates the odd outputs
    private T[] oddOutputs;
    //stores the input size
    private int inputSize;

    //constructor for array
    public GenericArrayUtils(Class<T> classOfT, T[] inputArray) {
        elements = inputArray;
        inputSize = inputArray.length;
        //calculates amount of values for even output
        int evenOutputSize = inputSize / 2;
        //calculates amount of odd values for array
        int oddOutputSize = inputSize / 2;
        //if odd add an even output size
        if(inputSize%2 == 1)
        {
            evenOutputSize += 1;
        }
        //create the arrays
        evenOutputs = (T[]) Array.newInstance(classOfT, evenOutputSize);
        oddOutputs = (T[]) Array.newInstance(classOfT, oddOutputSize);

    }


    // Example: values = {0, 1, 2, 3, 4, 5, 6, 7, 8}
    // isEven = false, print: "1 3 5 7 "
    // isEven = true, print: "0 2 4 6 8 "
    //return an array containing the values of every other element in the array
    //if isEven is true, return only elements with even index values,
    //otherwise, return only elements with odd index values
    public T[] getEveryOtherElements(boolean isEven)
    {
        // TODO: return an array containing the values of every other element in the array
        //  if isEven is true, return only elements with even index values,
        //  otherwise, return only elements with odd index values
        int counter = 0;

        if(isEven) {
            for(int i = 0; i < elements.length; i += 2){
                evenOutputs[counter] = elements[i];
                counter++;
            }
            return evenOutputs;
        }
        else {
            for(int i = 1; i < elements.length; i += 2){
                oddOutputs[counter] = elements[i];
                counter++;
            }
            return oddOutputs;
        }
    }
    //reverse the order of the elements in the array
    public T[] reverse()
    {
        //divide length of the input elements by two to ensure we don't go out of range
        for (int i = 0; i < elements.length/2; i++) {
            //store elements at i into temp
            T temp = elements[i];
            //store value from the front of the array into elements at the rear minus i.
            //This will mean the
            elements[i] = elements[elements.length - i - 1];
            //store value from the back of the array into elements at i
            elements[elements.length - i - 1] = temp;
        }
        return elements;


    }

}
