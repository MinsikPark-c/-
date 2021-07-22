import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
	   int b=0;
    Queue<Integer> queue = new LinkedList<>();
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0; i<n; i++) {
    	
    	String a = sc.next();
    	if(a.equals("push")) {
    		b = sc.nextInt();
    		queue.add(b);
    	}
      else if(a.equals("front")){
    		System.out.println(queue.isEmpty()?-1:que.peek());
    	}
      else if(a.equals("back")) {
    		System.out.println(queue.isEmpty()?-1:b);
    	}
      else if(a.equals("size")) {
    		System.out.println(queue.size());
    	}
      else if(a.equals("pop")) {
    		System.out.println(queue.isEmpty()?-1:queue.poll());
    	}
      else if(a.equals("empty")) {
    		System.out.println(queue.isEmpty()?1:0);
    	}
    }
   }
}
