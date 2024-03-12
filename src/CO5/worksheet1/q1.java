package CO5.worksheet1;

class q1{
    public static void main(String[] args) {

        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred");
        }

        try {
            int a = 10;
            int b = 0;
            int result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred");
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occurred");
        }

        try {
            String num = "abc";
            int parsedNum = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException occurred");
        }

        try {
            String str = null;
            System.out.println(str.length());
        } catch (Exception e) {
            System.out.println("Exception occurred");
        }
    }
}