public class Test {
        public static void main(String[] args) {
            Libro a = new Libro("Capolavori", 200);
            Vocabolario b = new Vocabolario("Italiano", 100, 7000000);

            System.out.println(a.pageMessage());
            System.out.println();
            System.out.println(b.definitionMessage());

        }
    }

