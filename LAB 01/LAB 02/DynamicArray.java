import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {
    int[] arr;
    int size;
    public DynamicArray(int initialSize){
        arr = new int[initialSize];
        this.size = 0;
    }
    public void display(){
        try{
            System.out.print("Array: [");
            for(int i = 0; i < size; i++){
                if(i == size - 1){
                    System.out.println(arr[i] +"]");
                    return;
                } else{
                    System.out.print(arr[i] +",");
                }
            }
            System.out.println("]");
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void insert(){
        try{
            System.out.println("Please enter data to be inserted:");
            Scanner input = new Scanner(System.in);
            int data  = input.nextInt();
            if(size == arr.length){
                arr = Arrays.copyOf(arr,size * 2);
            }
            arr[size++] = data;
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void push(int data){
        try{
            if(size == arr.length){
                arr = Arrays.copyOf(arr,size * 2);
            }
            arr[size++] = data;
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void removeAtIndex() {
        try{
            System.out.println("Please enter index to be removed:");
            Scanner input = new Scanner(System.in);
            int index = input.nextInt();

            if (index >= 0 && index < size) {
                int data = arr[index];
                for (int i = index; i < size - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                System.out.println("Value " + data + " removed from index " + index);
                size--;
            } else {
                System.out.println("Index out of bounds");
            }
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void removeByValue(){
        try{
            System.out.println("Please enter Value to be removed");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            int indexToRemove = -1;
            for(int i = 0; i < size; i++){
                if(arr[i] == value){
                    indexToRemove = i;
                    break;
                }
            }
            if(indexToRemove == -1){
                System.out.println("Value not found in array");
            } else{
                for(int j = indexToRemove; j < size; j++){
                    arr[j] = arr[j + 1];
                }
                System.out.println("Value " +value +" is removed from index " +indexToRemove);
                size--;
            }
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void search(){
        try{
            System.out.println("Please enter value to be searched");
            Scanner input = new Scanner(System.in);
            int value = input.nextInt();
            for(int i = 0; i < size; i++){
                if(arr[i] == value){
                    System.out.println("Value " +value +" found at index " +i);
                    return;
                }
            }
            System.out.println("Value " +value +" not found in array.");
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void max(){
        try{
            int temp = arr[0];
            for(int i = 1; i < size; i++){
                if(arr[i] > temp){
                    temp = arr[i];
                }
            }
            System.out.println("Maximum value in Array is: " +temp);
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void min(){
        try{
            int temp = arr[0];
            for(int i = 1; i < size; i++){
                if(arr[i] < temp){
                    temp = arr[i];
                }
            }
            System.out.println("Minimum value in Array is: " +temp);
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void product(){
       try{
           int prod = 1;
           for(int i = 0; i < size; i++){
               prod *= arr[i];
           }
           System.out.println("Product of Array: " +prod);
       } catch (Exception e){
           System.out.println("Error Occurred: " +e);
       }
    }
    public void average(){
        try{
            float sum = 0;
            for(int i = 0; i < size; i++){
                sum += arr[i];
            }
            System.out.println("Average of Array: " +(sum/size));
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void replace(){
        try{
            System.out.println("Please enter old value you want to be replaced");
            Scanner input =  new Scanner(System.in);
            int key = input.nextInt();
            int temp = -1;
            for(int i = 0; i < size; i++){
                if(arr[i] == key){
                    temp = i;
                    break;
                }
            }
            if(temp == -1){
                System.out.println("Value doesn't exist.");
            } else{
                System.out.println("Please enter new value you want to be enter");
                int data = input.nextInt();
                arr[temp] = data;
                System.out.println("Value replaced.");
            }
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void reverse(){
        try{
            DynamicArray reverse = new DynamicArray(size);
            for(int i = (size - 1); i >= 0; i--){
                reverse.push(arr[i]);
            }
            System.out.print("Reverse ");
            reverse.display();
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void even(){
        try{
            DynamicArray even = new DynamicArray(size);
            for(int i = 0; i < size; i++){
                if(arr[i] % 2 == 0){
                    even.push(arr[i]);
                }
            }
            System.out.print("Even ");
            even.display();
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void odd() {
        try{
            DynamicArray odd = new DynamicArray(size);
            for (int i = 0; i < size; i++) {
                if (arr[i] % 2 != 0) {
                    odd.push(arr[i]);
                }
            }
            System.out.print("Odd ");
            odd.display();
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void distinct(){
        try{
            DynamicArray distinct = new DynamicArray(size);
            for(int i = 0; i < size; i++){
                int j;
                for(j = 0; j < i; j++){
                    if(arr[i] == arr[j]){
                        break;
                    }
                }
                if(i == j){
                    distinct.push(arr[i]);
                }
            }
            System.out.print("Distinct ");
            distinct.display();
        } catch (Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
    public void prime(){
        try{
            DynamicArray prime = new DynamicArray(size);
            for(int i = 0; i < size; i++){
                int count = 0;
                if(arr[i] == 1){
                    count++;
                } else{
                    for(int j = 2; j < arr[i]; j++){
                        if(arr[i] % j == 0){
                            count++;
                        }
                    }
                }
                if(count == 0){
                    prime.push(arr[i]);
                }
            }
            System.out.print("Prime ");
            prime.distinct();
        } catch(Exception e){
            System.out.println("Error Occurred: " +e);
        }
    }
}