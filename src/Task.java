/**
 * Author: Taylor Ericson
 * Class: CSC-240 Computer Science II (Java)
 * Description: A class representing a task with a name and priority that 
 * implements the Priority interface.
 */

public class Task implements Priority{
	
    private String taskName;
    private int priority;
    
    /**
     * Constructor to create a Task with a name and priority.
     * @param taskName The name of the task.
     * @param priority The priority level (between 1 and 5).
     */

    public Task(String taskName, int priority) {
        this.taskName = taskName;
        setPriority(priority);
    }

    // Setters and Getters 
    @Override
    public void setPriority(int priority) {
    	// Check for valid priority level
        if (priority >= 1 && priority <= 5) {
            this.priority = priority;
        } else {
            throw new IllegalArgumentException("Priority must be between 1 and 5.");
        }
    }

    @Override
    public int getPriority() { return priority; }

    // Returns a formatted string containing the task name and priority.
    @Override
    public String toString() { 
    	return taskName + "\t priority: " + priority; 
    }
}
