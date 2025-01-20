import java.util.ArrayList;

public class Butterfly extends PrintPattern {
    String character = "+ ";
    String space = "  ";
    String dash = "- ";
    StringBuilder butterfly = new StringBuilder();
    ArrayList<String> upperPart = new ArrayList<>();
    public Butterfly(int number) {
        super(number);
    }

    @Override
    public void printPattern() {
        if (isValidInput() && isEven()) {
            int spaces = (2 * number) + 1;
            int numberOfPlus = 0;

            for (int i = 1; i <= 2 * number - 1; i++) {
                StringBuilder line = new StringBuilder();
                if (i <= number) {
                    spaces -= 2;
                    numberOfPlus++;
                } else {
                    for (int row = upperPart.size() - 2; row >= 0; row--) {
                        butterfly.append(upperPart.get(row)).append("\n");
                    }
                    break;
                }

                //Add character in to line StringBuilder
                line.append(printChars(character, numberOfPlus));

               //Add space or dash in to line StringBuilder
                if (i == number) {
                    line.append(printChars(dash, 1));
                } else {
                    line.append(printChars(space, spaces));
                }

                //Add character in to line StringBuilder (นำตัว line StringBuilder ก่อนหน้าไปใส่ต่อในตัวหลัง )
                line.append(line.toString().replace(dash, "").replace(space, ""));
                upperPart.add(line.toString());
                butterfly.append(line).append("\n");
            }

            print();

        } else {
            System.out.println("Input value is incorrect. Please enter it again.");
        }
    }
    //ไว้เผื่อเอาไปทำอย่างอื่น
    private void print(){
        System.out.print(butterfly.toString());
    }
}