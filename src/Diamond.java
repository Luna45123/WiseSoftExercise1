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
        for (int i = -half; i <= half; i++) {
            int row = half - Math.abs(i);
            diamond.append(space.repeat(half - row))
                    .append(character.repeat(2 * row + 1))
                    .append("\n");
        }
    }
}