import java.util.ArrayList;
import java.util.List;

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
            List<String> upperWing = buildUpperWing(size);
            printButterfly(upperWing);
        }
    }


    private List<String> buildUpperWing(int size) {
        int half = size / 2;
        List<String> upperWing = new ArrayList<>();

        // สร้างปีกบน
        for (int i = 0; i <= half; i++) {
            String stars = character.repeat(i + 1);
            String spaces = space.repeat(((half - i) * 2)+1);
            if (i == half){
                upperWing.add(stars + dash + stars);
            }else {
                upperWing.add(stars + spaces + stars);
            }

        }

        return upperWing;
    }

    private void printButterfly(List<String> upperWing) {
        StringBuilder butterfly = new StringBuilder();

        // รวมปีกบน
        for (String line : upperWing) {
            butterfly.append(line).append("\n");
        }

        // รวมปีกล่าง (ยกเว้นบรรทัดสุดท้ายของปีกบน)
        for (int i = upperWing.size() - 2; i >= 0; i--) {
            butterfly.append(upperWing.get(i)).append("\n");
        }

        // พิมพ์ผีเสื้อทั้งหมดทีเดียว
        System.out.print(butterfly.toString());
    }
}