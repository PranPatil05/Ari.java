package Constructor;

public class ContChaning {

        int i;
        String s;

        public ContChaning() {
            System.out.println("in A's default constructor!!");
        }

        public ContChaning(int n) {
            this("ABC");
            System.out.println("in A's int i constructor!!");
            this.i = n;
        }

        public ContChaning(String nm) {
            System.out.println("in A's String s constructor!!");
            this.s = nm;
        }

        public ContChaning(int i, String j) {
            System.out.println("in A's int i and String s constructor!!");
            this.i = i;
            this.s = j;
        }

        public static void main(String[] args) {
            ContChaning a = new ContChaning(10, "Abc");
            ContChaning b = new ContChaning(20);
            b.s="Pranav";
            System.out.println(a);
            System.out.println(b.i);
            System.out.println(b.s);

            System.out.println(a.i);
            System.out.println(a.s);

        }
    }

