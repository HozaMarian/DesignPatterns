package lab4;

public class RightAlign implements AlignStrategy {
    @Override
    public void print(String text) {
        System.out.println("++++++++++" + text);
    }
}
