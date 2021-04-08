public class Kvadrat {
        public static void main(String[] args) {
            RandomCha('*', 6);
        }

        public static void RandomCha(char ch, int number) {
            for (int i = 1; i <= number; i++) {
                for (int j = 1; j <= number; j++) {
                    System.out.print(ch);
                    System.out.print("  ");
                }
                System.out.println();
            }
        }
    }

