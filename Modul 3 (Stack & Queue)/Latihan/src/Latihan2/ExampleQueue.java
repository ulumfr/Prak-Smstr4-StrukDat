import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueue {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("Java");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("HTML");

        System.out.println("Remove\t: " + queue.remove());
        System.out.println("Element\t: " + queue.element());
        System.out.println("Poll\t: " + queue.poll());
        System.out.println("Peek\t: " + queue.peek());
    }

    public static void main(String[] args) {
        new ExampleQueue().queueExample();
    }
}
