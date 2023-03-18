import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int row, col,count;
    String[][] tarla;
    int[][] userField;
    Scanner inp = new Scanner(System.in);
    Random rnd = new Random();

    MineSweeper(int row , int col){
        this.row = row;
        this.col = col;
        this.count = 0;
        this.tarla = new String[row][col];
        this.userField = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rnd.nextInt(100) < 25) { // mayin kapsama olasiliği .
                    this.tarla[i][j] = "*";
                }else {
                    this.tarla[i][j] = "-";
                    this.count++;
                }

            }
        }

        //System.out.println("mayin sayi:" + (row * col - this.count));

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                    this.userField[i][j] = -1;
            }
        }

    }

    void oyun(){
        System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz !");
        int satir,sutun,open; // Açilmiş konumlar.

        do {
            open = 0;
            for (int[] row : userField ) {
                for (int col: row ) {
                    if (col == -1) {
                        System.out.print(" -");
                    }else{
                        System.out.print(" " + col);
                        open++;
                    }
                }
                System.out.println(" ");
            }

            if (this.count == open) {
                kazandin();
                break;
            }

            System.out.print("Satir girin:");
            satir = inp.nextInt();
            System.out.print("Sutun girin:");
            sutun = inp.nextInt();

            satir--; sutun--;

            if (satir < this.row && sutun < this.col && satir >= 0 && sutun >= 0) {

                if (this.tarla[satir][sutun].equals("-")) {

                    tespit(satir,sutun);

                } else if (this.tarla[satir][sutun].equals("*")) {
                    gameOver();
                    break;
                }

            }else {
                System.out.println("Geçersiz Koordinat !");
                System.out.println("Satir Sayisi: " + this.row);
                System.out.println("Sutun Sayisi: " + this.col);

            }

            System.out.println("===========================");
        }while (true);

    }

    public void run() {
        oyun();
    }

    void kazandin(){
        System.out.println("\n==========================\n=== TEBRIKLER KAZANDIN ===\n==========================\n");
        gameMap();
    }
    void gameOver(){
        System.out.println("\n========================\n======  Game Over  =====\n========================\n");
        gameMap();
    }

    void tespit(int satir, int sutun){

        this.userField[satir][sutun] = 0 ;

        if (satir == 0) {
            if (sutun == 0) {
                //System.out.println("1.satir , 1.sutun"); // sol ust

                for (int i = satir ; i < 2; i++) {
                    for (int j = sutun; j < 2; j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            } else if (sutun < (this.tarla[sutun].length - 1)) {
                //System.out.println("1.satir , orta sutun"); // ust

                for (int i = satir; i <= (satir + 1) ; i++) {
                    for (int j = (sutun - 1); j <= (sutun + 1) ; j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }


            } else if (sutun == (this.tarla[sutun].length - 1)) {
                //System.out.println("1.satir , son sutun"); // sag ust

                for (int i = satir; i < 2; i++) {
                    for (int j = (sutun - 1); j < this.tarla[satir].length; j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            }
        } else if (satir < (this.tarla.length - 1)) {
            if (sutun == 0) {
                //System.out.println("orta.satir , 1.sutun"); // sol

                for (int i = (satir - 1); i <= (satir + 1) ; i++) {
                    for (int j = sutun; j <= (sutun + 1) ; j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            } else if (sutun < this.tarla[sutun].length - 1) {
                //System.out.println("orta.satir , orta sutun");

                for (int i = (satir - 1); i <= (satir+ 1) ; i++) {
                    for (int j = (sutun - 1) ; j <= (sutun + 1); j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            } else if (sutun == (this.tarla[sutun].length - 1)) {
                //System.out.println("orta.satir , son sutun"); // sag

                for (int i = (satir  - 1); i <= (satir + 1) ; i++) {
                    for (int j = (sutun - 1); j <= sutun; j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            }
        } else if (satir == (this.tarla.length - 1)) {
            if (sutun == 0) {
                //System.out.println("son.satir , 1.sutun"); // sol alt

                for (int i = (satir - 1 ) ; i < this.tarla.length; i++) {
                    for (int j = sutun; j < 2; j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            } else if (sutun < (this.tarla[sutun].length - 1)) {
                //System.out.println("son.satir , orta sutun"); // alt

                for (int i = (satir  - 1); i <= satir ; i++) {
                    for (int j = (sutun - 1); j <= (sutun + 1); j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            } else if (sutun == (this.tarla[sutun].length - 1)) {
                //System.out.println("son.satir , son.sutun"); // sag alt

                for (int i = (satir - 1); i < this.tarla.length; i++) {
                    for (int j = (sutun - 1); j < this.tarla[0].length; j++) {
                        if (this.tarla[i][j].equals("*")) {
                            this.userField[satir][sutun] += 1;
                        }
                    }
                }

            }
        }

    }

    void gameMap(){
        System.out.println("=====Mayin Haritasi=====");

        for (int i = 0; i < this.userField.length ; i++) {
            for (int j = 0; j < this.userField[i].length  ; j++) {
                if (this.tarla[i][j].equals("*")) {
                    System.out.print(" *");
                }else{
                    if (this.userField[i][j] != -1) {
                        System.out.print(" " + this.userField[i][j]);
                    }else {
                        System.out.print(" " + this.tarla[i][j]);
                    }

                }
            }
            System.out.println(" ");
        }

        System.out.println("========================");
    }

}
