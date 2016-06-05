
public class Stack {
	private int collection[], top, max_size;
	public Stack(int size){
		this.max_size = size;
		this.top = -1;								/* specifies the top of the stack and is therefore initialized to -1 */
		this.collection = new int[max_size];
	}
	
	public void push(int value){
		this.top++;
		if(this.top < this.max_size){				/* Checks whether the top of stack is less than max size. */
			this.collection[this.top] = value;		/* If yes, then pushes an element into the stack */
			return;
		}
		int oldStack[] = this.collection;
		this.collection = new int[this.top + 1];
		System.arraycopy(oldStack, 0, collection, 0, this.top);
		this.max_size = this.top + 1;
		this.collection[this.top] = value;
	}
	
	public int pop() throws Exception{				/* throws exception if operation is not successful */
		if(this.isEmpty()){
			throw new Exception("Stack is empty");
		}
		return this.collection[top--];				/* removes element that was added most recently    */
	}
	
	public int top() throws Exception{				/* Checks if top element is less than zero */
		if(this.top == -1){
			throw new Exception("Stack is empty");
		}
		return this.collection[this.top];
	}
	
	public boolean isEmpty(){
		if(this.top == -1){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) throws Exception {
		int init_size = 2;
		Stack stack = new Stack(init_size);
		stack.push(5);
		stack.push(3);
		stack.push(2);
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.top());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.isEmpty());
	}
}
