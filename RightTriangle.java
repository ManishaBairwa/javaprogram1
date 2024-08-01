public interface RightTriangle {
    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Please provide exactly three integers");
            return;
        }


            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);

            if (a <= 0 || b <= 0 || c <= 0) {
                System.out.println("Please provide positive integers only");
                return;
            }

            int max, sm1, sm2;
            if (a > b && a > c) {
                max = a;
                sm1 = b;
                sm2 = c;
            } else if (b > a && b > c) {
                max = b;
                sm1 = a;
                sm2 = c;
            } else {
                max = c;
                sm1 = a;
                sm2 = b;
            }

            int result1 = max * max;
            int result2 = (sm1 * sm1) + (sm2 * sm2);

            if (result1 == result2) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

        
    }
}
