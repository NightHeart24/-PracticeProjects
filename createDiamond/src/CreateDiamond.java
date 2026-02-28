public class CreateDiamond {

    private String[][] dreieck = new String[5][5];
    private int size = 5;

    public void makeTriangle() {
        createTriangle();

        String[][] topLeft = createTopLeft();
        String[][] topRight = createTopRight();

        printTopHalf(topLeft, topRight);

        String[][] bottomLeft = createBottomLeft();
        String[][] bottomRight = createBottomRight();

        printBottomHalf(bottomLeft, bottomRight);

    }

    private void createTriangle() {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= j) {
                    dreieck[i][j] = "#";
                } else {
                    dreieck[i][j] = ".";
                }
            }
        }
    }

    public void printTopHalf(String[][] createTopLeft, String[][] createTopRight) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) System.out.print(createTopLeft[i][j]);
            for (int j = 0; j < size; j++) System.out.print(createTopRight[i][j]);
            System.out.println();
        }


    }

    public void printBottomHalf(String[][] bottomLeft, String[][] bottomRight) {

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) System.out.print(bottomLeft[i][j]);
            for (int j = 0; j < size; j++) System.out.print(bottomRight[i][j]);
            System.out.println();
        }
    }




    public String[][] createTopLeft() {
        String[][] topLeft = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= size - 1 - j) {
                    topLeft[i][j] = "#";
                } else {
                    topLeft[i][j] = ".";
                }
            }
        }
        return topLeft;
    }

    public String[][] createBottomRight() {
        String[][] bottomRight = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= size - 1 - j) {
                    bottomRight[i][j] = "#";
                } else {
                    bottomRight[i][j] = ".";
                }
            }
        }
        return bottomRight;
    }

    public String[][] createBottomLeft() {
        String[][] bottomLeft = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i <= j) {
                    bottomLeft[i][j] = "#";
                } else {
                    bottomLeft[i][j] = ".";
                }
            }
        }
        return bottomLeft;
    }

    public String[][] createTopRight() {
        String[][] topRight = new String[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i >= j) {
                    topRight[i][j] = "#";
                } else {
                    topRight[i][j] = ".";
                }
            }
        }
        return topRight;
    }


}
