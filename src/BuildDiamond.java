import java.util.ArrayList;

public class BuildDiamond implements Builder {


    @Override
    public String buildShape(int size) {
        final String CHARACTER = "+ ";
        final String SPACE = "  ";
        int half = size / 2;
        StringBuilder diamond = new StringBuilder();
        ArrayList<String> upperPart = new ArrayList<>();
        for (int i = 0; i <= half; i++) {
            String line = SPACE.repeat(half - i) + CHARACTER.repeat(2 * i + 1);
            upperPart.add(line);
            diamond.append(line).append("\n");
        } // ใช้แถวบนย้อนกลับเพื่อสร้างแถวล่าง
        for (int i = upperPart.size() - 2; i >= 0; i--) { diamond.append(upperPart.get(i)).append("\n"); } return diamond.toString();
    }
}