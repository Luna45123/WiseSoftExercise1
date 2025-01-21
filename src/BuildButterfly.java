import java.util.ArrayList;

public class BuildButterfly implements Builder {
    @Override
    public String buildShape(int size) {
        final String CHARACTER = "+ ";
        final String SPACE = "  ";
        final String DASH = "- ";
        int half = size-1;
        ArrayList<String> upperWing = new ArrayList<>();
        StringBuilder butterfly = new StringBuilder();
        // สร้างปีกบน
        for (int i = 0; i <= half; i++) {
            String TextCharacter = CHARACTER.repeat(i + 1);
            String spaces = SPACE.repeat(((half - i) * 2)+1);
            upperWing.add(TextCharacter + (i == half ? DASH : spaces) + TextCharacter);
            butterfly.append(upperWing.get(i)).append("\n");
        }
        // ใช้แถวบนย้อนกลับเพื่อสร้างแถวล่าง
        for (int i = upperWing.size() - 2; i >= 0; i--) {
            butterfly.append(upperWing.get(i)).append("\n");
        }
        return butterfly.toString();
    }
}
