/**
 * OOPSBannerApp UC4 – Render OOPS as Banner using String Array and Loop
 *
 * Uses a String array to store banner lines and prints them
 * using a for-each loop for better modularity and reusability.
 *
 * @author Developer
 * @version 4
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] banner = {
                " *****    *****    ******    ***** ",
                "*     *  *     *   *     *  *     *",
                "*     *  *     *   ******   *      ",
                "*     *  *     *   *        *   ***",
                " *****    *****    *         ***** "
        };

        for (String line : banner) {
            System.out.println(line);
        }
    }
}