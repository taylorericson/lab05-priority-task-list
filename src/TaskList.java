import java.util.ArrayList;
import java.util.List;

/**
 * Author: Taylor Ericson
 * Course: CSC-240 Computer Science II (Java)
 * Description: A Driver class that creates new Task objects, 
 * adds them to a tasks list, and prints each task in the list.
 */

public class TaskList {

    public static void main(String[] args) {
	// Create new Task objects
	Task t1, t2, t3, t4, t5;
		
	// Initialize Task objects with a name and priority
	t1 = new Task("Attend class", 1);
        t2 = new Task("Homework", 2);
    	t3 = new Task("Exercise", 3);
    	t4 = new Task("Eat breakfast", 4);
    	t5 = new Task("Eat lunch", 5);
		
	// Create a list of Task objects
	List<Task> tasks = new ArrayList<>();
		
	// Add tasks to tasks list
        tasks.add(t1);
        tasks.add(t2);
    	tasks.add(t3);
    	tasks.add(t4);
    	tasks.add(t5);

        System.out.println("Priority Task List\n" +
        		   "------------------\n");
        
        // Loop through the list and print each task
        for (Task task : tasks) {
            System.out.println(task);
        }

    }

}
