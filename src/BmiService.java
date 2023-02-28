public class BmiService {
    public int calculate(int mass, int height) {
        int quatroHeight;
        int index;
        quatroHeight = height * height;
        index = mass / quatroHeight;
        return index;


    }
}
