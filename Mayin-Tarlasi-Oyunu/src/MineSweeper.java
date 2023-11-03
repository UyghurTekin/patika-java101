import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    private final int row, col, mine = -1, empty = -2, mineRate = 25;
    private int count = 0; // Boş konum Sayısı .
    private int[][] mineSweeper;
    Scanner inp = new Scanner(System.in);
    Random rnd = new Random();

    MineSweeper(int row, int col) {
        this.row = row;
        this.col = col;
        this.mineSweeper = new int[row][col];
    }

    public void run() {
        welcome();
        game();
    }

    private void game() {
        creatMap(this.row, this.col);

        int satir, sutun, open; // open = Açilmiş konum Sayısı.

         //gameMap(); // Oyunu ön izleme amaçlidir !

        do {
            open = 0;
            for (int[] row : mineSweeper) {
                for (int col : row) {
                    if (col == mine || col == empty) {
                        System.out.print("- ");
                    } else {
                        System.out.print(col + " "); // kordinat yazdirilir .
                        open++;
                    }
                }
                System.out.println();

            }

            if (this.count == open) { // mayın olmayan konumlarin bitip bitmediğinin kontrolünü sağlar .
                kazandin();
                break;
            }


            System.out.print("Satir girin:");
            satir = inp.nextInt(); // 6
            System.out.print("Sutun girin:");
            sutun = inp.nextInt();


            satir--; // 5 .
            sutun--; // 'Array.Langht' ile 'index' numrasi uyuşturma amaçlidir !

            if (satir < mineSweeper.length && sutun < mineSweeper[0].length && satir >= 0 && sutun >= 0) {

                if (this.mineSweeper[satir][sutun] == empty) {

                    tespit(satir, sutun);

                } else if (this.mineSweeper[satir][sutun] == mine) {
                    gameOver();
                    break; // do while
                } else {
                    System.out.println("Açilmiş Kordinat !");
                }

            } else {
                System.out.println("Geçersiz Kordinat !");
                System.out.println("Satir Sayisi: " + this.row);
                System.out.println("Sutun Sayisi: " + this.col);

            }

            System.out.println("==============================");

        } while (true);

    }

    private void creatMap(int row, int col) {
        // tarlaya mayın yerleştiriliyor...
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rnd.nextInt(100) < mineRate) { // mayin kapsama olasiliği .
                    this.mineSweeper[i][j] = mine; // -1
                } else {
                    this.mineSweeper[i][j] = empty;
                    this.count++;
                }
            }
        }
    }

    private void countMine(int i, int j, int row, int col) {
        if (this.mineSweeper[i][j] == mine) {
            this.mineSweeper[row][col] += 1;
        }
    }

    private void tespit(int satir, int sutun) {

        this.mineSweeper[satir][sutun] = 0;

        if (satir == 0) {
            if (sutun == 0) {
                //System.out.println("1.satir , 1.sutun"); // sol ust

                for (int i = satir; i < 2; i++) {
                    for (int j = sutun; j < 2; j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            } else if (sutun < (this.mineSweeper[satir].length - 1)) {
                //System.out.println("1.satir , orta sutun"); // ust

                for (int i = satir; i <= (satir + 1); i++) {
                    for (int j = (sutun - 1); j <= (sutun + 1); j++) {
                        countMine(i, j, satir, sutun);
                    }
                }


            } else if (sutun == (this.mineSweeper[satir].length - 1)) {
                //System.out.println("1.satir , son sutun"); // sag ust

                for (int i = satir; i < 2; i++) {
                    for (int j = (sutun - 1); j < this.mineSweeper[satir].length; j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            }
        } else if (satir < (this.mineSweeper.length - 1)) {
            if (sutun == 0) {
                //System.out.println("orta.satir , 1.sutun"); // sol

                for (int i = (satir - 1); i <= (satir + 1); i++) {
                    for (int j = sutun; j <= (sutun + 1); j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            } else if (sutun < this.mineSweeper[satir].length - 1) {
                //System.out.println("orta.satir , orta sutun");

                for (int i = (satir - 1); i <= (satir + 1); i++) {
                    for (int j = (sutun - 1); j <= (sutun + 1); j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            } else if (sutun == (this.mineSweeper[satir].length - 1)) {
                //System.out.println("orta.satir , son sutun"); // sag

                for (int i = (satir - 1); i <= (satir + 1); i++) {
                    for (int j = (sutun - 1); j <= sutun; j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            }
        } else if (satir == (this.mineSweeper.length - 1)) {
            if (sutun == 0) {
                //System.out.println("son.satir , 1.sutun"); // sol alt

                for (int i = (satir - 1); i < mineSweeper.length; i++) {
                    for (int j = sutun; j < 2; j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            } else if (sutun < (this.mineSweeper[satir].length - 1)) {
                //System.out.println("son.satir , orta sutun"); // alt
                for (int i = (satir - 1); i <= satir; i++) {
                    for (int j = (sutun - 1); j <= (sutun + 1); j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            } else if (sutun == (this.mineSweeper[satir].length - 1)) {
                //System.out.println("son.satir , son.sutun"); // sag alt

                for (int i = (satir - 1); i < this.mineSweeper.length; i++) {
                    for (int j = (sutun - 1); j < this.mineSweeper[0].length; j++) {
                        countMine(i, j, satir, sutun);
                    }
                }

            }
        }

    }

    private void gameMap() {
        System.out.println("========Mayin Haritasi========");

        for (int[] row : mineSweeper) {
            for (int col : row) {
                if (col == mine) {
                    System.out.print("* ");
                } else {
                    if (col == empty) {
                        System.out.print("- ");
                    } else {
                        System.out.print(col + " ");
                    }
                }
            }
            System.out.println(" ");
        }

        System.out.println("==============================");
    }

    private void welcome() {
        System.out.println("==============================");// 30
        System.out.println("     ====================");// 20
        System.out.println("    Welcome to MineSweeper");
        System.out.println("     ====================");
        System.out.println("==============================");
    }

    private void kazandin() {
        System.out.println("\n==============================\n===== TEBRIKLER KAZANDIN =====\n==============================\n");
        gameMap();
    }

    private void gameOver() {
        System.out.println("\n==============================\n======  Game Over  =====\n==============================\n");
        gameMap();
    }

}
