package day_12;

import java.util.ArrayList;
import java.util.List;

public class Rabin_karp_algorithm {

    public static List<Integer> rabinKarp(String text, String pattern) {
        int n = text.length();
        int m = pattern.length();
        List<Integer> matches = new ArrayList<>();

        if (m > n) {
            return matches;
        }

        int base = 256;
        int prime = 101;

        int patternHash = 0;
        int windowHash = 0;
        int h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * base) % prime;
        }

        for (int i = 0; i < m; i++) {
            patternHash = (base * patternHash + pattern.charAt(i)) % prime;
            windowHash = (base * windowHash + text.charAt(i)) % prime;
        }

        for (int i = 0; i <= n - m; i++) {
            if (patternHash == windowHash) {
                if (text.substring(i, i + m).equals(pattern)) {
                    matches.add(i);
                }
            }

            if (i < n - m) {
                windowHash = (base * (windowHash - text.charAt(i) * h) + text.charAt(i + m)) % prime;
                if (windowHash < 0) {
                    windowHash += prime;
                }
            }
        }

        return matches;
    }

    public static void main(String[] args) {
        String text = "aaaaab";
        String pattern = "aab";
        System.out.println(rabinKarp(text, pattern)); // [3]
    }
}