import java.util.ArrayList;
public class Butterfly extends PrintPattern {
    String character = "+ ";
    String space = "  ";
    String dash = "- ";
    int size;

    public Butterfly(int size) {
        this.size = size;
    }

    @Override
    public void printShape() {
        if (isValidInput(size) && isEven(size)) {
            StringBuilder butterfly = new StringBuilder();
            buildButterfly(size,butterfly);
            System.out.print(butterfly);
        }else{
            System.out.println("Invalid input");
        }
    }

    private void buildButterfly(int size,StringBuilder butterfly) {
        int half = size-1;
        ArrayList<String> upperWing = new ArrayList<>();

        // สร้างปีกบน
        for (int i = 0; i <= half; i++) {
            String TextCharacter = character.repeat(i + 1);
            String spaces = space.repeat(((half - i) * 2)+1);
            upperWing.add(TextCharacter + (i == half ? dash : spaces) + TextCharacter);
            butterfly.append(upperWing.get(i)).append("\n");
        }
        // ใช้แถวบนย้อนกลับเพื่อสร้างแถวล่าง
        for (int i = upperWing.size() - 2; i >= 0; i--) {
            butterfly.append(upperWing.get(i)).append("\n");
        }
    }
}