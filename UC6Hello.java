public class UC6Hello {
    public static void main(String[] args) {

        // Default case
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        StringBuilder result = new StringBuilder();

        // Append names with delimiter
        for (String name : args) {
            result.append(name).append(", ");
        }

        // Remove trailing ", "
        result.setLength(result.length() - 2);

        // Print final output
        System.out.println("Hello, " + result + "!");
    }
}