import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please Enter Array Size: ");
        Scanner input = new Scanner(System.in);
        int initialSize = input.nextInt();
        if(initialSize <= 0){
            System.out.println("Zero and Negative index values can't be put.");
            return;
        }
        DynamicArray arr = new DynamicArray(initialSize);
        arr.insert();
        arr.insert();
        arr.insert();
        arr.insert();
        arr.insert();
        arr.insert();
        arr.insert();
        arr.display();
        arr.removeAtIndex();
        arr.removeAtIndex();
        arr.insert();
        arr.removeByValue();
        arr.search();
        arr.display();
        arr.max();
        arr.min();
        arr.product();
        arr.average();
        arr.replace();
        arr.replace();
        arr.display();
        arr.reverse();
        arr.even();
        arr.odd();
        arr.distinct();
        arr.prime();
    }
}