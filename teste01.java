import java.util.Scanner;

public class teste01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] vet = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = sc.nextInt();
            }
            int max = vet[0];
            int min = vet[0];
            for (int i = 1; i < n; i++) {
                if (vet[i] > max) {
                    max = vet[i];
                }   
            }     
    }           
}