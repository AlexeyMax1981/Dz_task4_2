public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int myMass = 92;
        int myHeight = 2;
        int index = service.calculate(myMass, myHeight);
        System.out.println("Индекс моего тела = " + index);

    }
}
