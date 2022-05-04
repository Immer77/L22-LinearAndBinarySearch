package soegningelevopgaver;

import java.util.ArrayList;

public class Soegning {

    // Opgave 1
    public boolean findUlige(int[] tabel) {
        int indeks = -1;
        int i = 0;
        while (indeks == -1 && i < tabel.length - 1) {
            int nummer = tabel[i];
            if (nummer % 2 != 0) {

                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    // her skriver du metoder til opgaverne 2,3,5,6 og 7
    // Opgave 2

    public int findHighestNumberCloseToFifteen(int[] tabel) {
        int indeks = -1;
        int i = 0;
        int result = -1;
        while (indeks == -1 && i < tabel.length) {
            int nummer = tabel[i];
            if (nummer > result && nummer <= 15 && nummer >= 10) {
                result = nummer;
            }

            i++;
        }
        return result;
    }

    // Opgave 3
    public boolean twoDuplicatesInARow(int[] tabel) {
        int indeks = -1;
        int i = 1;

        while (indeks == -1 && i < tabel.length) {
            if (tabel[i - 1] == tabel[i]) {
                return true;
            } else {
                i++;
            }
        }
        return false;
    }

    // Opgave 5
    public int calculateKvadratrodLinear(int n) {
        int r = 0;
        while (r < n) {
            if (Math.pow(r, 2) <= n && n < Math.pow((r + 1), 2)) {
                return r;
            } else {
                r++;
            }
        }
        return r;

    }

    public int calculateKvadratRodBinary(int n) {
        int r = 0;
        int left = 0;
        int right = n;
        while (left <= right) {
            r = (left + right) / 2;
            if (Math.pow(r, 2) <= n && n < Math.pow((r + 1), 2)) {
                return r;
            } else if (Math.pow(r, 2) > n) {
                right = r - 1;
            } else {
                left = r + 1;
            }

        }
        return r;
    }

    public int find(ArrayList<Integer> list, int n){
        int indeks = -1;
        int i = 0;
        while (indeks == - 1 && i < list.size()){
            int k = list.get(i);
            if(k == n){
                if (i > 0){
                    int numberSwitch = list.get(i -1);
                    list.set(i-1,n);
                    list.set(i,numberSwitch);
                    indeks = i - 1;
                }else{
                    list.set(i,n);
                    indeks = i;
                }

            }else{
                i++;
            }
        }
        return indeks;
    }
}
