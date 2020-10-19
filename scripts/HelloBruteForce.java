public class HelloBruteForce {
    static String output = "Hello Hacktoberfest 2020!";

    public static void main(String[] args) {
        char current = ' ';
        String textPrint = "";
        System.out.print(current);

        for (int i = 0; i < output.length();) {
            int randomChar = (int) (Math.random() * 96 + 32);
            current = (char) randomChar;
            System.out.print("\r" + textPrint + current);

            if (current == output.charAt(i)) {
                i++;
                textPrint += current;
            }
                
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
