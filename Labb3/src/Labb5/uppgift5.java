package Labb5;

import java.util.Random;

    public class uppgift5 {
        public static void meny() {
            System.out.println("Myran");
            System.out.println("=====");
            System.out.println();
        }

        public static int Myran() {
            Random rnd = new Random();

            int schakbrade[][] = new int[8][8];

            int x = rnd.nextInt(8);
            int y = rnd.nextInt(8);

            schakbrade[x][y] = 0;

            int steg = 0;
            int sammanstallning = 1;

            while(sammanstallning < 64) {
                int slump = rnd.nextInt(4) +1;
                switch (slump){
                    case 1:
                        if(x + 1 != 8){
                            x = x + 1;}
                        else steg--;
                        break;

                    case 2:
                        if(x - 1 != -1){
                            x = x - 1;}
                        else steg--;
                        break;

                    case 3:
                        if(y + 1 != 8){
                            y = y + 1;}
                        else steg--;
                        break;

                    case 4:
                        if(y - 1 != -1){
                            y = y - 1;}
                        else steg--;
                        break;
                    default:
                }
                steg++;
                if(schakbrade[x][y] != 1){
                    schakbrade[x][y] = 1;
                    sammanstallning += 1;
                }
                else
                    schakbrade[x][y] = 1;
            }
            return steg;
        }

        public static void main(String[] args) {
            meny();

            for (int i = 1; i <= 10 ; i++) {
                System.out.println("Antal steg i varv " + i + ": " + Myran());
            }
        }
    }
