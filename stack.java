public class Stack {

    int size;

    int top;

    int[] array;

    Stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull(){
        return (top == size-1);
    }

    boolean isEmpty(){
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("Stack Overflow");
        } else {
            array[top + 1] = item;
            top++;
        }
    }
       int pop(){
           int previousTop = top;
           if(isEmpty()){
               System.out.println("Stack is Empty");
           }else{
               top--;
           }
           return array[previousTop];
        }

        void printStack(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
        }else{
            System.out.println("Stack Elements:");
            for(int i = 0; i<=top; i++){
                System.out.println(array[i] + " ");
            }
        }
        }

}
