
public class Queue {
	int MAX;
	int tail;
	char []queue;
	public Queue(int tamQueue){
		queue=new char[tamQueue];
		MAX=queue.length;
		tail=0;
	}
	public void push(char value) {
		if(tail==MAX) {
			System.out.println("No se admiten más");
			return;
		}queue[tail]=value;
		tail++;
	}
	public char delete() {
		if (tail==0) {
			System.out.println("#");
			return (queue[tail]);
		}else {
			char HEAD;
			HEAD=queue[0];
			for(int i=0;i<MAX-1;i++) {
				queue[i]=queue[i+1];
			}
			queue[tail-1]='0';
			tail--;
			return(HEAD);
		}

		
	}

}
