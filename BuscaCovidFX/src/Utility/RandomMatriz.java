package Utility;

import java.util.Random;

/**
 *
 * @author Serllet
 */
public class RandomMatriz {

    private int filas, columnas;
    private int tablero[][] = new int[filas][columnas];

    Random r = new Random();

    public RandomMatriz(int filas, int columnas) {
        this.columnas = columnas;
        this.filas = filas;
    }

    public int getFilas() {
        return filas;
    }

    public void setFilas(int filas) {
        this.filas = filas;
    }

    public int getColumnas() {
        return columnas;
    }

    public void setColumnas(int columnas) {
        this.columnas = columnas;
    }

    public int[][] getTablero() {
        return tablero;
    }

    public void setTablero(int[][] tablero) {
        this.tablero = tablero;
    }

    public int[][] randomVirus() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[filas][columnas] = (int) (Math.random());
                System.out.println((int) (Math.random()));
            }
            System.out.println();
        }

        return tablero;
    }

    public int[][] randomTablero() {

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                tablero[i][j] = 1;
                System.out.println((tablero[i][j]));
            }
            System.out.println();
        }

        return tablero;
    }
}
