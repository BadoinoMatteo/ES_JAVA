public class test {
    public static void main(String[] args) {
        Temperatura t = new Temperatura(20f);
        System.out.println(t.toString());
        System.out.println("In gradi Fahrenheit: " + t.getGradiF());
    }
}
