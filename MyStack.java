
public class MyStack {
	int MAX;
	int top;
	char []stack;
	public MyStack(int StackLenght) {
		stack=new char[StackLenght];
		MAX=stack.length;
		top=MAX;
	}

	public char pop(char[]stack) {
		this.stack=stack;
		if(top==0) {
			System.out.println("Stack is empty");
			return (stack[top]);
		}else {
			char top2;
			top2=stack[top-1];
			stack[top-1]='0';
			top--;
			return(top2);
		}
	}

}
