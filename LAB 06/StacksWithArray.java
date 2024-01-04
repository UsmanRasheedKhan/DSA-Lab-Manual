public class StacksWithArray {
    int[] arr;
    int top;

    public StacksWithArray(int size){
        arr = new int[size];
        this.top = -1;
    }
    public boolean isEmpty(){
        if(top < 0){
            return true;
        } else{
            return false;
        }
    }
    public boolean isFull(){
        if(top == arr.length - 1){
            return true;
        } else{
            return false;
        }
    }
    public void push(int val){
        if(isFull()){
            System.out.println("Value " +val +" can't be pushed. Stack Overflow");
            return;
        }
        arr[++top] = val;
    }
    public void pop(){
        if(isEmpty()){
            System.out.println("Value can't be popped. Stack Underflow.");
            return;
        }
        top--;
    }
    public void print(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            return;
        }
        for(int i = 0; i <= top; i++){
            System.out.print(arr[i] +"-->");
        }
        System.out.println();
    }
    public void isPeek(){
        System.out.println("Peeked Value: " +arr[top]);
    }
    public void min(){
        int min = arr[0];
        for(int i = 1; i <= top; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Minimum Value: " +min);
    }
    public void max(){
        int max = arr[0];
        for(int i = 1; i <= top; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Maximum Value: " +max);
    }
    public void search(int val){
        for(int i = 0; i <= top; i++){
            if(val == arr[i]){
                System.out.println("Value " +val +" found at index: " +i);
                return;
            }
        }
        System.out.println("Value not found");
    }
    public void average(){
        float sum = 0;
        for(int i = 0; i <= top; i++){
            sum += arr[i];
        }
        System.out.println("Average: " +(sum/(top + 1)));
    }
    public void even(){
        System.out.println("Even Numbers: ");
        for(int i = 0; i <= top; i++){
            if(arr[i] % 2 == 0){
                System.out.print(arr[i] +"-->");
            }
        }
        System.out.println();
    }
    public void odd(){
        System.out.println("Odd Numbers: ");
        for(int i = 0; i <= top; i++){
            if(arr[i] % 2 != 0){
                System.out.print(arr[i] +"-->");
            }
        }
        System.out.println();
    }
    public void reverse(){
        System.out.println("Reverse Stack: ");
        for(int i = top; i >= 0; i--){
            System.out.print(arr[i] +"-->");
        }
    }

public class Main {
    public static void main(String[] args) {
        StacksWithArray stack = new StacksWithArray(5);
        stack.pop();
        stack.push(50);
        stack.push(2);
        stack.push(95);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.push(7);
        stack.pop();
        stack.print();
        stack.isPeek();
        stack.min();
        stack.max();
        stack.search(95);
        stack.average();
        stack.even();
        stack.odd();
        System.out.println("Stack Output: ");
        stack.print();
        stack.reverse();
    }
}
}
