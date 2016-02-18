import java.util.*;

public class Stack<T> {
  
  private List<T> data = new ArrayList<T>();
  
  public void push(T obj) {
    data.add(obj);
  }

  public T pop() {
  	if (data.size() > 0) {
  	  // without generics, any type can be returned and
  	  // trigger an runtime error, not an compile error
  		return data.remove(data.size() - 1);
  	}
    else {
    	return null;
    }
  }

  public static void main(String[] args) {
  		Stack<Integer> stack = new Stack<Integer>();
  		stack.push(10);
  		System.out.println(stack.pop());
  		System.out.println(stack.pop());
  }
}

/* Result:
  $ java Stack 
  10
  null
*/