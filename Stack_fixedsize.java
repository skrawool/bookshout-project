public class StackArray {
 private static final int init_size = 5;
 int arr[] = new int[init_size];
 int top = -1;

 public void push(int x) {
  if (top < init_size - 1) {
   top++;
   arr[top] = x;
   System.out.println("The element " + x
     + " is pushed to stack");
   printX();
  } else {
   System.out.println("Overflow !");
  }
 }

 public void pop() {
  if (top >= 0) {
   top--;
   System.out.println("Element popped");
  } else {
   System.out.println("Underflow");
  }
 }

 public void printX() {
  if (top >= 0) {
   System.out.println("The elements in stack are as follows:");
   for (int i = 0; i <= top; i++) {
    System.out.println(arr[i]);
   }
  }
 }

 public static void main(String[] args) {
  StackArray stackArray = new StackArray();

  
  stackArray.push(1);
  stackArray.push(2);
  stackArray.push(3);
  stackArray.push(4);
  stackArray.pop();
  stackArray.pop();
  stackArray.pop();
  stackArray.printX();
 }

}
