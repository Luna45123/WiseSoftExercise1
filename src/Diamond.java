import java.util.ArrayList;

public class Diamond extends PrintPattern{
    String character = "+ ";
    String space = "  ";
    int size;

    public Diamond(int size) {
        this.size = size;
    }

    @Override
    public void printShape() {
        if (isValidInput(size) && !isEven(size)) {
            StringBuilder diamond = new StringBuilder();
            buildDiamond(size, diamond);
            System.out.print(diamond);
        }else{
            System.out.println("Invalid input");
        }
    }

    private void buildDiamond(int size, StringBuilder diamond) {
        int half = size / 2;
        ArrayList<String> upperPart = new ArrayList<>();
        for (int i = 0; i <= half; i++) {
            String line = space.repeat(half - i) + character.repeat(2 * i + 1);
            upperPart.add(line);
            diamond.append(line).append("\n");
        }
        // ใช้แถวบนย้อนกลับเพื่อสร้างแถวล่าง
        for (int i = upperPart.size() - 2; i >= 0; i--) diamond.append(upperPart.get(i)).append("\n");
    }
}