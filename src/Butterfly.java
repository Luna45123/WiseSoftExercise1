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
        }
    }

    private void buildButterfly(int size,StringBuilder butterfly) {
        int half = (size / 2)+1;
        ArrayList<String> upperWing = new ArrayList<>();

        // สร้างปีกบน
        for (int i = 0; i <= half; i++) {
            String stars = character.repeat(i + 1);
            String spaces = space.repeat(((half - i) * 2)+1);
            upperWing.add(stars + (i == half ? dash : spaces) + stars);
        }

        // รวมปีกบน
        for (String line : upperWing) {
            butterfly.append(line).append("\n");
        }

        // รวมปีกล่าง (ยกเว้นบรรทัดสุดท้ายของปีกบน)
        for (int i = upperWing.size() - 2; i >= 0; i--) {
            butterfly.append(upperWing.get(i)).append("\n");
        }
    }
}