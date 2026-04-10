public class HelloArgs {
    public static void main(String[] args) {
        // Check if arguments are passed
        if (args.length > 0) {
            // Join all arguments with space
            String joinedArgs = String.join(" ", args);
            System.out.println("Hello " + joinedArgs);
        } else {
            // Default message if no arguments
            System.out.println("Hello! No arguments provided.");
        }
    }
}