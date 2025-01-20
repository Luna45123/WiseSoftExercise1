import java.util.ArrayList;

public class Diamond extends PrintPattern {
    String character = "+ ";
    String space = "  ";
    StringBuilder diamond = new StringBuilder();

    ArrayList<String> upperPart = new ArrayList<>();

    public Diamond(int number) {
        super(number);
    }

    @Override
    public void printPattern(){
        if (isValidInput() && !isEven()) {
            int mid = (number / 2) + 1;
            for (int row = 0; row < number; row++) {
                if (row < mid) {
                    StringBuilder line = new StringBuilder();
                    line.append(printChars(space, (mid - row)-1));
                    line.append(printChars(character, 2 * row + 1));
                    upperPart.add(line.toString());
                    diamond.append(line).append("\n");
                } else {
                    for (int i = upperPart.size() - 2; i >= 0; i--) {
                        diamond.append(upperPart.get(i)).append("\n");
                    }
                    break;
                }

            }
        }
        print();
    }


    //ไว้เผื่อเอาไปทำอย่างอื่น
    private void print(){
        System.out.print(diamond.toString());
    }
}