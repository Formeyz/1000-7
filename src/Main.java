public class Main {
    public static void main (String[] args) throws InterruptedException {
        int i = 1000;
        while (i >= -1) {
            if (i != -1) {
                System.out.println(i + "-7");
                i = i - 7;
                Thread.sleep(30);
            }
            else {
                System.out.println(i);
                break;
            }
        }
    }
}