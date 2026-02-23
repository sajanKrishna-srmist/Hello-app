/**
 * OOPSBannerApp UC3 – OOPS Banner Application (Use Case 3)
 *
 * Uses String.join() to construct each banner line for better
 * readability and efficiency.
 *
 * @author Developer
 * @version 3.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join(" ",
                "*****", " ", "*****", " ", "******", " ", "*****"));

        System.out.println(String.join(" ",
                "*   *", " ", "*   *", " ", "*    *", " ", "*    "));

        System.out.println(String.join(" ",
                "*   *", " ", "*   *", " ", "******", " ", "*****"));

        System.out.println(String.join(" ",
                "*   *", " ", "*   *", " ", "*", "      ", "    *"));

        System.out.println(String.join(" ",
                "*****", " ", "*****", " ", "*", "      ", "*****"));
    }
}